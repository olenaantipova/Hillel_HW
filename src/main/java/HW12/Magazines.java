package HW12;

public class Magazines extends LibraryMaterials implements Borrowable {
    private String issue;

    public Magazines(String title, String countryOrigin, String author, int year, String issue) {
        super(title, countryOrigin, author, year);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public String getMaterialType() {
        return "Magazine";
    }

    @Override
    public void add(LibraryMaterials material) {
    }

    @Override
    public void lendingMaterials() {
        System.out.println("Magazine " + getTitle() + "is lent");
    }

    @Override
    public void returnMaterials() {
        System.out.println("Magazine " + getTitle() + "is returned");
    }
}
