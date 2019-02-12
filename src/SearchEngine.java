import java.util.*;
import java.io.*;

public class SearchEngine {

  // The ArrayList to store the words and their associated counts
  ArrayList<WordPair> list;
 
  // construct the list
  public SearchEngine() {
    list = new ArrayList<WordPair>();
  }

  // This method will read all the words from the source file and properly
  // update the list
  public void getWordsFromFile( String filename ) throws IOException {
    // Complete this method  TODO
  }

  // An accessor method for the tester file 
  public ArrayList<WordPair> getList(){
    return list;
  }

  //  This method searches for a word in the list and returns its count
  public int findWordCount(String word){
    // Complete this method TODO
    return 0;
  }
  
  // This method will remove any commonly used words from
  // the list. 
  public void removeCommon( String omitFilename ) throws IOException {
     // Complete this method TODO
  }

  // This method finds the top n occurring words in the
  // list with lengths>= length and returns it as an ArrayList.  In the event
  // of a tie, use the first occurring
  // word with that count.
  public ArrayList<WordPair> topNWords(int n, int length) {
    // Complete this method  TODO    
    return null;
    // You may need to use your own variable names
  }
  
  // This method finds the top n occurring words in the
  // list with starting character = beginsWith and returns it as an ArrayList.  In the event
  // of a tie, use the first occurring
  // word with that count.
   public ArrayList<WordPair> topNWords(int n, char beginsWith) {
    // Complete this method  TODO    
    return null;
    // You may need to use your own variable names
    // but max below is the WordPair to print
    //System.out.print(max.getWord() + "("+ max.getCount()+") ");
  }
  
  //This method takes in an ArrayList of WordPairs and a boolean
  //printToFile. If printToFile is true, it should output the 
  //arraylist of wordpair with their counts to a file named 
  //myOutput.out . If printToFile is false, it should print the 
  //arraylist of wordpair with their counts on the console
  public void printWords(ArrayList<WordPair>wordList,boolean printToFile) throws IOException{
   //Complete this method TODO
  }

}
