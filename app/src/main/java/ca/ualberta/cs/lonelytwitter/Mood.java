/*
 * Mood
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
 * Represents a Mood
 *
 * @author arouault
 * @version 1.0
 * @see SadMood
 * @see LonelyMood
 * @since 1.0
 */

public abstract class Mood {
    private Date date;

    /**
     * Constructs class with current date
     */

    public Mood() {
        this.date = new Date();
    }

    /**
     * Constructs class with
     * @param date
     */

    public Mood(Date date) {
        this.date = date;
    }

    /**
     * @return date of object
     */

    public Date getDate() {
        return date;
    }

    /**
     * Sets date to
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return mood of subclass
     */

    public abstract String mood();
}
