package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by arouault on 9/14/17.
 */

public class SadMood extends Mood {
    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String mood(){
        return "sad";
    }
}
