package ThemePark.Stalls;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements IReviewed, ISecurity {


    public boolean isAllowedToVisit(Visitor visitor) {
       return (visitor.getAge() > 18);
    }


}
