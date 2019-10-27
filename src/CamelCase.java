public class CamelCase {

    private static final String[] polishLetters = {"ę", "ó", "ą", "ś", "ł", "ż", "ź", "ć", "ń"};
    private static final String[] englishLetters = {"e", "o", "a", "s", "l", "z", "z", "c", "n"};

    public static String replaceLetter(String input) {
        String result = input.toLowerCase();
        for (int i = 0; i < polishLetters.length; i++) {
            result = result.replace(polishLetters[i], englishLetters[i]);
        }
        return result;
    }

    public static String camelCase(String input){
        String[] words = replaceLetter(input).split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String word: words) {
            word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "Kasia kasia kąśiŁa\nkotek puszek";
        System.out.println(camelCase(text));
    }
}

