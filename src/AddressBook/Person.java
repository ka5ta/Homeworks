package AddressBook;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
    private String name;
    private String surname;
    private String address;
    private String city;
    private String postCode;
    private String phone;
    private String email;

    public Person(String name, String surname, String address, String city, String postCode, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public String getAddress() { return address; }

    public String getCity() { return city; }

    public String getPostCode() { return postCode; }

    public String getPhone() { return phone; }

    public String getEmail() { return email; }


    public void save(Connection cd) throws SQLException {
        Statement st = cd.createStatement();
        st.executeUpdate("INSERT INTO Person " +
                "VALUES ('Kasia', 'Simpson', 'Mr.', 'Springfield', 2001, '123345', 'emails@emails.pl')");

        cd.close();

    }
    public void search(ConnectionDatabase cd){
        //cd.ConnectionToDB();

    }

}
