package HW12;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryMaterials> material = new ArrayList<>();

    public void addMaterials(LibraryMaterials material) {
        material.add(material);
    }

    public void searchMaterials(String keyword) {
        for (LibraryMaterials materials : material) {
            if (materials.getTitle().contains(keyword)) {
                System.out.println(materials.getMaterialType() + ": " + materials.getTitle() + "by " + materials.getAuthor());
            }
        }
    }
}
