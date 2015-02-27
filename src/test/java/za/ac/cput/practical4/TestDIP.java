package za.ac.cput.practical4;

import DesignPrincple.DIP.correction.Manager;
import DesignPrincple.DIP.correction.UnderWorker;
import DesignPrincple.DIP.correction.Worker;
import DesignPrincple.DIP.violetion.DIPclass;
import DesignPrincple.DIP.violetion.DIPfail;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/26.
 */
public class TestDIP {

    private Worker obj ;
    private DIPclass dips;

    @Before
    public void setUp() throws Exception {

        obj = new  UnderWorker ();
        dips = new DIPfail();
    }

    @Test
    public void correctionTest()
    {
        Assert.assertEquals("Sbu", obj.getName());
    }

    @Test
    public void voiletionTest()
    {

        Assert.assertEquals(55,dips.getAge());
    }

    @After
    public void tearDown() throws Exception {


    }
}
