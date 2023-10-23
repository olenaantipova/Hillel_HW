package HW13;

import java.util.HashSet;

public class UnitedHashSets {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Anna");
        set1.add("Marta");
        set1.add("Lucia");
        set1.add("Karolina");
        set1.add("Gertruda");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Mark");
        set2.add("Max");
        set2.add("Alex");
        set2.add("John");
        set2.add("Elvis");

        HashSet<String> unitedSet = new HashSet<>(set1);
        unitedSet.addAll(set2);

        System.out.println("United Hash Set is: " + unitedSet);

    }
}
