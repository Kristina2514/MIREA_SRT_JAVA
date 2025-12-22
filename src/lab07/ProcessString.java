package lab07;

public class ProcessString implements StringFunc {
    public int cLetters(String s) {
        return s.length();
    }

    public String NechetLetters(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            res.append(s.charAt(i));
        }

        return res.toString();
    }

    public String reverseLetters(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
