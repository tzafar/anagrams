import static java.util.Arrays.sort;

public class Anagrams {

    public boolean isAnagram(String text1, String text2) {

        if(text1 == null || text2 == null){
            return false;
        }

        if(text1.length() == 0 || text2.length() == 2){
            return true;
        }

        char[] text1CharArray = this.sanitize(text1).toCharArray();
        char[] text2CharArray = this.sanitize(text2).toCharArray();

        sort(text1CharArray);
        sort(text2CharArray);

        return new String(text1CharArray).equals(new String(text2CharArray));
    }

    private String sanitize(String text){
        return text.replace(" ", "");
    }
}

