package AddressBook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        //Statement st = connection.createStatement();
        //st.executeUpdate(String.format("INSERT INTO Person VALUES('%s','%s','%s','%s','%s','%s','%s')", this.name, this.surname, this.address, this.city, this.postCode, this.phone, this.email));
        String sqlQuery = ("INSERT INTO Person (firstName, surname, address, city, postCode, phone, email)  VALUES(?,?,?,?,?,?,?)");
        PreparedStatement prepStmt = connection.prepareStatement(sqlQuery);
        prepStmt.setString(1,this.name);
        prepStmt.setString(2,this.surname);
        prepStmt.setString(3,this.address);
        prepStmt.setString(4,this.city);
        prepStmt.setString(5,this.postCode);
        prepStmt.setString(6,this.phone);
        prepStmt.setString(7,this.email);
        prepStmt.executeUpdate();
        prepStmt.close();
    }

    public static List<Person> search(Connection connection, String firstName) throws SQLException {
        ArrayList<Person> people = new ArrayList<>();
        String sqlStatement ="SELECT * FROM Person WHERE firstName=?";
        PreparedStatement prepStmt = connection.prepareStatement(sqlStatement);
        prepStmt.setString(1,firstName);
        ResultSet result = prepStmt.executeQuery();

        while(result.next()) {
            String name = result.getString("firstName");
            String surname = result.getString("surname");
            String address = result.getString("address");
            String city = result.getString("city");
            String postCode = result.getString("postCode");
            String phone = result.getString("phone");
            String email = result.getString("email");
            Person person = new Person(name,surname,address,city,postCode,phone,email);
            people.add(person);

        }
        System.out.println(people.size());
        return people;
    }

}
