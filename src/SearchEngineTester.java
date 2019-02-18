/* File Header & Class Header */ 
// TODO Make sure to have proper style. 

import java.io.*;
import java.util.*;

public class SearchEngineTester {

    /**
     * Methods:
     */

    /* main method
        NOTE: If you plan on throw Exceptions, you need to change "IOException" to "Exception"
        IOExceptions are a specific set of Exceptions.
        */
    public static void main(String[] args) throws IOException {
        SearchEngineTester wct = new SearchEngineTester();


        //This tester uses the command line. That's why the args are passed to the method
        wct.providedTester();


        /** TODO: Add other unit test method calls here */


    } // End Main Method


    /** TODO: Write more unit tests here */


    /**
     * Write more unit tests above this provided tester
     */


    /** This tester helps you test your implementation. It works in the following way
     *  1. What file would you like to use: {nameOfInputFile.txt}
     *  2. What number of commonly occurring words would you like? {numberOfTopWords}(10 would return top 10 words)
     *  3. Would you like these words to be saved to a file, type true or false? {console|file}
     *  4. Would you like looking for length of words or words starting with a certain letter? {length|char}
     *  5. What letter or length would you like to search for? {value}
     *
     *  You are free to change the messages that the user receives! This is just an example.
     */
    public static void providedTester() throws IOException {

        Scanner scan =  new Scanner(System.in);

        // #1 get file name
        System.out.println("What file would you like to use?");
        String userFile = scan.next();

        SearchEngine w = new SearchEngine();
        System.out.println("Reading in File: " + userFile);
        w.getWordsFromFile(userFile);

        System.out.println("Removing common words");
        w.removeCommon("commonWords.txt");

        // #2 get the input number of words you want
        System.out.println("What number of commonly occurring words would you like?");
        int numberOfTopNWords = scan.nextInt();

        // #3 get console or file
        System.out.println("Would you like these words to be saved to a file? (true/false)");
        boolean printToFile = scan.nextBoolean();


        // #4 filter by length or not
        System.out.println("Would you like looking for length of words or words starting with a certain letter? (length/start)");
        String lengthOrLetter = scan.next();
        boolean filterByLength = (lengthOrLetter.toLowerCase().charAt(0) == 'l') ? true : false;
        int lengthValue = 0;
        char charValue = 'a';

        // #5 find letter or length
        if (filterByLength) {
            System.out.println("Whant length?");
            lengthValue = scan.nextInt();
        } else {
            System.out.println("Whant letter?");
            charValue = scan.next().charAt(0);
        }

        System.out.println("Printing the top " + numberOfTopNWords + " words filtered by " + (filterByLength ?
                "length >= " + lengthValue : "starting with character " + charValue) + (printToFile == true ?
                " in file a named myOutput.out" : " on console"));
        w.printWords(filterByLength == true ? w.topNWords(numberOfTopNWords, lengthValue)
                : w.topNWords(numberOfTopNWords, charValue), printToFile);


        //Don't forget to test findWordCount as well
        //An example test is listed below
        /* System.out.println("Count should be 0. It is..." +
            w.findWordCount("the")); */

    }
}



