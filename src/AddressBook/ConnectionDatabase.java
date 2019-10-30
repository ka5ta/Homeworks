package AddressBook;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ConnectionDatabase {

    //public void ConnectionToDB() throws SQLException {
        public static void main (String[] args) {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost/AddressBook?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,"root","DoorToSQL");
                Statement st = connection.createStatement();
                st.executeUpdate("INSERT INTO Person " +
                        "VALUES ('Kasia', 'Simpson', 'Mr.', 'Springfield', 2001, '123345', 'emails@emails.pl')");

                connection.close();
                System.out.println("Connected");
            } catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e);
            }

        }
    }

