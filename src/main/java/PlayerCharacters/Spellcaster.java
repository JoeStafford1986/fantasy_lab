package PlayerCharacters;

import Items.Familiar;
import Items.Spell;
import PlayerCharacters.PlayerCharacter;

import java.util.ArrayList;

public class Spellcaster extends PlayerCharacter {
    private ArrayList<Familiar> familiarInventory;
    private ArrayList<Spell> spellInventory;

    public Spellcaster(int healthPoints) {
        super(healthPoints);
        familiarInventory = new ArrayList<>();
        spellInventory = new ArrayList<>();
    }

    public int getFamiliarInventoryCount() {
        return this.familiarInventory.size();
    }

    public int getSpellInventoryCount() {
        return this.spellInventory.size();
    }

    public void addSpellToSpellInventory(Spell spell) {
        this.spellInventory.add(spell);
    }

    public void addFamiliarToFamiliarInventory(Familiar familiar) {
        this.familiarInventory.add(familiar);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {

    }
}
