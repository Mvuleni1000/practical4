package za.ac.cput.practical4.Inheritance;

import za.ac.cput.practical4.Inheritance.Vehicle;

/**
 * Created by student on 2015/02/25.
 */
public class Van implements Vehicle {
    private int speed;

    @Override
    public int getSpeed()
    {
        return 55;
    }
}
