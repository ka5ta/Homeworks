import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


class CaesarCipherTest {

    @Test
    void encryptTest() {
        Assert.assertEquals("bcde", CaesarCipher.encrypt("abcd",1));
        Assert.assertEquals("yzab", CaesarCipher.encrypt("abcd",-2));
    }

    @Test
    void positiveModulo() {
        Assert.assertEquals(2, CaesarCipher.positiveModulo(4,2));
        Assert.assertEquals(1, CaesarCipher.positiveModulo(-5,2));
    }
}