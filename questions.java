import java.util.Scanner;

public class questions {
    public static void main(String[] args){
        shopping.main(new String[0]);
        int loopBrsch = 0;
        try {
            while(loopBrsch == 0) {
                Scanner brsrch = new Scanner(System.in);
                System.out.println("Would you like to browse or search for and item: ");
                String brsrchR =  brsrch.nextLine();
                String brsrchN =  brsrchR.toLowerCase();
                try {
                    if (brsrchN.equals("browse") || brsrchN.equals("browse ")) {
                        System.out.println("\n Fruits: \n");
                        System.out.println(shopping.fruits);
                        System.out.println("\n Canned Foods: \n");
                        System.out.println(shopping.canned_foods);
                        loopBrsch = 1;
                    } else if (brsrchN.equals("search") || brsrchN.equals("search ")) {
                        Scanner srch = new Scanner(System.in);
                        System.out.println("What do you want to search fruits or canned foods: ");
                        String item = srch.nextLine();
                        String itemN = item.toLowerCase();
                        if (itemN.equals("fruits") || itemN.equals("fruits ")) {
                            System.out.println("what item do you want to search: ");
                            String srch1 = srch.nextLine();
                            String srch1N = srch1.toLowerCase();
                            for (String range1 : shopping.fruits) {
                                if (range1.equals(srch1N)) {
                                    System.out.println(srch1N + " is in the list");
                                } else {
                                    System.out.println("We dont sell" + srch1N);
                                }
                            }
                        }
                        if (itemN.equals("canned foods") || itemN.equals("canned foods ")) {
                            System.out.println("what item do you want to search: ");
                            String srch2 = srch.nextLine();
                            String srch2N = srch2.toLowerCase();
                            for (String range1 : shopping.fruits) {
                                if (range1.equals(srch2N)) {
                                    System.out.println(srch2N + " is in the list");
                                } else {
                                    System.out.println("We dont sell" + srch2N);
                                }
                            }
                        }
                    }
                } catch(Exception e) {
                    System.out.println("Error QM002");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error QM001");
        }
    }
}
