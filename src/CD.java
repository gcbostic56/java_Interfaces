public class CD implements Packable {
    private String artist;
    private String cdName;
    private int year;
    private double weight;

    public CD(String artist, String cdName, int year) {
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
        this.weight = 0.1;
    }
    @Override
    public double weight() {
       return this.weight;
    }
    public String toString() {
        return "The artist is "+artist+ " and the CD Name is " +cdName+ " and the year is and the weight is "+weight+ "kgs";
    }
    
}
