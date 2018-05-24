import java.util.ArrayList;

public class Fighter extends PlayerCharacter{
    private ArrayList<MeleeWeapon> meleeWeaponInventory;

    public Fighter(int healthPoints){
        super(healthPoints);
        meleeWeaponInventory = new ArrayList<>();
    }

    public int getMeleeWeaponInventoryCount() {
        return this.meleeWeaponInventory.size();
    }

    public void addMeleeWeapontoInventory(MeleeWeapon meleeWeapon) {
        this.meleeWeaponInventory.add(meleeWeapon);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {
        Item equippedItem = this.meleeWeaponInventory.get(0);
        int healthPointManipulationInt = equippedItem.getHealthPointManipulator();
        int targetsHealth = target.getHealthPoints();
        target.setHealthPoints(targetsHealth + healthPointManipulationInt);
    }
}
