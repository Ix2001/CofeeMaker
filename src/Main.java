import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choose the city: ");
        System.out.println("1. New York");
        System.out.println("2. Rome");
        System.out.println("3. Paris");
        System.out.println("4. HongKong");
        int num = console.nextInt();
        if(num == 1){
            NewYork ny = new NewYork();
            ny.Wait();
            System.out.println("Choose the drinking");
            System.out.println("1. Latte");
            System.out.println("2. Capuccino");
            int choice1 = console.nextInt();
            if(choice1 == 1){
                ny.Wait();
                ny.makeLatte();
            }else if(choice1 == 2){
                ny.Wait();
                ny.makeCappucino();
            }else{
                ny.Wait();
                ny.wrong();
            }
        }else if(num == 2){
            Rome rome = new Rome();
            rome.Wait();
            System.out.println("Choose the drinking");
            System.out.println("1. Latte");
            System.out.println("2. Capuccino");
            int choice2 = console.nextInt();
            if(choice2 == 1){
                rome.Wait();
                rome.makeLatte();
            }else if(choice2 == 2){
                rome.Wait();
                rome.makeCapuccino();
            }else{
                rome.wrong();
            }
        }else if (num == 3){
            Paris paris = new Paris();
            paris.Wait();
            System.out.println("Choose the drinking");
            System.out.println("1. Latte");
            System.out.println("2. Capuccino");
            int choice3 = console.nextInt();
            if(choice3 == 1){
                paris.Wait();
                paris.makeLatte();
            }else if(choice3 == 2){
                paris.Wait();
                paris.makeCapuccino();
            }else {
                paris.wrong();
            }
        }else if (num == 4){
            HongKong hk = new HongKong();
            hk.Wait();
            System.out.println("Choose the drinking");
            System.out.println("1. Latte");
            System.out.println("2. Capuccino");
            int choice4 = console.nextInt();
            if (choice4 == 1){
                hk.Wait();
                hk.makeLatte();
            }else if(choice4 == 2){
                hk.Wait();
                hk.makeCapuccino();
            }
        }else {
            System.out.println("You put wrong number");
        }
    }
}
