import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {

  protected void before() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/restaurant_test", null, null);
    // Make sure to customize the url to have the actual test database name.
   }

  protected void after() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM restaurants *;";
      con.createQuery(sql).executeUpdate();
    }
  }
}
