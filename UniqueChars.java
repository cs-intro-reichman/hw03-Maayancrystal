/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String newS = "";
        int length = s.length();
        boolean flag = false;
        for (int i = 0 ; i < length ; i++){
            char ch = s.charAt(i);
            for (int j = 0 ; j < length ; j++){
                if(ch == s.indexOf(j)){
                    j = length;
                }
                newS = newS + ch;
            }
        }
        return news;
    }
}
