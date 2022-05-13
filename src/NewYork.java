import Folder.CoffeeShop;
import Folder.SellBiscuits;

public class NewYork extends CoffeeShop implements SellBiscuits {
    public NewYork(String username) {
        super(username);
    }
    public void sellBiscuits() {
        System.out.println("“Take your biscuits”");
    }
}