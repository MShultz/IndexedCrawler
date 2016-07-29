import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Visitor implements Traversal {
	String hashedIndexFile = "Indexed.bin";
	URL currentUrl;
	String pattern = "(<.*>)?(?<Content>([^\\/<])+)(<\\/.*>)?";
	Pattern wordPattern;
	WordIndex index;

	public Visitor() {
		wordPattern = Pattern.compile(pattern);
		index = new WordIndex(hashedIndexFile);
	}

	@Override
	public void getURL(URL url) {
		currentUrl = url;

	}

	@Override
	public void getLine(String line) {
		addWordsToIndex(getWords(line));
	}

	private String[] getWords(String line) {
		Matcher match = wordPattern.matcher(line);
		match.find();
		String text = match.group("Content");
		text = text.replaceAll("[,!.]", " ").trim();
		return text.split("\\s+");

	}
	private void addWordsToIndex(String[] words){
		for(String s: words){
			index.add(s, currentUrl.toString());
		}
	}
}
