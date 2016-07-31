
public class Main {

	public static void main(String[] args) {
		String fileName = "src/Indexed.bin";
		WordIndex.initialize(fileName, 30);
		WebTraversal crawl = new WebTraversal("https://www.neumont.edu", 25);
		crawl.traverseWeb();
		
		UserInterface ui = new UserInterface(fileName);
		ui.searchEngine();
		
		

	}

}
//http://shalladay-IIs1.neumont.edu			https://www.neumont.edu