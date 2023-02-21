import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        FileHandler fileHandler = new FileHandler();
        Tree tree = fileHandler.readFile("seminar2/homework2/tree/tree.out");
        // Tree tree = new Tree();
        // Human h1 = new Human("Дмитрий", 1945, 12, 21, "М");
        // Human h2 = new Human("Антонина", 1948, 7, 1, "Ж");
        // h1.addCommunication(h2, TypeCommunication.WIFE);
        // h2.addCommunication(h1, TypeCommunication.HUSBAND);
        // Human h3 = new Human("Мария", 1965, 8, 10, "Ж");
        // h3.addCommunication(h1, TypeCommunication.FATHER);
        // h3.addCommunication(h2, TypeCommunication.MOTHER);
        // h1.addCommunication(h3, TypeCommunication.DAUGHTER);
        // h2.addCommunication(h3, TypeCommunication.DAUGHTER);
        // Human h4 = new Human("Павел", 1968, 1, 19, "М");
        // h4.addCommunication(h1, TypeCommunication.FATHER);
        // h4.addCommunication(h2, TypeCommunication.MOTHER);
        // h1.addCommunication(h4, TypeCommunication.SON);
        // h2.addCommunication(h4, TypeCommunication.SON);
        // tree.addHuman(h1);
        // tree.addHuman(h2);
        // tree.addHuman(h3);
        // tree.addHuman(h4);
        // Human h5 = new Human("Аркадий", 1915, 1, 1, "М");
        // Human h6 = new Human("Виолетта", 1918, 11, 11, "Ж");
        // h5.addCommunication(h6, TypeCommunication.WIFE);
        // h6.addCommunication(h5, TypeCommunication.HUSBAND);
        // h1.addCommunication(h5, TypeCommunication.FATHER);
        // h1.addCommunication(h6, TypeCommunication.MOTHER);
        // h5.addCommunication(h1, TypeCommunication.SON);
        // h6.addCommunication(h1, TypeCommunication.SON);
        // tree.addHuman(h5);
        // tree.addHuman(h6);
        // Human h7 = new Human("Владимир", 1916, 10, 5, "М");
        // Human h8 = new Human("Ольга", 1917, 9, 9, "Ж");
        // h7.addCommunication(h8, TypeCommunication.WIFE);
        // h8.addCommunication(h7, TypeCommunication.HUSBAND);
        // h2.addCommunication(h7, TypeCommunication.FATHER);
        // h2.addCommunication(h8, TypeCommunication.MOTHER);
        // h7.addCommunication(h2, TypeCommunication.DAUGHTER);
        // h8.addCommunication(h2, TypeCommunication.DAUGHTER);
        // tree.addHuman(h7);
        // tree.addHuman(h8);
        // Human h9 = new Human("Андрей", 1990, 1, 1, "М");
        // h9.addCommunication(h3, TypeCommunication.MOTHER);
        // h3.addCommunication(h9, TypeCommunication.SON);
        // tree.addHuman(h9);

        for (Human h : tree) {
            System.out.println(h);
        }
        System.out.println();

        /* 
        System.out.println("Бабушки/дедушки:");
        System.out.println("- со стороны отца:");
        h3.getFather().showParents();
        System.out.println("- со стороны матери:");
        h3.getMother().showParents();
        System.out.println();
        
        System.out.println("Родители:");
        h3.showParents();
        h3.showSiblings();
        
        h2.showKids();
        */
        
        fileHandler.writeFile("seminar2/homework2/tree/tree.out", tree);
    }

}