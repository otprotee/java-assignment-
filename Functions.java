import java.util.Scanner;

public class Functions {

    //function for checking something is in the fruits list
    static void fsRange(String item1) {
        for (String range7 : shopping.fruits) {
            if (range7.equals(item1)) {
                System.out.println("Do you want to add this to basket yes or no:");
            }
        }
    }


    //function for checking something is in the canned food list
    static void csRange(String item1) {
        for (String range8 : shopping.canned_foods) {
            if (range8.equals(item1)) {
                System.out.println("Do you want to add this to basket yes or no:");
            }else System.out.println("Sorry we dont sell "+ item1);
        }
    }


    //function for output the fruits list
    static void fRange() {
        int range1 = 0;
        System.out.println("\nFruits: \n");
        for (; range1 <= shopping.fruits.size() - 1; range1++) {
            System.out.println(shopping.fruits.get(range1));
        }
    }

    //function for output the canned foods list
    static void cRange() {
        int range2 = 0;
        System.out.println("\nCanned Foods:\n");
        for (; range2 <= shopping.canned_foods.size() - 1; range2++) {
            System.out.println(shopping.canned_foods.get(range2));
        }
    }



    static void total_Calc(String num){
        int range8 = 0;
        Scanner basketT = new Scanner(System.in);

        System.out.println("how many do you want to add: ");
        int bsktnum = basketT.nextInt();
        for (; range8 < bsktnum; range8++) {
            questions.basket.add(num);
            questions.total += questions.prices.price(num);
        }
    }



    static void Fyes() {
        Scanner brsrch = new Scanner(System.in);
        Scanner basketS = new Scanner(System.in);

        String bbrs = "NULL";
        String buybrs = "NULL";


        System.out.println("Do you want to buy anything? yes or no:");
        bbrs = brsrch.nextLine();
        if (bbrs.equals("yes") || bbrs.equals("yes ")) {
            System.out.println("What do you want to buy: ");
            buybrs = brsrch.nextLine();
            fsRange(buybrs);
            csRange(buybrs);
            String bsktbrs = basketS.nextLine().toLowerCase();
            if (bsktbrs.equals("yes")) {
                total_Calc(buybrs);
            }
        }
    }

}





