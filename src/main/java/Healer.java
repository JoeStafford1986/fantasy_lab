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
}
