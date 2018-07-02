package ThemePark;

import ThemePark.Attractions.*;
import ThemePark.Stalls.*;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviewed


    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions(){
        return this.attractions;
    }

    public ArrayList<Stall> getStalls(){
        return this.stalls;
    }

}
