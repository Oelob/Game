package Game;

public class Gifts{

    protected int id;
    protected String name;
    protected int count;
    protected double weigh;

    public Gifts (int id, String name, int count, double weigh) {
        this.id = id;
        this.name = name; 
        this.count = count;
        this.weigh = weigh;
    }

    public String getName(){
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getCount() {
        return this.count;
    }

    public double getWeigh() {
        return this.weigh;
    }
    
    @Override
    public String toString() {
        return String.format("Игрушка:\n  ID - %d\n  Name - %s\n  Count - %d\n  Weigh - %.2f%%", 
        this.id, this.name, this.count, this.weigh);
    }

}