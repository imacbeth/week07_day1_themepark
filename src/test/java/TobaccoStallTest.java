import ThemePark.Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall ;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Smoky Bill's", "Bill", 12, 2);
    }

    @Test
    public void hasName(){
        assertEquals("Smoky Bill's", tobaccoStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(2, tobaccoStall.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.80, tobaccoStall.defaultPrice(), 0.01);
    }

    @Test
    public void doesNotServeMinors(){
        visitor = new Visitor(17, 205, 50);
        assertEquals(false, tobaccoStall.isAllowedToVisit(visitor));
    }


}
