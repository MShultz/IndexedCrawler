
public class Main {

	public static void main(String[] args) {
		WordIndex.initialize("src/Indexed.bin", 30);
		WebTraversal crawl = new WebTraversal("https://www.neumont.edu", 25);
		crawl.traverseWeb();

	}

}
//http://shalladay-IIs1.neumont.edu			https://www.neumont.edu