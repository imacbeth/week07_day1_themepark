package ThemePark.Attractions;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, IReviewed, ISecurity {


    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return ((visitor.getAge() > 12) && (visitor.getHeight() > 145));
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if ( visitor.getHeight() > 200){
            return (defaultPrice() * 2);
        }
        return defaultPrice();
    }
}
