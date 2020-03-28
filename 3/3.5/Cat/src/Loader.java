
public class Loader {
    public static void main(String[] args) {
        Cat begemot = new Cat();
        System.out.println(Cat.getCount());
        printWeight(begemot, "begemot");
        printStat(begemot, "begemot");
        int i = 0;
        do {
            i++;
            begemot.meow();
            if (i % 3 == 0)
                begemot.feed(300. * i);
            if (i % 2 == 0)
                begemot.drink(200.);
            if (i % 4 == 0)
                begemot.going2Wc();
            printWeight(begemot, "begemot");
            printStat(begemot, "begemot");
            printEatingWeight(begemot, "begemot");
            System.out.println(Cat.getCount());
        } while (Cat.getCount() > 0);

        Cat citty =getCitten();

        printWeight(citty, "citty");
        printStat(citty, "citty");
        printEatingWeight(citty, "citty");
        System.out.println(Cat.getCount());

    }
static Cat getCitten(){
        return new Cat(100+100*Math.random());
}
    static void printStat(Cat cat, String nameCat) {
        System.out.println(nameCat + " state: " + cat.getStatus());
    }

    static void printWeight(Cat cat, String nameCat) {
        System.out.println(nameCat + " weight: " + cat.getWeight());
    }

    static void printEatingWeight(Cat cat, String nameCat) {
        System.out.println(nameCat + " eating weight: " + cat.getEatingWeight());
    }
}