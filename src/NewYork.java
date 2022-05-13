public class NewYork extends CoffeeShop implements SellBiscuits {
    public NewYork(String username) {
        super(username);
    }


    public void sellBiscuits() {
        System.out.println("“Take your biscuits”");
    }
}
//void makeCappucino (){
//System.out.println("Thanks for order in NewYork, take your Latte. Bye!");
//}
// void makeLatte(){
//   System.out.println("Thanks for order in NewYork, take your Capuccino. Bye!");
// }
// void Wait(){
//    System.out.println("Please wait");
// }
// void wrong(){
//     System.out.println(makeCappucino);
// }