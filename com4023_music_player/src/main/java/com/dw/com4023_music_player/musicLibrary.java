package com.dw.com4023_music_player;

import java.util.ArrayList;
import java.util.List; // Import a neccesary class to work with lists

/*
 * Author: Daniel Wilson
 * 
 * Daniel's Music Player 2025 edition
 * 
 * This project sets the base out for a Music Player and how it would handle a playlist.
 * 
 */

// Create the main class to be used as an interface for the main program
public class musicLibrary {
    // Declare a list to hold songs
    private List<song> songs; 

    // constructor to initialise the music library
    public musicLibrary() {
        this.songs = new ArrayList<>(); // Initialised the songs list as an empty ArrayList
    }

    // Function to add a song to the library
    public void addSong(song song) {
        songs.add(song); // Add the song to the list
        System.out.println("Added: " + song); // Print a confirmation message 
    }

    // Function to remove a song by its title 
    public void removeSong(String title) { 
        // Remove the song with the matching tile (case insensitive)
        songs.removeIf(song -> song.getTitleOfSong().equalsIgnoreCase(title));
        System.out.println("Removed song titled: " + title);
    }

    // Function to print all songs in the library
    public void printAllSongs() {
        System.out.println("All Songs:");
        // Iterate through each song in this list an print it
        for (song song : songs) {
            System.out.println(song);
        }
    }

    // Function to print all songs with play counts over a given threshold
    public void printSongsOverPlayCount(int playCount) {
        System.out.println("Songs with over " + playCount + " plays:");
        /*
         *  Iterate through each song and print those with a play count over the given play count by the user
        */ 
        for (song song : songs) {
            if (song.getPlaybackTime() > playCount) {
                System.out.println(song);
            }
        }
    }
}
