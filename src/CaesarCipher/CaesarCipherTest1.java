package CaesarCipher;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class CaesarCipherTest1 {

    CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    public void encryptTest() {
        Assert.assertEquals("bcde", caesarCipher.encrypt("abcd",1));
        Assert.assertEquals("GhIj", caesarCipher.encrypt("IjKl",-2));
    }

    @Test
    public void positiveModulo() {
        Assert.assertEquals(1, caesarCipher.positiveModulo(5,2));
        Assert.assertEquals(1, caesarCipher.positiveModulo(-5,2));
    }

    @Test
    public void decryptTest() {
        Assert.assertEquals("abcd", caesarCipher.decrypt("bcde",1));
        Assert.assertEquals("IjKl", caesarCipher.decrypt("GhIj",-2));
    }

    @Test
    @Parameters({"abcd,2",
                "defg,-2"})
    public void bothSidesTest(String original, int shift){
        String encrypted = caesarCipher.encrypt(original, shift);
        String decrypted = caesarCipher.decrypt(encrypted, shift);
        Assert.assertEquals(original,decrypted);
    }
}