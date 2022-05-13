public abstract class CoffeeShop {
    String name;
    public CoffeeShop(String username) {
        name = username;
    }
    private int cappuccinoCount = 0;
    private int latteCount = 0;

    public void biscuits() {
        System.out.println("Would you like to get the biscuits?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    void chooseDrinking(){
        System.out.println("Choose the drinking");
        System.out.println("1. Latte");
        System.out.println("2. Capuccino");
        System.out.println("3. Get statistics");
    }

    private  final double cappuccinoPrice = 2.5;
    private  final double lattePrice = 2.7;
    public void statistic(){
        System.out.println("Capputino sold " +cappuccinoCount + " profit: " +(cappuccinoCount * cappuccinoPrice));
        System.out.println("Latte sold " + latteCount + " profit: " + (latteCount*lattePrice));
    }
    public void makeCappucino(){
        System.out.println("Thanks for order in " + name +", take your Capuccino. Bye!");
        cappuccinoCount++;

    }
    public void makeLatte(){
        System.out.println("Thanks for order in " + name +", take your Latte. Bye!");
        latteCount++;
    }
    public void Wait(){
        System.out.println("Please, wait a minute");
    }
    public void wrong(){
        System.out.println("You put wrong number");
    }

}
