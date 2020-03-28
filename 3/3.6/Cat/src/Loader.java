
public class Loader {
    public static void main(String[] args) {
        Cat begemot = new Cat();
        System.out.println(Cat.getCount());
        printWeight(begemot, "begemot");
        printStat(begemot, "begemot");
        Cat twin =Cat.createTwin(begemot);
        begemot.feed(1000.);
        printWeight(begemot, "begemot");
        printStat(begemot, "begemot");
        printWeight(twin, "twin");
        printStat(twin, "twin");
        System.out.println(Cat.getCount());

    }

    static void printStat(Cat cat, String nameCat) {
        System.out.println(nameCat + " state: " + cat.getStatus());
    }

    static void printWeight(Cat cat, String nameCat) {
        System.out.println(nameCat + " weight: " + cat.getWeight());
    }


}