package com.dw.com4023_music_player;

// Import Scanner to read user input's
import java.util.Scanner;

/*
 * Author: Daniel Wilson
 * 
 * Daniel's Music Player 2025 edition
 * 
 * This project sets the base out for a Music Player and how it would handle a playlist.
 * 
 */

// Create a main class to be run at startup
public class Main {
    // Create a new musicLibrary object to store songs
    private static musicLibrary library = new musicLibrary();
    // Create a Scanner to handle user input
    private static Scanner scanner = new Scanner(System.in);

    // Main methord below, program execution starts here
    public static void main(String[] args) {
        // This flag tracks weather to exit the program or not
        boolean exit = false;
        // Print welcome message
        System.out.println("Welcome to Daniel's Amazing Music Player 2025 Edition!");

        /*
         * Infinate loop for the menu until user decides to exit
         */

        while (!exit) {
            printMenu(); // Prints menu from the printMenu function
            int choice = getIntInput("Choose an option:");
            /* Switch case structure to execute the instruction that the user types 
             * e.g. 5 loads the sample data, error checking in case they type invalid option
             */ 

            switch (choice) {
                case 1 -> addSong(); 
                case 2 -> removeSong();
                case 3 -> library.printAllSongs();
                case 4 -> printSongsOverPlayCount();
                case 5 -> loadSampleData();
                case 6 -> exit = true;
                default -> System.out.println("Invalid choice, please try again."); // Prints error if user types incorrect choice
            }
        }

        System.out.println("Exiting Music Library. Goodbye!"); // Prints upon exiting
    }

    // Prints the CLI menu
    private static void printMenu() {
        System.out.println("\nMenu:"); // Prints header with a newline before it for clean code
        System.out.println("1. Add a new song");
        System.out.println("2. Remove a song");
        System.out.println("3. Print a list of all songs");
        System.out.println("4. Print a list of songs over a certain play count");
        System.out.println("5. Load sample data");
        System.out.println("6. Exit");
    }

    // Function to add a song to the music library
    private static void addSong() {
        System.out.println("Adding a new song...");

        // Get user input for artist name, song title, and playback count
        String artistName = getStringInput("Enter artist name:");
        String songTitle = getStringInput("Enter song title:");
        int playback = getIntInput("Enter play count:");

        // Create a new song object and add it to the library
        library.addSong(new song(artistName, songTitle, playback));
        System.out.println("Song added successfully.");
    }

    // Method to remove a song by title
    private static void removeSong() {
        // Get user input for the specfic song to remove by song title
        String songTitle = getStringInput("Enter the title of the song to remove:");
        // Remove song
        library.removeSong(songTitle);
        System.out.println("If the song existed, it has been removed.");
    }

    // Method to print songs with a play count above a specified number
    private static void printSongsOverPlayCount() {
        // Get user input for the minimum play
        int playCount = getIntInput("Enter the minimum play count:");
        // Print songs with a play count over the given threashold using a function from musicLibrary.java
        library.printSongsOverPlayCount(playCount);
    }

    // Method to load sample song data into the library 
    private static void loadSampleData() {
        System.out.println("Loading sample data...");

        // Add sample songs to the library using the function
        library.addSong(new song("Taylor Swift", "Shake It Off", 532000000));
        library.addSong(new song("Drake", "Hotline Bling", 985000000));
        library.addSong(new song("Ed Sheeran", "Perfect", 1650000000));
        library.addSong(new song("Billie Eilish", "Bad Guy", 1500000000));
        library.addSong(new song("Dua Lipa", "Levitating", 1320000000));
        library.addSong(new song("Post Malone", "Circles", 900000000));
        library.addSong(new song("The Weeknd", "Blinding Lights", 2000000000));
        library.addSong(new song("Imagine Dragons", "Believer", 1100000000));
        library.addSong(new song("Ariana Grande", "7 rings", 1200000000));
        library.addSong(new song("Shawn Mendes", "Senorita", 1300000000));

        System.out.println("Sample data loaded successfully.");
    }

    // Helper methods to get string user input from the user
    private static String getStringInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    // Helper method to get an integer input from the user
    private static int getIntInput(String prompt) {
        System.out.print(prompt + " ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();  // discard invalid input
        }
        int input = scanner.nextInt();
        scanner.nextLine();  // clear newline character after integer input
        return input;
    }
}
