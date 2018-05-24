import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {
    Healer healer;

    @Before
    public void before(){
        healer = new Healer(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, healer.getHealthPoints());
    }
}
