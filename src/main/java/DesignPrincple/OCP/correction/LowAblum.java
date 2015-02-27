package DesignPrincple.OCP.correction;

/**
 * Created by student on 2015/02/27.
 */
public class LowAblum extends TopAlbum implements MusicInterface{

    @Override
    public String getAlbum()
    {
        return "Soul";
    }
}
