package DollDecorator;

import Doll.Doll;

public class DollDecorator extends Doll {
    private Doll decoratedDoll;

    public DollDecorator(Doll decoratedDoll) {
        this.decoratedDoll = decoratedDoll;
    }

    public int getPrice() {
        price = decoratedDoll.getPrice();
        return price;
    }
}
