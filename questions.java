import java.util.ArrayList;
import java.util.Scanner;

public class questions {
    //initialise basket array
    static ArrayList<String> basket;

    static Double total = 0.00;


    //main
    public static void main(String[] args){

        //scanners
        Scanner srch = new Scanner(System.in);
        Scanner specbrs = new Scanner(System.in);
        Scanner brsrch = new Scanner(System.in);
        Scanner checkout = new Scanner (System.in);
        Scanner basketS = new Scanner(System.in);

        //set variables to empty
        String srch1 = "NULL";
        String srch2 = "NULL";
        String buybrs = "NULL";
        String brsrchN = "NULL";
        String bspec = "NULL";
        String bbrs = "NULL";


        //range variables
        int range4 = 0;
        int range6 = 0;
        int range8 = 0;
        int range10 = 0;
        int range12 = 0;

        basket = new ArrayList<>();
        Prices prices = new Prices();
        shopping.main(new String[0]);
        int loopBrsch = 0;
        try {
            while(loopBrsch == 0) {
                System.out.println("Would you like to browse or search for and item: ");
                brsrchN =  brsrch.nextLine().toLowerCase();

                try {
                    if (brsrchN.equals("browse") || brsrchN.equals("browse ")) {
                        System.out.println("Do you want to browse a specific area or everything: ");
                        bspec = brsrch.nextLine();
                        if (bspec.equals("everything") || bspec.equals("everything ")){
                            Functions.fRange();
                            Functions.cRange();
                            System.out.println("Do you want to buy anything? yes or no:");
                            bbrs = brsrch.nextLine();
                            if (bbrs.equals("yes") || bbrs.equals("yes ")){
                                System.out.println("What do you want to buy: ");
                                buybrs = brsrch.nextLine();
                                Functions.fsRange(buybrs);
                                String bsktbrs = basketS.nextLine().toLowerCase();
                                        if (bsktbrs.equals("yes")) {
                                            System.out.println("how many do you want to add: ");
                                            try {
                                                int bsktnum = basketS.nextInt();
                                                for (; range4 < bsktnum; range4++) {
                                                    basket.add(buybrs);
                                                    total += prices.price(buybrs);
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Error QM001 " + e);
                                            }
                                        }
                                }
                                for (String range5 :  shopping.canned_foods){
                                    if (range5.equals(buybrs)) {
                                        System.out.println(buybrs + " is in the list");
                                        System.out.println("Do you want to add this to basket yes or no:");
                                        String bsktbrs = basketS.nextLine().toLowerCase();
                                        if (bsktbrs.equals("yes")) {
                                            System.out.println("how many do you want to add: ");
                                            try {
                                                int bsktnum = basketS.nextInt();
                                                for (;range6 < bsktnum; range6++) {
                                                    basket.add(buybrs);
                                                    total += prices.price(buybrs);
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Error QM002" + e);
                                            }
                                        }
                                    }
                                }
                            }
                        }else if (bspec.equals("specific area")|| bspec.equals("specific area ")){

                            System.out.println("What area do you want to browse fruits or canned foods");
                            String specch = specbrs.nextLine();
                            if (specch.equals("fruits") || specch.equals("fruits ")) {
                                System.out.println(shopping.fruits);
                                System.out.println("What do you want to buy: ");
                                buybrs = brsrch.nextLine();
                                Functions.fsRange(specch);
                                String bsktbrs = basketS.nextLine().toLowerCase();
                                if (bsktbrs.equals("yes")) {
                                    System.out.println("how many do you want to add: ");
                                    try {
                                        int bsktnum = basketS.nextInt();
                                        for (;range8 < bsktnum; range8++) {
                                            basket.add(buybrs);
                                            total += prices.price(buybrs);
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error QM003 " + e);
                                    }
                                }
                            }else if (specch.equals("canned foods") || specch.equals("canned foods ")){
                                System.out.println(shopping.canned_foods);
                                System.out.println("What do you want to buy: ");
                                buybrs = brsrch.nextLine();
                                for (String range7 : shopping.canned_foods) {
                                    if (range7.equals(buybrs)) {
                                        System.out.println(buybrs + " is in the list");
                                        System.out.println("Do you want to add this to basket yes or no:");
                                        String bsktbrs = basketS.nextLine().toLowerCase();
                                        if (bsktbrs.equals("yes")) {
                                            System.out.println("how many do you want to add: ");
                                            try {
                                                int bsktnum = basketS.nextInt();
                                                for (;range8 < bsktnum; range8++) {
                                                    basket.add(buybrs);
                                                    total += prices.price(buybrs);
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Error QM004 " + e);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    else if (brsrchN.equals("search") || brsrchN.equals("search ")) {
                        System.out.println("What do you want to search fruits or canned foods: ");
                        String item = srch.nextLine().toLowerCase();
                        if (item.equals("fruits") || item.equals("fruits ")) {
                            System.out.println("what item do you want to search: ");
                            srch1 = srch.nextLine().toLowerCase();
                            for (String range9 : shopping.fruits) {
                                if (range9.equals(srch1)) {
                                    System.out.println(srch1 + " is in the list");
                                    System.out.println("Do you want to add this to basket yes or no:");
                                    String bsktsrch = basketS.nextLine().toLowerCase();
                                    if (bsktsrch.equals("yes")) {
                                        System.out.println("how many do you want to add: ");
                                        try {
                                            int bsktnum = basketS.nextInt();
                                            for (; range10 < bsktnum; range10++) {
                                                basket.add(srch1);
                                                total += prices.price(srch1);

                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error QM005" + e);
                                        }
                                    }else System.out.println("We dont sell " + srch1);
                                }
                            }
                        }
                        else if (item.equals("canned foods") || item.equals("canned foods ")) {
                            System.out.println("what item do you want to search: ");
                            srch2 = srch.nextLine().toLowerCase();
                            for (String range11 : shopping.canned_foods) {
                                if (range11.equals(srch2)) {
                                    System.out.println(srch2 + " is in the list");
                                    System.out.println("Do you want to add this to basket yes or no:");
                                    String bsktsrch = basketS.nextLine().toLowerCase();
                                    if (bsktsrch.equals("yes")) {
                                        System.out.println("how many do you want to add: ");
                                        try {
                                            int bsktnum = basketS.nextInt();
                                            for (;range12 < bsktnum; range12++) {
                                                basket.add(srch2);
                                                total += prices.price(srch2);

                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error QM006" + e);
                                        }
                                    }
                                    else if (bsktsrch.equals("no")){
                                        System.out.println(" ");
                                    }else System.out.println("We don't sell " + srch2);
                                }
                            }
                        }
                        else {
                            System.out.println("incorrect input");
                        }
                    }
                } catch(Exception e) {
                    System.out.println("Error QM007" + e.getMessage());
                }
                System.out.println(" Basket: ");
                for (int range13 = basket.size()-1;range13 > -1; range13--) {
                    System.out.println(basket.get(range13));
                }
                System.out.println("do you want to go to checkout yes or no: ");
                String check = checkout.nextLine();
                if (check.equals("yes") || check.equals("yes ")) {
                    System.out.println("Your basket:");
                    for (int range14 = basket.size()-1;range14 > -1; range14--) {
                        System.out.println(basket.get(range14));
                    }

                    System.out.println("\nYour total is" );
                    String totalOutput = System.out.printf("£" + "%.2f", total.floatValue()).toString();
                    loopBrsch = 1;
                }

            }

        } catch(Exception e){
            System.out.println("Error QM008");
        }
    }
}
