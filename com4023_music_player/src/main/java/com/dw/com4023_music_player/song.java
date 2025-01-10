package com.dw.com4023_music_player;

/*
 * Author: Daniel Wilson
 * 
 * Daniel's Music Player 2025 edition
 * 
 * This project sets the base out for a Music Player and how it would handle a playlist.
 * 
 */

public class song {
    // Declare private values for the Artist, Song and Playback, inside a Main Class Song.
    private String artistName;
    private String songTitle;
    private int playback;

    /* 
    * Declare a Public Methord for building a song with 
    * required data (Artist name (String artistName), 
    * Song title (String songTitle) and the amount of 
    * times it's been played (int playback)
    */ 
    public song(){

    }

    // Constructor to intialize the song with artist name, song titlea and playback count
    public song(String artistName, String songTitle, int playback){
        this.artistName = artistName; // Sets artist name for the current song you are creating
        this.songTitle = songTitle; // Sets song title for the cuurent song you are creating
        this.playback = playback; // Sets playback count for the current song you are creating
    }

    /*
     * Function to get the artist's name
     */

     public String getNameOfArtist(){
        return this.artistName;
     }

     /*
      * Function to set the artist's name
      */
    
    public void setNameOfArtist(String artistName){
        this.artistName = artistName;
    }

    /*
     * Function to get the title of the song
     */
    public String getTitleOfSong(){
        return this.songTitle;
    }

    /*
     * Function to set the title of the song
     */
    public void setTitleOfSong(String songTtile){
        this.songTitle = songTtile;
    }

    /*
     * Function to get the playback time of said song
     */

    public int getPlaybackTime(){
        return this.playback;
    }

    /*
     * Function to set the playback time of said song
     */
    
    public void setPlaybackTime(int playback){
        this.playback = playback;
    }

    // Override the toString method to display the song details in a user-friendly format
    @Override
    public String toString() {
        return "Title: " + songTitle + ", Artist: " + artistName + ", Plays: " + playback;
    }

}
