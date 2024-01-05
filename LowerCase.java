/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        int length = s.length();
        String newString ="";
        for(int i = 0 ; i < length ; i++) {
                char ch = s.charAt(i);
                 if (ch >= 'A' && ch <= 'Z'){
                    newString = newString + (char)(ch + 32);
                  }
                  else{
                    newString = newString + (char)(ch + 0);
                  }
        }
        return newString;
        }
        
    }

