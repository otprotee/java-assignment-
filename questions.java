import java.util.ArrayList;
import java.util.Scanner;

public class questions {
    //initialise basket array
    static ArrayList<String> basket;

    static Double total = 0.00;

    static Prices prices = new Prices();

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
        int range6 = 0;
        int range8 = 0;
        int range10 = 0;
        int range12 = 0;

        basket = new ArrayList<>();
        shopping.main(new String[0]);
        int loopBrsch = 0;

        while(loopBrsch == 0) {
            System.out.println("Would you like to browse or search for an item: ");
            brsrchN = brsrch.nextLine().toLowerCase();


            //browse
            if (brsrchN.equals("browse") || brsrchN.equals("browse ")) {
                System.out.println("Do you want to browse a specific area or everything: ");
                bspec = brsrch.nextLine();

                //browse everything
                if (bspec.equals("everything") || bspec.equals("everything ")) {

                    //functions
                    Functions.fRange();
                    Functions.cRange();
                    Functions.Fyes();
                }

                //browse specific area
                else if (bspec.equals("specific area") || bspec.equals("specific area ")) {

                    //questions
                    System.out.println("What area do you want to browse fruits or canned foods");
                    String specch = specbrs.nextLine();

                    //browse specific area fruits
                    if (specch.equals("fruits") || specch.equals("fruits ")) {

                        //function
                        Functions.fRange();

                        //questions
                        System.out.println("What do you want to buy: ");
                        buybrs = brsrch.nextLine();

                        Functions.fsRange(buybrs);
                        String bsktbrs = basketS.nextLine().toLowerCase();


                        if (bsktbrs.equals("yes")) {
                            Functions.total_Calc(buybrs);
                        }
                    }

                    //browse specific area canned foods
                    else if (specch.equals("canned foods") || specch.equals("canned foods ")) {

                        //call function
                        Functions.cRange();

                        //questions
                        System.out.println("What do you want to buy: ");
                        String buybrs1 = brsrch.nextLine();

                        Functions.csRange(buybrs1);
                        String bsktbrs = basketS.nextLine().toLowerCase();

                        //calculation
                        if (bsktbrs.equals("yes")) {
                            Functions.total_Calc(buybrs1);
                        }
                    }
                }
            }

            //search
            else if (brsrchN.equals("search") || brsrchN.equals("search ")) {

                //questions
                System.out.println("What do you want to search fruits or canned foods: ");
                String item = srch.nextLine().toLowerCase();

                //search fruits
                if (item.equals("fruits") || item.equals("fruits ")) {

                    //questions
                    System.out.println("what item do you want to search: ");
                    srch1 = srch.nextLine().toLowerCase();
                    Functions.fsRange(srch1);
                    String bsktsrch = basketS.nextLine().toLowerCase();

                    //calculation
                    if (bsktsrch.equals("yes")) {
                        Functions.total_Calc(srch1);
                    }
                }

                //search canned foods
                else if (item.equals("canned foods") || item.equals("canned foods ")) {

                    //questions
                    System.out.println("what item do you want to search: ");
                    srch2 = srch.nextLine().toLowerCase();

                    //function
                    Functions.csRange(srch2);

                    String bsktsrch = basketS.nextLine().toLowerCase();

                    //calculation
                    if (bsktsrch.equals("yes")) {
                        Functions.total_Calc(srch2);
                    }
                }
            }

            //basket questions
            System.out.println("Basket: ");
            for (int range13 = basket.size()-1;range13 > -1; range13--) {
                System.out.println(basket.get(range13));
            }

            //checkout
            System.out.println("do you want to go to checkout yes or no: ");
            String check = checkout.nextLine();

            //basket printing
            if (check.equals("yes") || check.equals("yes ")) {
                System.out.println("Your basket:");
                for (int range14 = basket.size()-1;range14 > -1; range14--) {
                    System.out.println(basket.get(range14));
                }

                //output
                System.out.println("\nYour total is" );
                String totalOutput = System.out.printf("£" + "%.2f", total.floatValue()).toString();
                loopBrsch = 1;
            }

        }

    }
}
