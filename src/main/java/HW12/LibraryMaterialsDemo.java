package HW12;

import java.awt.print.Book;

public class LibraryMaterialsDemo {
    public static void main(String[] args) {
        Books book1 = new Books("Gone with a wind", "USA", "Margaret Mitchell", 1936, Genre.NOVEL);
        Magazines magazine1 = new Magazines("Times", "USA", "Different", 2023, "September 2023");
        Audiobooks audiobook1 = new Audiobooks("The Hobbit", "USA", "J.R.R.Tolkien", 1937, "Mike Hoggins");

        Library library = new Library();
        library.addMaterials(book1);
        library.addMaterials(magazine1);
        library.addMaterials(audiobook1);

        System.out.println("Book " + book1.getAuthor());
        System.out.println("Magazine " + magazine1.getIssue());
        System.out.println("Audiobook " + audiobook1.getNarrator());

        System.out.println("Search results for 'the':");
        library.searchMaterials("the");
    }
}
