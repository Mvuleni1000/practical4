package DesignPrincple.OCP.correction;

import DesignPrincple.OCP.voiletion.MainFolder;

/**
 * Created by student on 2015/02/27.
 */
public abstract class TopAlbum implements MusicInterface
{
    @Override
     public  String getAlbum()
    {
        return "Classic";
    }

}
