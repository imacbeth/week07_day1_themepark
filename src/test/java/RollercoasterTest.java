import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster1;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster1 = new Rollercoaster("Tornado", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Tornado", rollercoaster1.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, rollercoaster1.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollercoaster1.defaultPrice(), 0.01);
    }

    @Test
    public void canChargePremiumPrice(){
        visitor = new Visitor(18, 205, 50);
        assertEquals(16.8, rollercoaster1.priceFor(visitor), 0.01);
    }
}
