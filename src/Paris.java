public class Paris extends CoffeeShop implements SellBiscuits{
    public Paris(String username) {
        super(username);
    }
    public void sellBiscuits() {
        System.out.println("“Take your biscuits”");
    }
}

//void makeLatte(){
///    System.out.println("Thanks for order in Paris, take your Latte. Bye!");
//}
// void Wait(){
//      System.out.println("Please, wait a minute");
//  }
//   void makeCapuccino(){
//     System.out.println("Thanks for order in Paris, take your Capuccino. Bye!");
// }
//  void wrong(){
//      System.out.println("You put wrong number");
//  }