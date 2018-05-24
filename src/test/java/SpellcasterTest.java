import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellcasterTest {
    Spellcaster spellcaster;

    @Before
    public void before(){
        spellcaster = new Spellcaster(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, spellcaster.getHealthPoints());
    }
}
