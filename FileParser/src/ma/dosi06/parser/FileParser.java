package ma.dosi06.parser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileParser {
	
	public void parse(File file, ContentHandler handler) throws IOException {
		FileInputStream fis= new FileInputStream(file);
		DataInputStream dis= new DataInputStream(fis);
		BufferedReader br= new BufferedReader(new InputStreamReader(dis));
		String lineEntry;
		while((lineEntry= br.readLine())!= null) {
			if (lineEntry.charAt(0)== '#') handler.commentLine(lineEntry);
			else handler.defaultLine(lineEntry);				
		}
	}

}
