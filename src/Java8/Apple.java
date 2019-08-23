package Java8;

public class Apple {
    private int id;
    private String color;
    private double cost;
    private int weight;

    public Apple(int id, String color,double cost,int weight) {
        this.color = color;
        this.id = id;
        this.cost = cost;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "id: "+getId()+", color:" +getColor()+ ",cost:"+getColor()+", weight:"+getWeight();
    }
}
