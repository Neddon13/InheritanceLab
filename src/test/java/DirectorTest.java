import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Bob", "PC092736", 30000, "IT", 80000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(40000, director.raiseSalary(10000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, director.payBonus(), 0.0);
    }

    @Test
    public void getBudget() {
        assertEquals(80000, director.getBudget(), 0.0);
    }

}
