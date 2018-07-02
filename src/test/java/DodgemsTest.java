import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems1;
    Visitor visitor;

    @Before
    public void before(){
        dodgems1 = new Dodgems("Wacky Races", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Wacky Races", dodgems1.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(6, dodgems1.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems1.defaultPrice(), 0.01);
    }

    @Test
    public void canChargePremiumPrice(){
        visitor = new Visitor(11, 110, 50);
        assertEquals(2.25, dodgems1.priceFor(visitor), 0.01);
    }

}
