package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {


    public Playground(String name, int rating){
        super(name, rating);

    }
    public boolean isAllowedToVisit(Visitor visitor) {
        return (visitor.getAge() < 15);
    }
}
