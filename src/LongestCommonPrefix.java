
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(LongestPrefix(new String[] {"bazar", "bazgur", "bazz"}));
        System.out.println(LongestPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(LongestPrefix(new String[] {"dog", "racecar", "car"}));
        
    }


    public static String LongestPrefix(String[] stringArray) {

        StringBuilder longestCommonPrefix = new StringBuilder();
        if(stringArray == null || stringArray.length == 0) {

            return longestCommonPrefix.toString();

        }

        int minLength = stringArray[0].length();

        for(int i=1;i<stringArray.length;i++) {

            minLength = Math.min(minLength, stringArray[i].length());

        }


        for(int i =0;i<minLength;i++) {

            char string = stringArray[0].charAt(i);

            for(String string2 : stringArray) {

                if(string2.charAt(i)!=string) {

                    return longestCommonPrefix.toString();

                }

            }

            longestCommonPrefix.append(string);

        }



        return longestCommonPrefix.toString();

    }
}
