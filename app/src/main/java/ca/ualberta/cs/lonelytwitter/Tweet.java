/*
 * Tweet
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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author arouault
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    /**
     * Constructs Tweet objects with current date
     * @param message message of tweet
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects with specified date
     *
     * @param message Tweet message
     * @param date Tweet date
     */

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Sets the date to the specified date
     * @param date new Tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Converts the tweet to a string format
     * @return string containing date of tweet and message
     */

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    /**
     * Sets tweet message
     *
     * @param message Tweet message
     * @throws TweetTooLongException when tweet message is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Getter for date
     * @return date of tweet
     */

    public Date getDate(){
        return date;
    }

    /**
     * Getter for message
     * @return message
     */

    public String getMessage(){
        return message;
    }

    /**
     * Abstract method to return whether tweet is important
     * @return boolean; True if tweet is of subclass ImportantTweet
     *                  False if tweet is of subclass NormalTweet
     * @see ImportantTweet
     * @see NormalTweet
     */

    public abstract Boolean isImportant();

}
