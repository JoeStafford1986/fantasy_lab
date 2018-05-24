import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    Fighter fighter;
    MeleeWeapon meleeWeapon;

    @Before
    public void before(){
        fighter = new Fighter(10);
        meleeWeapon = new MeleeWeapon(1);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, fighter.getHealthPoints());
    }

    @Test
    public void canGetMeleeWeaponInventoryCount() {
        assertEquals(0, fighter.getMeleeWeaponInventoryCount());
    }

    @Test
    public void canAddMeleeWeaponInventoryCount(){
        fighter.addMeleeWeapontoInventory(meleeWeapon);
        assertEquals(1, fighter.getMeleeWeaponInventoryCount());
    }
}
