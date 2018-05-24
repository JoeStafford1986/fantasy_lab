import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {
    Healer healer;
    HealingTool healingTool;

    @Before
    public void before(){
        healer = new Healer(10);
        healingTool = new HealingTool(1);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, healer.getHealthPoints());
    }

    @Test
    public void canGetHealingToolInventoryCount() {
        assertEquals(0, healer.getHealingToolInventoryCount());
    }

    @Test
    public void canAddHealingToolInventoryCount(){
        healer.addHealingToolInventory(healingTool);
        assertEquals(1, healer.getHealingToolInventoryCount());
    }
}
