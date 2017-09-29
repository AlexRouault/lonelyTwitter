/*
 * LonelyMood
 *
 * Version 1.0
 *
 * Sept 28, 2017
 *
 * Copyright (c) My Copyright, CMPUT301, University of Alberta - All Rights
 * Reserved. You may use, distribute, or modify this code under terms and
 * conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Lonely Mood
 *
 * @author arouault
 * @version 1.0
 * @see Mood
 * @since 1.0
 */

public class LonelyMood extends Mood {

    /**
     * Generates LonelyMood
     */

    public LonelyMood() {
        super();
    }

    /**
     * Generates LonelyMood
     * @param date mood date
     */

    public LonelyMood(Date date) {
        super(date);
    }

    /**
     *
     * @return string "lonely" mood
     */

    @Override
    public String mood(){
        return "lonely";
    }
}
