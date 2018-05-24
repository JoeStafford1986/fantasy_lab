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
}
