package za.ac.cput.practical4;

import DesignPrincple.OCP.correction.LowAblum;
import DesignPrincple.OCP.correction.MusicInterface;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestOCP {

    MusicInterface song ;
    @Before
    public void setUp() throws Exception {
        song = new LowAblum();
    }

    @Test
    public void correctTest()
    {

        Assert.assertNotNull("Class", song.getAlbum());
    }

    @Test
    public void violationTest()
    {

    }

    @After
    public void tearDown() throws Exception {


    }
}
