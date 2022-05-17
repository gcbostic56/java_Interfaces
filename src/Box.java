import java.util.ArrayList;

public class Box implements Packable {
    
    private ArrayList<Packable> box;
    private double maxWeight;
    private double totalweight;
    private int items;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<>();
        this.totalweight = 0;
        this.items = 0;
    }
    @Override
    public double weight() {
        return totalweight;
    }
    public void add(Packable x) {
    if (x.weight() + totalweight <= maxWeight) { 
        this.box.add(x);
        totalweight += x.weight();
        items ++;
    }
    else {
        System.out.println("Aye yo the box is full.");
    }

}
    public String toString() {
        return "Box: " +items+ " items, total weight " +totalweight+ "kgs";
    }
}
