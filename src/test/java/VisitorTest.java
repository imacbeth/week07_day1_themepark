import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(21, 165, 50.00);
    }

    @Test
    public void hasAge(){
        assertEquals(21, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(165, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(50, visitor.getMoney(), 0.01);
    }
}
