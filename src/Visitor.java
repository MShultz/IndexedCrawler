import java.net.URL;

public class Visitor implements Traversal {
	URL currentUrl;
	String currentLine;

	@Override
	public void getURL(URL url) {
		currentUrl = url;
		
	}

	@Override
	public void getLine(String line) {
		currentLine = line;
	}

}
