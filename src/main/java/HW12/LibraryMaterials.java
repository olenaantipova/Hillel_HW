package HW12;

abstract class LibraryMaterials {
    private String title;
    private String countryOrigin;
    private String author;
    private int year;

    public LibraryMaterials(String title, String countryOrigin, String author, int year) {
        this.title = title;
        this.countryOrigin = countryOrigin;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public abstract String getMaterialType();

    public abstract void add(LibraryMaterials material);
}
