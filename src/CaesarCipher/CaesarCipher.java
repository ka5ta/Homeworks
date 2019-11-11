package CaesarCipher;

public class CaesarCipher {

    public CaesarCipher() {
    }

    public  String encrypt(String text, int shift) {
        char[] lettersBeforeEncryption = text.toCharArray();

        for (int i = 0; i < lettersBeforeEncryption.length; i++) {
            if (Character.isLetter(lettersBeforeEncryption[i])) {

                char startingLetter = Character.isUpperCase(lettersBeforeEncryption[i]) ? 'A' : 'a';
                int letterIndex = lettersBeforeEncryption[i];
                letterIndex -= startingLetter; //remove offset so alphabet starts at 0
                letterIndex += shift; // encryption

                letterIndex = (char) positiveModulo(letterIndex, 26); // wrap value into alphabet range
                char finalLetter = (char) (letterIndex + startingLetter);

                lettersBeforeEncryption[i] = finalLetter;
            }
        }
        return new String(lettersBeforeEncryption);
    }

    public String decrypt(String text, int shift){   //abcd - bcde
        String decryptedText = encrypt(text, -shift);
        return decryptedText;
    }

    public  int positiveModulo(int a, int b) {
        int modulo = a % b;

        if (modulo < 0) {
            modulo += b;
        }
        return modulo;
        //return modulo < 0 ? modulo+b : modulo;
    }

    public static void main(String[] args) {
    }
}
