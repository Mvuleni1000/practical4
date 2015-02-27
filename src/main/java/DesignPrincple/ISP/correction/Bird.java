package DesignPrincple.ISP.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Bird implements Flying,Walking{

    @Override
    public int flySpeed()
    {
        return 55;
    }

    @Override
    public int walkingSpeed()
    {
        return 55;
    }

}
