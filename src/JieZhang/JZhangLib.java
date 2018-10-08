package JieZhang;

public class JZhangLib {

    // datestr                                                                      // The user inputs a date in the format of mm/dd/yy.
    // datestr                                                                      // The datestr  method changes the format to dd-mm-yy.
    // datestr                                                                      // By switching the position of the day and the month.
    // Then replaces / with -.
    public static String datestr(String input) {
        String day = input.substring(3, 5);      //Takes the day from the String
        String month = input.substring(0, 2);    // Takes the month from the String
        String year = input.substring(6);        // Takes the year from the String
        return day + "-" + month + "-" + year;   //Return a combined message of dd-mm-yy
    }


    //isPalindrome                                                              // The user inputs a word.
    //isPalindrome                                                              // The isPalindrome method first rearrange the word character
    //isPalindrome                                                              // by character backward, then compares the original word to
                                                                                // "backward". If they are the same, the word is a palindrome.
    public static boolean isPalindrome(String word) {
        int i = word.length();                               //Initialize i as the length of "word"
        String backward = "";                                // String to store the backward "word"
        while (i > 0)                                        // Iterate while i > 0
        {
            backward = backward + word.substring(i - 1, i);  //Stores the "word" backward.
            i--;
        }
        if (word.compareTo(backward) == 0) {                 //Compares the original "word" to "backward"
            return true;                                     //Return true if they are equal, else return false
        } else {
            return false;
        }
    }


    // sumUpTo                                                                        // The user inputs a number
    // sumUpTo                                                                        // The sumUpTo method returns the sum of the number entered
    // sumUpTo                                                                        // and all its previous integers starting from 0.

    public static int sumUpTo(int num) {
        int sum = 0;                       //Initialize a variable to store the sum value
        while (num > 0)                    // Iterate while num > 0
        {
            sum = sum + num;               // Add the number to "sum"
            num--;                         // num = num - 1
        }
        return sum;                        // return the sum
    }


    //multiplicationTable                                                                // The user inputs a base and a range.
    //multiplicationTable                                                                // The multiplicationTable method displays the
    //multiplicationTable                                                                // base*n for n = all integers from 0 to range.

    public static String multiplicationTable(int base, int range) {
        String output = "";                                // A string to store the output
        while (range >= 0)                                 // Iterate while range  >= to 0
        {
            output = base * range + " " + output;          //stores the result of base*range to "output"
            range--;                                       // range = range - 1
        }
        return output;                                     //return the output
    }


    //CutOut                                                                                 // The user inputs a mainstr and a substr.
    //CutOut                                                                                 // The CutOut method returns the mainstr with the
    //CutOut                                                                                 // first occurrence of the substr removed.

    public static String CutOut(String mainstr, String substr) {
        int cut = 0;                                                                     //Initialize "cut" to 0
        cut = mainstr.indexOf(substr);                                                   // Stores the indexOf the substr to "cut"
        return mainstr.substring(0, cut) + mainstr.substring(cut + substr.length());     // return the String with substr removed
    }
}
