import java.util.Arrays;

public class NOTCamelCase {


    private static String[] polishLetters = {"ę", "ó", "ą", "ś", "ł", "ż", "ź", "ć", "ń"};
    private static String[] englishLetters = {"e", "o", "a", "s", "l", "z", "z", "c", "n"};

    public static String replaceLetter(String input) {
        String result = input.toLowerCase();
        for (int i = 0; i < polishLetters.length; i++) {
            result = result.replace(polishLetters[i], englishLetters[i]);
        }
        return result;
    }

    public static String toCamelCaseChar(String input) {
        char[] words = replaceLetter(input).toCharArray();

        boolean nextLetterShouldBeUppercase = true;
        for (int i = 0; i < words.length; i++) {
            if (Character.isLetter(words[i])) {
                if (nextLetterShouldBeUppercase) {
                    words[i] = Character.toUpperCase(words[i]);
                    nextLetterShouldBeUppercase = false;
                } else {
                    words[i] = Character.toLowerCase(words[i]);
                    nextLetterShouldBeUppercase = true;
                }
            }
        }
        return String.copyValueOf(words);
    }

    public static String toCamelCaseString(String input) {
        String words = replaceLetter(input);
        StringBuilder sb = new StringBuilder();
        boolean nextShouldBeUpperCase = true;


        for (int i = 0; i <words.length(); i++){
            char letter = words.charAt(i);
            if(!Character.isLetter(letter)){
                sb.append(letter);
                continue;
            }
            if(nextShouldBeUpperCase) {
                letter = Character.toUpperCase(letter);
            }
            sb.append(letter);
            nextShouldBeUpperCase  = !nextShouldBeUpperCase;
        }
        return sb.toString();
    }

        public static void main (String[]args){
            String text = "Kasia kasia kąśiŁa";
            System.out.println(toCamelCaseChar(text));
            System.out.println(toCamelCaseString(text));

        }

    }

