
public class Loader {
    public static void main(String[] args) {
        Integer milkAmount = 2000; // ml
        Integer powderAmount = 500; // g
        Integer eggsCount = 4; // items
        Integer sugarAmount = 50; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;


        System.out.println(((powderAmount >= 400) && (sugarAmount >= 10) && (milkAmount >= 1000) && (oilAmount >= 30)) ?
                "Pancakes" : (((milkAmount >= 300) && (powderAmount >= 5) && (eggsCount >= 5)) ?
                "Omelette" : (((appleCount >= 3) && (milkAmount >= 100) && (powderAmount >= 300) && (eggsCount >= 4)) ?
                "Apple pie" : "Sorry, need more product or other dishes :(")));


//powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
//milk - 300 ml, powder - 5 g, eggs - 5
//apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
    }
}
