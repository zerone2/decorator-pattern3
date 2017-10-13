package DollDecorator;
import Doll.*;

public class RibbonDecorator extends DollDecorator {
    public RibbonDecorator(Doll decorateddisplay) {
        super(decorateddisplay);
    }

    public int getPrice() {
        price = super.getPrice();
        return 10000+price;
    }
}
