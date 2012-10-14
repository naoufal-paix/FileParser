package ma.dosi06.parser;

public interface ContentHandler {
	
	public void defaultLine(String content);
	public void commentLine(String comment);

}
