package PlayCharacterTests;

import PlayerCharacters.Fighter;
import PlayerCharacters.PlayerCharacter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerCharacterTest {
    PlayerCharacter fighterPlayerCharacter;

    @Before
    public void before(){
        fighterPlayerCharacter = new Fighter(10);
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(10, fighterPlayerCharacter.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        fighterPlayerCharacter.setHealthPoints(20);
        assertEquals(20, fighterPlayerCharacter.getHealthPoints());
    }
}
