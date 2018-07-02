package ThemePark.Stalls;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements IReviewed, ISecurity, ITicketed {

    public TobaccoStall( String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
       return (visitor.getAge() > 18);
    }

    public double defaultPrice(){
        return 8.80;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }



}
