package za.ac.cput.practical4;

import DesignPrincple.SRP.corretion.BookInterface;
import DesignPrincple.SRP.corretion.IBook;
import DesignPrincple.SRP.voiletion.BookTile;
import DesignPrincple.SRP.voiletion.StoreBook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestSRC {

   private BookInterface obj;
   private StoreBook failing  ;


    @Before
    public void setUp() throws Exception {
        failing  = new BookTile();
        obj  =  new IBook();

    }


    @Test
    public void correctionSRC()throws Exception
    {
        Assert.assertEquals(10,obj.getBooks());
    }

    @Test
    public void voiletingSRC()
    {
        Assert.assertEquals("JavaBook",failing.getBookName());
    }

    @After
    public void tearDown() throws Exception {


    }
}
