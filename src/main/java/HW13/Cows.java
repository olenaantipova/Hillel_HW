package HW13;

import java.util.HashMap;

public class Cows {
    private String name;

    public Cows(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cows{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        HashMap<String, Cows> cowHashMap = new HashMap<>();
        cowHashMap.put("Arcobalena", new Cows("Arcobalena"));
        cowHashMap.put("Maya", new Cows("Maya"));
        cowHashMap.put("Mirabella", new Cows("Mirabella"));
        cowHashMap.put("Maximiliana", new Cows("Maximiliana"));
        cowHashMap.put("Aurora", new Cows("Aurora"));
        cowHashMap.put("Marta", new Cows("Marta"));
        cowHashMap.put("Greta", new Cows("Greta"));
        cowHashMap.put("Fregatta", new Cows("Fregatta"));
        cowHashMap.put("Lucia", new Cows("Lucia"));
        cowHashMap.put("Olvia", new Cows("Olvia"));

        for (String key : cowHashMap.keySet()) {
            Cows cows = cowHashMap.get(key);
            System.out.println(key + " - " + cows);
        }
    }
}
