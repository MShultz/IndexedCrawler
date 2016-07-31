
public class Main {

	public static void main(String[] args) {
		//Traverses Web
		String fileName = "src/Indexed.bin";
		WordIndex.initialize(fileName, 30);
		WebTraversal crawl = new WebTraversal("https://www.neumont.edu", 2);
		crawl.traverseWeb();
		//Searches for user
		UserInterface ui = new UserInterface(fileName);
		ui.searchEngine();
		//Delete the index.
	//	WordIndex.delete(fileName);
		
		

	}

}
//http://shalladay-IIs1.neumont.edu			https://www.neumont.edu