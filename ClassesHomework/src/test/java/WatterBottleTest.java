import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100, 10);
    }

    @Test
    public void hasVolume(){

        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takeDrink(){

        assertEquals( 90, waterbottle.takeDrink (100, 10));
    }

    @Test
    public void emptyWaterBottle(){
        assertEquals( 0, waterbottle.emptyWaterBottle (0));
    }

    @Test
    public void fillWaterBottle(){
        assertEquals(100, waterbottle.fillWaterBottle(100));
    }

}
