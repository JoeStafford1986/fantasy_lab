import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, fighter.getHealthPoints());
    }
}
