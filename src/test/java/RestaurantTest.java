import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Hugh Glykod
 */
public class RestaurantTest {

    @Test
    public void testDefaultOpeningHours() {

        Restaurant myRestaurant = new Restaurant();

        boolean isOpen = myRestaurant.isOpen(DayOfWeek.MONDAY);

        assertTrue(isOpen);
    }

    @Test
    public void testNoArgumentIsOpen() {

        Restaurant myRestaurant = new Restaurant();

        boolean isOpen = myRestaurant.isOpen();

        assertTrue(isOpen);
    }


}
