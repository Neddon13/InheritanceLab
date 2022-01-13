import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "PC092736", 30000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(40000, databaseAdmin.raiseSalary(10000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.0);
    }
}

