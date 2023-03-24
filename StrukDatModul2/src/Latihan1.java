import java.util.ArrayList;
import java.util.Iterator;

public class Latihan1 {

    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : " + Hewan);

        ArrayList<String> Deletehewan = new ArrayList<>();
        Deletehewan.add("Kelinci");
        Deletehewan.add("Kambing");
        Deletehewan.add("Unta");
        System.out.println("Hewan Yang Dihapus : " + Deletehewan);

        Iterator<String> iterator = Hewan.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            if (i == "Kelinci") {
                iterator.remove();
            } else if (i == "Kambing") {
                iterator.remove();
            } else if (i == "Unta") {
                iterator.remove();
            }
        }
        System.out.println("Output hewan : " + Hewan);
    }
}