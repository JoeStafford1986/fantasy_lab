public abstract class PlayerCharacter implements IManipulateHealthPoints {
    private int healthPoints;

    public PlayerCharacter(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }
}

