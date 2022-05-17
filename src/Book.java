public class Book implements Packable {

    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    // public void display() {
    //     System.out.println(author + " " + title + " " +weight);
    // }
    public String toString() {
        return "The author is "+author+ " and the title is " +title+ " and the weight is "+weight+ "kgs";
    }
    
}
