package AddressBook;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.Connection;
import java.sql.SQLException;


public class PersonTest {

    Connection connection = ConnectionDatabase.connectionSettings();

    public PersonTest() throws SQLException, ClassNotFoundException {
    }


    @Test
    public void Person() throws SQLException, ClassNotFoundException {
    Person jason = new Person("jason", "Pinakopta", "US", "United States of America", "123456", "111222333", "papakosta7@gmail.com");
    jason.save(connection);
    Person searchedPerson = Person.search(connection, "jason");
    Assert.assertEquals(jason.getName(),searchedPerson.getName());
    Assert.assertEquals(jason.getSurname(),searchedPerson.getSurname());
    Assert.assertEquals(jason.getAddress(),searchedPerson.getAddress());
    Assert.assertEquals(jason.getCity(),searchedPerson.getCity());
    Assert.assertEquals(jason.getPostCode(),searchedPerson.getPostCode());
    Assert.assertEquals(jason.getPhone(),searchedPerson.getPhone());
    Assert.assertEquals(jason.getEmail(),searchedPerson.getEmail());
    }

}
