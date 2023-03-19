import org.example.objects.Dice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    Dice dice = new Dice(6, "red");
    @Test
    public void testDice()
    {

        assertEquals(6, dice.getSides());
        assertEquals("red", dice.getColor());

    }
    public void testColor()
    {

        assertEquals("red", dice.getColor());
    }
    public void testSides()
    {

        assertEquals(6, dice.getSides());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    public void testNumber()
    {

        int rollNumber = dice.roll();
        assertTrue(true);
    }
    
    @Test 
    public void testRoll()
    {

        int roll = -1;
        while(roll != 3)
        {
            roll = dice.roll();
        }
    }
    @Test
    public void testToString()
    {
        Dice dice = new Dice(6, "red");
        assertEquals("A 6 sided die", dice.toString());
    }


}
