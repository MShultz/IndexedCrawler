import java.util.Iterator;
import java.util.Scanner;

public class UserInterface {
	Scanner scan;
	WordIndex cache;

	public UserInterface(String indexName) {
		scan = new Scanner(System.in);
		cache = new WordIndex(indexName);
	}

	public void searchEngine() {
		boolean exit = false;
		System.out.println("Hello! Welcome to Doogle.");
		while (!exit) {
			String userInput = promptUser();
			exit = userInput.equalsIgnoreCase("X");
			if (!exit) {
				printResults(userInput);
			}
		}
		System.out.println("Goodbye!");
		cache.close();
	}

	private String promptUser() {
		System.out.println("Please input the word you would like to search. If you would like to exit, please input X");
		return scan.nextLine();
	}

	private void printResults(String userInput) {
		Iterator<UrlEntry> inputUrls = cache.getUrls(userInput);
		System.out.println("Your Word: " + userInput);
		if (inputUrls.hasNext()) {
			do {
				UrlEntry currentUrl = inputUrls.next();
				System.out.println("Site Url: " + currentUrl.getUrl());
				System.out.println("Count: " + currentUrl.getCount());
			} while (inputUrls.hasNext());
		}else{
			System.out.println("Your word came up with no results.");
		}
		System.out.println("-------------------------------");
	}
}
