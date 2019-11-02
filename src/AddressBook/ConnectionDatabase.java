package AddressBook;

import java.sql.*;

public class ConnectionDatabase {

    static Connection createConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost/AddressBook?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

        return DriverManager.getConnection(url,"root","DoorToSQL");
    }

}

