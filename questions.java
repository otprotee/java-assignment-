import java.util.Scanner;

public class questions {
    public static void main(String[] args){
        shopping.main(new String[0]);
        int loopBrsch = 0;
        int fruitLen = shopping.fruits.size();
        try {
            while(loopBrsch == 0) {
                Scanner brsrch = new Scanner(System.in);
                System.out.println("Would you like to browse or search for and item?");
                String brsrchR =  brsrch.nextLine();
                brsrchR.toLowerCase();
                if (brsrchR == "browse" || brsrchR == "browse ") {
                    System.out.println("\n Fruits: \n");
                    System.out.println(shopping.fruits);
                    System.out.println("\n Canned Foods: \n");
                    System.out.println(shopping.canned_foods);
                }

            }


        }
        catch(Exception e){

        }

    }
}
