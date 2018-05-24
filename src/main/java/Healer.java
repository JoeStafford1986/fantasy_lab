import java.util.ArrayList;

public class Healer extends PlayerCharacter {
    private ArrayList<HealingTool> healingToolInventory;

    public Healer(int healthPoints){
        super(healthPoints);
        healingToolInventory = new ArrayList<>();
    }

    public int getHealingToolInventoryCount() {
        return this.healingToolInventory.size();
    }

    public void addHealingToolInventory(HealingTool healingTool) {
        this.healingToolInventory.add(healingTool);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {
        Item equippedItem = this.healingToolInventory.get(0);
        int healthPointManipulationInt = equippedItem.getHealthPointManipulator();
        int targetsHealth = target.getHealthPoints();
        target.setHealthPoints(targetsHealth + healthPointManipulationInt);
    }
}
