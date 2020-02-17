
public class Loader
{
    public static void main(String[] args)
    {
        Cat begemot = new Cat();
        Cat barsik = new Cat();
        Cat murzik = new Cat();
        Cat vasya = new Cat();
        Cat marusa = new Cat();
        Cat zuxel = new Cat();
        Cat motroskin = new Cat();

        printWeight(begemot,"begemot");
        printStat(begemot,"begemot");
        begemot.drink(1.);
        printWeight(begemot,"begemot");
        printStat(begemot,"begemot");

        printWeight(barsik,"barsik");
        printStat(barsik,"barsik");
        barsik.feed(1000000.);
        printWeight(barsik,"barsik");
        printStat(barsik,"barsik");

        printStat(murzik,"murzik");
        printWeight(murzik,"murzik");
        murzik.meow();
        printStat(murzik,"murzik");
        printWeight(murzik,"murzik");


        printStat(vasya,"vasya");
        printWeight(vasya,"vasya");

        printStat(motroskin,"motroskin");
        printWeight(motroskin,"motroskin");
        motroskin.drink(200.);
        motroskin.feed(200.);
        motroskin.meow();
        printStat(motroskin,"motroskin");
        printWeight(motroskin,"motroskin");

        printStat(marusa, "marusa");
        printWeight(marusa,"marusa");
        while (!marusa.getStatus().equals("Exploded")) {
            marusa.feed(100.);
            printStat(marusa, "marusa");
            printWeight(marusa,"marusa");
        }

        printStat(zuxel,"zuxel");
        printWeight(zuxel,"zuxel");
        while (!zuxel.getStatus().equals("Dead")) {
            zuxel.meow();
            printStat(zuxel,"zuxel");
            printWeight(zuxel,"zuxel");
        }
        vasya.drink(10000.);
        printStat(vasya,"vasya");
        printWeight(vasya,"vasya");
    }

    static void printStat(Cat cat,String nameCat){
        System.out.println(nameCat +" state: "+cat.getStatus());
    }
    static void printWeight(Cat cat,String nameCat ){
        System.out.println(nameCat +" weight: "+cat.getWeight());
    }
}