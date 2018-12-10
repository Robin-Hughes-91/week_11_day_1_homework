import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestWaterBottle {
    WaterBottle waterBottle;

    @Before
    public void Before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void DrinkTest() {
        assertEquals(90, waterBottle.drink(100));
    }

    @Test
    public void EmptyTest() {
        assertEquals(0, waterBottle.empty(100));
    }

    @Test
    public void FillTest() {
        assertEquals(100, waterBottle.fill(0));
    }
}
