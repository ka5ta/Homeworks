package AddressBook;


import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;


public class PersonTest {
@Test
    public void Person() throws SQLException, ClassNotFoundException {
    Person kasia = new Person("Kasia", "Urbanska", "Polopoka", "Wroclaw", "WC123", "737444888", "k.urbanska87@gmail.com");
    kasia.save(ConnectionDatabase.connectionSettings());
    //Assert.assertEquals(Person.search("Urbanska"),kasia);
    }

}
