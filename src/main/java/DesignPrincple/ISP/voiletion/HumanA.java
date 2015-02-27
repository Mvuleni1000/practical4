package DesignPrincple.ISP.voiletion;

import DesignPrincple.ISP.correction.Walking;

/**
 * Created by student on 2015/02/27.
 */
public class HumanA implements WalkingA {

    @Override
    public int walkSpeed()
    {
        return 10;
    }

}
