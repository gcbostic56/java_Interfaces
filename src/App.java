import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static int returnSize(List<String> thing) {
        return thing.size();
    }
    public static int returnSizeMap(Map<String, String> otherthing) {
        return otherthing.size();
    }
    public static void main(String[] args) throws Exception {

        // BOX EXERCISE
        // Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        // Book book2 = new Book("Robert Martin", "Clean Code", 1);
        // Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
    
        // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        
        // System.out.println(book1.toString());
        // System.out.println(book2.toString());
        // System.out.println(book3.toString());
        // System.out.println(cd1);
        // System.out.println(cd2);
        // System.out.println(cd3);

        // Box box = new Box(10);

        // box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        // box.add(new Book("Robert Martin", "Clean Code", 1));
        // box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        // box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        // box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        // box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        // System.out.println(box);

        // Box newBox = new Box(20);
        // Box otherBox = new Box(30);
        // Box finalBox = new Box(60);

        // newBox.add(new Book("Jane", "Diary of Jane", 5));
        // newBox.add(new Book("Stinky", "Diary of Stinky", 6));
        // newBox.add(new Book("Colin", "Diary of Colin", 8));

        // otherBox.add(new CD("LisShena", "CTAC Nugget", 2023));
        // otherBox.add(new Book("Matt", "History of Being A Master Coder", 20));

        // finalBox.add(otherBox);
        // finalBox.add(newBox);

        // System.out.println(finalBox);
        // ARRAY LIST RETURN SIZE
        // List<String> names = new ArrayList<>();
        // names.add("First");
        // names.add("Second");
        // names.add("Third");

        // System.out.println(returnSize(names));

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSizeMap(names));
    }
}
