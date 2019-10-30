package AddressBook;

public class Director extends Person{

    boolean workFromHome;

    public Director(String name, String surname, String address, String city, String postCode, String phone, String email, boolean workFromHome) {
        super(name, surname, address, city, postCode, phone, email);
        this.workFromHome = workFromHome;

    }
}
