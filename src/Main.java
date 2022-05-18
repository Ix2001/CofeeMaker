
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HongKong hk = new HongKong("Hong Kong");
        NewYork ny = new NewYork("NewYork");
        Rome rome = new Rome("Rome");
        Paris paris = new Paris("Paris");
        while (true) {
            Scanner console = new Scanner(System.in);
            hk.city();
            int num = console.nextInt();
            if (num == 1) {
                ny.Wait();
                ny.chooseDrinking();
                int choice1 = console.nextInt();
                if (choice1 == 1) {

                    ny.Wait();
                    ny.biscuits();
                    int bis1 = console.nextInt();
                    if (bis1 == 1) {
                        ny.sellBiscuits();
                    }
                    ny.makeLatte();
                } else if (choice1 == 2) {

                    ny.Wait();
                    ny.biscuits();
                    int bis1 = console.nextInt();
                    if (bis1 == 1) {
                        ny.sellBiscuits();
                    }
                    ny.makeCappucino();

                } else if(choice1 == 3){
                    ny.statistic();
                }
                else {
                    ny.Wait();
                    ny.wrong();
                }
            } else if (num == 2) {

                rome.Wait();
                rome.chooseDrinking();
                int choice2 = console.nextInt();
                if (choice2 == 1) {

                    rome.Wait();
                    rome.makeLatte();
                } else if (choice2 == 2) {

                    rome.Wait();
                    rome.makeCappucino();
                } else if(choice2 == 3){
                    rome.statistic();
                }
                else {
                    rome.wrong();
                }
            } else if (num == 3) {

                paris.Wait();
                paris.chooseDrinking();
                int choice3 = console.nextInt();
                if (choice3 == 1) {
                    paris.Wait();
                    paris.biscuits();
                    int bis1 = console.nextInt();
                    if (bis1 == 1) {
                        paris.sellBiscuits();
                    }
                    paris.makeLatte();
                } else if (choice3 == 2) {

                    paris.Wait();
                    paris.biscuits();
                    int bis1 = console.nextInt();
                    if (bis1 == 1) {
                        paris.sellBiscuits();
                    }
                    paris.makeCappucino();
                } else if(choice3 == 3){
                    paris.statistic();
                }
                else {
                    paris.wrong();
                }
            } else if (num == 4) {

                hk.Wait();
                hk.chooseDrinking();
                int choice4 = console.nextInt();
                if (choice4 == 1) {

                    hk.Wait();
                    hk.makeLatte();
                } else if (choice4 == 2) {

                    hk.Wait();
                    hk.makeCappucino();
                } else if(choice4 == 3){
                    hk.statistic();
                } else {
                    hk.wrong();
                }
            } else {
                System.out.println("You put wrong number");
            }
        }
    }
}

