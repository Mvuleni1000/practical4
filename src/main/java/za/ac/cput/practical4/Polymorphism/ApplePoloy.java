package za.ac.cput.practical4.Polymorphism;

import za.ac.cput.practical4.Polymorphism.FoodPoloy;

/**
 * Created by student on 2015/02/26.
 */
public class ApplePoloy extends BananaPoloy implements FoodPoloy{

    ApplePoloy app = new ApplePoloy();
    BananaPoloy ban = app;
    FoodPoloy food =app ;

}
