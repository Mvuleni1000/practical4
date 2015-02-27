package DesignPrincple.DIP.correction;

/**
 * Created by student on 2015/02/26.
 */
public class Manager {

    UnderWorker employee;

    public void setEmployee(UnderWorker e)
    {
        employee = e;
    }

    public void leading()
    {
       employee.getName();
    }
}
