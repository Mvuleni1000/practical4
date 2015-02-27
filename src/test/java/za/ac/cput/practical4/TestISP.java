package za.ac.cput.practical4;


import DesignPrincple.ISP.correction.Human;
import DesignPrincple.ISP.correction.Walking;
import DesignPrincple.ISP.voiletion.HumanA;
import DesignPrincple.ISP.voiletion.WalkingA;
import DesignPrincple.OCP.correction.TopAlbum;
import DesignPrincple.OCP.voiletion.MainFolder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestISP  {

    Walking hun ;
    WalkingA hunEvil;

    @Before
    public void setUp() throws Exception {
        hun = new Human();
        hunEvil =  new HumanA();
    }

    @Test
    public void correctISP()
    {
        Assert.assertEquals(10,hun.walkingSpeed());
    }

    @Test
    public void voiletISP()
    {
        Assert.assertEquals(10, hunEvil.walkSpeed());
    }


    @After
    public void tearDown() throws Exception {


    }
}
