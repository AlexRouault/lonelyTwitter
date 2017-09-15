package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by arouault on 9/14/17.
 */

public class LonelyMood extends Mood {
    public LonelyMood() {
        super();
    }

    public LonelyMood(Date date) {
        super(date);
    }

    @Override
    public String mood(){
        return "lonely";
    }
}
