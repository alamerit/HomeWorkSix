import java.io.IOException;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {
        final int v = 100;
        Random random = new Random();
        // for (int i = 0; i <1000000 ; i++) {
        for (int i = 0; i < 100; i++) {

            Tree theTree = new Tree();
            theTree.insert(new Person("Планеты", random.nextInt(200) - v, 1));
            theTree.insert(new Person("Атмосферы", random.nextInt(200) - v, 2));
            theTree.insert(new Person("Солнце", random.nextInt(200) - v, 3));
            theTree.insert(new Person("Моря", random.nextInt(200) - v, 4));
            theTree.insert(new Person("Жывое", random.nextInt(200) - v, 5));
            theTree.insert(new Person("Человек", random.nextInt(200) - v, 6));
            theTree.insert(new Person("Отдахнул на", random.nextInt(200) - v, 7));
            System.out.println("Теория создания Мира " + i);

            theTree.displayTree();
            System.out.println("\n");
        }
    }
}
