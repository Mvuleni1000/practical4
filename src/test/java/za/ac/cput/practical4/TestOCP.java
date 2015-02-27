package za.ac.cput.practical4;

import DesignPrincple.OCP.correction.LowAblum;
import DesignPrincple.OCP.correction.MusicInterface;
import DesignPrincple.OCP.voiletion.Album;
import DesignPrincple.OCP.voiletion.MainFolder;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestOCP {

    private MusicInterface song ;
    private MainFolder tracks = new MainFolder() {
        @Override
        public String getFloder() {
            return null;
        }
    };

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
        Assert.assertNotNull("house",tracks.getAlbum());
    }

    @After
    public void tearDown() throws Exception {


    }
}
