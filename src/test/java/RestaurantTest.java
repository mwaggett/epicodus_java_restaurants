import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class RestaurantTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  // @Test
  // public void all_emptyAtFirst() {
  //     assertEquals(Restaurant.all().size(), 0);
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

  @Test
  public void save_savesRestaurantToDatabase() {
    Restaurant myRestaurant = new Restaurant("Lardo");
    myRestaurant.save();
    assertTrue(Restaurant.all().get(0).equals(myRestaurant));
  }

  @Test
  public void save_assignsIdToObject() {
    Restaurant myRestaurant = new Restaurant("Lardo");
    myRestaurant.save();
    assertEquals(Restaurant.all().get(0).getId(), myRestaurant.getId());
  }

  @Test
  public void find_findsRestaurantInDatabase_true() {
    Restaurant myRestaurant = new Restaurant("Lardo");
    myRestaurant.save();
    Restaurant savedRestaurant = Restaurant.find(myRestaurant.getId());
    assertTrue(myRestaurant.equals(savedRestaurant));
  }

  @Test
  public void update_updatesRestaurantObjectInMemory_true() {
    Restaurant myRestaurant = new Restaurant("Lardo");
    myRestaurant.save();
    myRestaurant.update("Pok Pok");
    assertEquals("Pok Pok", myRestaurant.getName());
  }

  @Test
  public void update_updatesRestaurantInDatabase_true() {
    Restaurant myRestaurant = new Restaurant("Lardo");
    myRestaurant.save();
    myRestaurant.update("Pok Pok");
    assertEquals("Pok Pok", Restaurant.all().get(0).getName());
  }

}
