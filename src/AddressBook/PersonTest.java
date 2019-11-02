package AddressBook;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class PersonTest {

    Connection connection = ConnectionDatabase.createConnection();

    public PersonTest() throws SQLException, ClassNotFoundException {
    }

    @Before
    public void deleteTableContent() throws SQLException {
        String deleteSql = "DELETE FROM PERSON";
        PreparedStatement prepStmt = connection.prepareStatement(deleteSql);
        prepStmt.executeUpdate();
    }

    @After
    public void closeConnection() throws SQLException {
        connection.close();
    }

    @Test
    public void Person() throws SQLException, ClassNotFoundException {
        Person jason = new Person("jason", "Pinakoptas'); CREATE TABLE asdf( someColumn varchar(1)); --", "US", "United States of America", "123456", "111222333", "papakosta7@gmail.com");
        jason.save(connection);
        List<Person> people = Person.search(connection, "jason");
        for (Person person : people) {
            Assert.assertEquals(jason.getName(), person.getName());
        }
    }


}
