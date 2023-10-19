package HW12;

import java.awt.print.Book;

class Books extends LibraryMaterials implements Borrowable {
    private Genre genre;

    public Books(String title, String countryOrigin, String author, int year, Genre genre) {
        super(title, countryOrigin, author, year);
        this.genre = genre;
    }

    @Override
    public void lendingMaterials() {
        System.out.println("Book " + getTitle() + "is lent");
    }

    @Override
    public void returnMaterials() {
        System.out.println("Book " + getTitle() + "is returned");
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String getMaterialType() {
        return "Book";
    }

    @Override
    public void add(LibraryMaterials material) {
    }
}
