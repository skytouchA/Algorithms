package Ch1_2;

public class Count
{
    private String name;
    private int count;

    public Count(String name) {
        this.name = name;
        count = 0;
    }

    public void increment(){
        count++;
    }

    public int tally() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return tally() + " " + getName();
    }
}
