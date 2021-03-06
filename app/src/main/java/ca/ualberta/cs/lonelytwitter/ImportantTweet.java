/*
 * ImportantTweet
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
 * Represents an Important Tweet
 *
 * @author arouault
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet {

    /**
     * Generates ImportantTweet
     * @param message message of tweet
     */

    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Generates ImportantTweet
     * @param message Tweet message
     * @param date Tweet date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     *
     * @return True. Tweet is important
     */

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
