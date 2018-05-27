package PlayCharacterTests;

import Items.Familiar;
import Items.Spell;
import PlayerCharacters.Spellcaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellcasterTest {
    Spellcaster spellcaster;
    Spell spell;
    Familiar familiar;

    @Before
    public void before() {
        spellcaster = new Spellcaster(10);
        spell = new Spell(-1);
        familiar = new Familiar(-1);
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(10, spellcaster.getHealthPoints());
    }

    @Test
    public void canGetFamiliarInventoryCount() {
        assertEquals(0, spellcaster.getFamiliarInventoryCount());
    }


    @Test
    public void canGetSpellInventoryCount() {
        assertEquals(0, spellcaster.getSpellInventoryCount());
    }

    @Test
    public void canAddSpellToSpellInventory() {
        spellcaster.addSpellToSpellInventory(spell);
        assertEquals(1, spellcaster.getSpellInventoryCount());
    }

    @Test
    public void canAddFamiliarToSpellInventory() {
        spellcaster.addFamiliarToFamiliarInventory(familiar);
        assertEquals(1, spellcaster.getFamiliarInventoryCount());
    }
}
