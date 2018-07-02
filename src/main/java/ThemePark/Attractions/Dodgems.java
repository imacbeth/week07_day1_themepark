package ThemePark.Attractions;

import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice() / 2;
    }
}
