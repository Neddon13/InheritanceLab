import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
    manager = new Manager("Bob", "PC092736", 30000, "IT");
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(40000, manager.raiseSalary(10000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Rob");
        assertEquals("Rob", manager.getName());
    }
}
