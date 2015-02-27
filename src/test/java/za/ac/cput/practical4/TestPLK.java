package za.ac.cput.practical4;

import DesignPrincple.PLK.voiletion.ToyEvil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestPLK {

   ToyEvil object ;
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void voiletTest()
    {
        object = new ToyEvil();
        Assert.assertEquals("cars",object.getType());
    }
    @After
    public void tearDown() throws Exception {


    }
}
