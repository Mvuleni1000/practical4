package za.ac.cput.practical4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.practical4.Encapsulation.PersonEncap;
import za.ac.cput.practical4.Inheritance.Speed;
import za.ac.cput.practical4.Inheritance.Vehicle;
import za.ac.cput.practical4.Polymorphism.ApplePoloy;
import za.ac.cput.practical4.Polymorphism.BananaPoloy;
import za.ac.cput.practical4.Polymorphism.FoodPoloy;


/**
 * Created by student on 2015/02/23.
 */
public class TestApp {

    private PersonEncap obj  = new PersonEncap() ;
    private Vehicle object   = new Speed();
    private FoodPoloy ban    = new BananaPoloy();

    @Before
    public void setUp() throws Exception {


    }

    //Testing for Encapu
    @Test
    public void testname()
    {
        Assert.assertEquals("Sbu", obj.getName());
    }

    @Test
    public void testSurname()
    {
        Assert.assertEquals("Mnisi", obj.getSurname());
    }

    @Test
    public void testAge()
    {
         Assert.assertEquals(15, obj.getAge());
    }

    //Testing for inheritance
    @Test
    public void testSpeed()throws Exception
    {
        Assert.assertEquals(55, object.getSpeed());
    }
    @Test
    public void testPolymorphism()
    {
        Assert.assertEquals("apple",ban.getFood());
    }


    @After
    public void tearDown() throws Exception {

    }
}
