import ThemePark.Stalls.IceCreamStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Milk Train", "Frederico", 16, 9);
    }

    @Test
    public void hasName(){
        assertEquals("Milk Train", iceCreamStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(9, iceCreamStall.getRating());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Frederico", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(16, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void chargesAllVisitorsSame(){
        visitor = new Visitor(18, 205, 50);
        assertEquals(2.80, iceCreamStall.priceFor(visitor), 0.01);
    }


}
