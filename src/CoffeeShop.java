public abstract class CoffeeShop {
    String name;
    public CoffeeShop(String username) {
        name = username;
    }

    public void makeCappucino(){
        System.out.println("Thanks for order in " + name +", take your Capuccino. Bye!");
    };
    public void makeLatte(){
        System.out.println("Thanks for order in " + name +", take your Latte. Bye!");
    };
    public void Wait(){
        System.out.println("Please, wait a minute");
    };
    public void wrong(){
        System.out.println("You put wrong number");
    }

}
