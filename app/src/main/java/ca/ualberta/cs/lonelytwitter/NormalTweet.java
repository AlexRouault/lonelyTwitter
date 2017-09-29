/*
 * NormalTweet
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
 * Represents a NormalTweet
 *
 * @author arouault
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet{

    /**
     * Constructs NormalTweet
     * @param message message of tweet
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs NormalTweet
     * @param message
     * @param date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     *
     * @return False. Tweet is unimportant
     * @see ImportantTweet
     * @see Tweet
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
