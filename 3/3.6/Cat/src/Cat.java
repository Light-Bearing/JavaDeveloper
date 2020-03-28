
public class Cat {
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    private Double weightEatingFood = 0.;
    private static Integer count = 0;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        originWeight = this.weight;
        minWeight = 100.0;
        maxWeight = 9000.0;
        count++;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weightEatingFood += amount;
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getEatingWeight() {
        return weightEatingFood;
    }

    public Double going2Wc() {
        weight = weight - weight / 20;
        System.out.println("I`m finish!");
        return weight;
    }

    public static Cat createTwin(Cat cat) {
        Cat twinCat = new Cat(cat.getWeight());
        twinCat.minWeight = 1000.0;
        twinCat.weightEatingFood = cat.getEatingWeight();
        return twinCat;
    }

    public static Integer getCount() {
        return count;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}