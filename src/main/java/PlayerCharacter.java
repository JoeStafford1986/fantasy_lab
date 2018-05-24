public class PlayerCharacter {
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

