package HW12;

class Audiobooks extends LibraryMaterials implements Borrowable {
    private String narrator;

    public Audiobooks(String title, String countryOrigin, String author, int year, String narrator) {
        super(title, countryOrigin, author, year);
        this.narrator = narrator;
    }

    public String getNarrator() {
        return narrator;
    }

    @Override
    public String getMaterialType() {
        return "Audiobook";
    }

    @Override
    public void add(LibraryMaterials material) {
    }

    @Override
    public void lendingMaterials() {
        System.out.println("Audiobook " + getTitle() + "is lent");
    }

    @Override
    public void returnMaterials() {
        System.out.println("Audiobook " + getTitle() + "is returned");
    }
}
