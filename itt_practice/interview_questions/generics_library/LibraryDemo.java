package generic_library;

import java.util.ArrayList;
import java.util.List;

public class LibraryDemo{

	public static <U> void fillLib(U u, List<Library<U>> libs) {
		Library<U> lib = new Library<>();
		lib.set(u);
		libs.add(lib);
	}

	public static <U> void outputLib(List<Library<U>> libs) {
		// int counter = 0;
		for (Library<U> lib : libs) {
			U libContent = lib.get();
			System.out.println("Library contains " + libContent.toString());
			// counter++;
		}

	}
	
	public static void main(String[] args) {

		Book book = new Book("Pesho", "Pesho's book", 2000);
		Video video = new Video();
		Newspaper paper = new Newspaper();

		List<Library<Book>> listOfBooks = new ArrayList<>();
		List<Library<Video>> listOfVideo = new ArrayList<>();
		List<Library<Newspaper>> listOfPaper = new ArrayList<>();
		LibraryDemo.fillLib(book, listOfBooks);
		LibraryDemo.fillLib(video, listOfVideo);
		LibraryDemo.fillLib(paper, listOfPaper);
		LibraryDemo.outputLib(listOfBooks);
	}

}
