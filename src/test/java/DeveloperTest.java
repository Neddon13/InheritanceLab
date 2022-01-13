
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest{

    private Developer developer;

    @Before
    public void before(){
            developer = new Developer("Bob", "PC092736", 30000);
            }
    
    @Test
    public void canRaiseSalary(){
            assertEquals(40000, developer.raiseSalary(10000), 0.0);
            }
    
    @Test
    public void canPayBonus(){
            assertEquals(300, developer.payBonus(), 0.0);
            }

}

