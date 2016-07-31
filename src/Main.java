
public class Main {

	public static void main(String[] args) {
		//Traverses Web
		String fileName = "../Index Search/src/Indexed.bin";
		WordIndex.initialize(fileName, 30);
		WebTraversal crawl = new WebTraversal("http://shalladay-IIs1.neumont.edu", 30);
		crawl.traverseWeb();
	}
}
//http://shalladay-IIs1.neumont.edu			https://www.neumont.edu