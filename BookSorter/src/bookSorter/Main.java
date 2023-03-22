package bookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<>();
		
		Book book1 = new Book("Anna Karenina", 1062, "Lev Nikolayevich Tolstoy", 1877);
		Book book2 = new Book("Crime And Punishment", 687, "Dostoyevski", 1866);
		Book book3 = new Book("Jonathan Livingston Seagull", 144, "Richard Bach", 1970);
		Book book4 = new Book("Harry Potter", 623, "J.K. Rowling" ,1997);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		for (Book name: books) {
			System.out.println("The Book Name: " + name.getName());
			System.out.println("The Book Page Number: " + name.getNumberOfPage());
			System.out.println("The Author Name: " + name.getAuthorName());
			System.out.println("The Book Release Date: " + name.getReleaseDate());
			System.out.println();
		}
		
		System.out.println();
		
		TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book name1, Book name2) {
				return name1.getNumberOfPage() - name2.getNumberOfPage();
			}

		});
		
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println();
		
		books2.addAll(books);
		
		for(Book name: books2) {
			System.out.println("The Book Name: " + name.getName());
			System.out.println("The Book Page Number: " + name.getNumberOfPage());
			System.out.println("The Author Name: " + name.getAuthorName());
			System.out.println("The Book Release Date: " + name.getReleaseDate());
			System.out.println();
		}

	}

}
