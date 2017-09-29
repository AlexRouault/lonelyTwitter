/*
 * Tweetable
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
 * Represents any tweetable object
 *
 * @author arouault
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public interface Tweetable {

    /**
     * Getter for message
     * @return string message
     */

    public String getMessage();

    /**
     * Getter for date
     * @return date of tweetable object
     */

    public Date getDate();

}
