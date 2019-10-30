package AddressBook;


import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
@Test
    public void Person(){
    Person kasia = new Person("Kasia", "Urbanska", "Polopoka", "Wroclaw", "WC123", "737444888", "k.urbanska87@gmail.com");
    kasia.save();
    Assert.assertEquals(Person.search("Urbanska"),kasia);
    }

}

}