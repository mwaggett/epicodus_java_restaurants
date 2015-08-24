import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class RestaurantTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  // @Test
  // public void all_emptyAtFirst() {
  //     assertEquals(Task.all().size(), 0);
  // }

  @Test
  public void getName_returnsName() {
    Restaurant newRestaurant = new Restaurant("Lardo");
    assertEquals("Lardo", newRestaurant.getName());
  }

  @Test
  public void equals_returnsTrueIfNamesAreTheSame() {
    Restaurant restaurant1 = new Restaurant("Lardo");
    Restaurant restaurant2 = new Restaurant("Lardo");
    assertEquals(true, restaurant1.equals(restaurant2));
  }

}
