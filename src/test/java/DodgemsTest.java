import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems1;

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


}
