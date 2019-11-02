package AddressBook;

import java.sql.Connection;
import java.sql.ResultSet;
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


    public void save(Connection connection) throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate(String.format("INSERT INTO Person VALUES('%s','%s','%s','%s','%s','%s','%s')", this.name, this.surname, this.address, this.city, this.postCode, this.phone, this.email));
    }

    public static Person search(Connection connection, String firstName) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet papakosta = st.executeQuery("SELECT * FROM Person WHERE firstName='"+firstName+"'");

        while(papakosta.next()) {
            String name = papakosta.getString("firstName");
            String surname = papakosta.getString("surname");
            String address = papakosta.getString("address");
            String city = papakosta.getString("city");
            String postCode = papakosta.getString("postCode");
            String phone = papakosta.getString("phone");
            String email = papakosta.getString("email");

            return new Person(name,surname,address,city,postCode,phone,email);
        }
        return null;
    }

}
