import ThemePark.Attractions.Rollercoaster;
import ThemePark.Stalls.CandyFlossStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Sugar Clouds Shop", "Betty", 10, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Sugar Clouds Shop", candyFlossStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, candyFlossStall.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void chargesAllVisitorsSame(){
        visitor = new Visitor(18, 205, 50);
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }
}

