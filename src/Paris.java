import Folder.CoffeeShop;
import Folder.SellBiscuits;

public class Paris extends CoffeeShop implements SellBiscuits {
    public Paris(String username) {
        super(username);
    }
    public void sellBiscuits() {
        System.out.println("“Take your biscuits”");
    }

}
