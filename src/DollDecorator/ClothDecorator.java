package DollDecorator;
import Doll.*;

public class ClothDecorator extends DollDecorator {
    public ClothDecorator(Doll decoratedDoll) {
        super(decoratedDoll);
    }

    public int getPrice() {
        price = super.getPrice();
        return 20000 + price;
    }
}
