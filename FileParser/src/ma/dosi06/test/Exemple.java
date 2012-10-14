package ma.dosi06.test;

import java.io.File;
import java.io.IOException;

import ma.dosi06.parser.ContentHandler;
import ma.dosi06.parser.FileParser;

public class Exemple implements ContentHandler {
	
	public static int nbRows= 0, nbComment= 0;

	public static void main(String[] args) {
		FileParser parser= new FileParser();
		try {
			File file= new File(args[0]);
			parser.parse(file, new Exemple());
			System.out.println("Le fichier "+ file.getName()+ " contient "+ nbRows+ 
					" ligne(s) dont "+ nbComment+ " de commentaires.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void defaultLine(String content) {
		nbRows++;
	}

	@Override
	public void commentLine(String comment) {
		nbRows++;
		nbComment++;
	}

}
