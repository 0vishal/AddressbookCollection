import java.util.*;

class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city , String state,String zip, String phoneNumber, String email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empname " + firstName + " Lastname" + lastName + " address" + address + " city " + state + " zip " + zip +
                " phonenumber" + phoneNumber + " email" + email;

    }

}




public class Addressbook {

    static ArrayList<Contact> list = new ArrayList<Contact>();
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Addressbook> book = new ArrayList<Addressbook>();
    Hashtable<String, String> citydictionary = new Hashtable<String, String>();
    Hashtable<String, String> statedictionary = new Hashtable<String, String>();

    public Addressbook(String s) {
    }

    private void AddContact() {
        System.out.println("Enter FirstName");
        String firstName = sc.next();
        System.out.println("Enter LastName");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String area = sc.next();
        System.out.println("Enter CityName");
        String city = sc.next();
        System.out.println("Enter StateName");
        String state = sc.next();
        System.out.println("Enter ZipCode");
        String zip = sc.next();
        System.out.println("Enter PhoneNumber");
        String phoneNumber = sc.next();
        System.out.println("Enter Email");
        String email = sc.next();

        list.add(new Contact(firstName, lastName, area, city, state, zip, phoneNumber, email));

        if(firstName.equals(list.get(0).getFirstname()))
        {
            System.out.println("Contact already exist");
        }
        else
        {
            list.add( new Contact(firstName, lastName, area, city, state, zip, phoneNumber, email));
            System.out.println(list);
        }
    }


    public static String EditContact()
    {
        String name;
        System.out.println(list.get(0));

        System.out.println("Enter First Name of Details to be Edited: ");
        name = sc.next();

        if (name.equals(list.get(0).getFirstname()))
        {
            System.out.println("Enter FirstName");
            list.get(0).setFirstname(sc.next());
            System.out.println("Enter LastName");
            list.get(0).setLastname(sc.next());
            System.out.println("Enter Address");
            list.get(0).setAddress(sc.next());
            System.out.println("Enter CityName");
            list.get(0).setCity(sc.next());
            System.out.println("Enter StateName");
            list.get(0).setState(sc.next());
            System.out.println("Enter ZipCode");
            list.get(0).setZip(sc.next());
            System.out.println("Enter PhoneNumber");
            list.get(0).setPhonenumber(sc.next());
            System.out.println("Enter Email");
            list.get(0).setEmail(sc.next());

            System.out.println(list.get(0));
            return "we have edits the contact";
        }
        else
        {
            return "Name Not Available in List";
        }
    }
    public static String DeleteContact()
    {
        String name;
        System.out.print("Enter the name of contact to be deleted");
        name =sc.next();

        if (name.equals(list.get(0).getFirstname()))
        {
            list.remove(0);
            return "we have deleted the contact";
        }
        else
        {
            return "Name Not Available in List";
        }
    }
    public void Mulitplecontact()
    {
        System.out.println("Enter the number of person to be added ");
        int number = sc.nextInt();

        for (int i =0;i<number;i++) {
            System.out.println("Enter FirstName");
            String firstName = sc.next();
            System.out.println("Enter LastName");
            String lastName = sc.next();
            System.out.println("Enter Address");
            String area = sc.next();
            System.out.println("Enter CityName");
            String city = sc.next();
            System.out.println("Enter StateName");
            String state = sc.next();
            System.out.println("Enter ZipCode");
            String zip = sc.next();
            System.out.println("Enter PhoneNumber");
            String phoneNumber = sc.next();
            System.out.println("Enter Email");
            String email = sc.next();

            list.add(new Contact(firstName, lastName, area, city, state, zip, phoneNumber, email));

        }
        System.out.println(list);
    }

    public void Mulitpleaddressbook()
    {
        System.out.println("Enter the number of Addressbook to be added ");
        int number = sc.nextInt();

        for (int i =0;i<number;i++) {
            book.add( new Addressbook("Address book"+i+ " "));
        }
        System.out.println(book);
    }

    public void searchincity()
    {
        System.out.println("Enter the city to search for people in it");
        String city = sc.next();
        for (int i=0;i<list.size();i++)
        {
            if (city.equals(list.get(city)))
            {
                System.out.println(list.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Problem\n");

        Addressbook info = new Addressbook();
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("1.Addcontact 2.Edit 3.Delete 4.Multiplecontact 5.Multipleaddressbook 6.searchincity 7.searchcityindictnary 8.searchstateindictionary");
        int option = sc.nextInt();
        switch (option)
        {
            case 1:
                info.AddContact();
            case 2:
                info.EditContact();
            case 3:
                info.DeleteContact();
            case 4:
                info.Mulitplecontact();
            case 5:
                info.Mulitpleaddressbook();
            case 6:
                info.searchincity();
            case 7:
                info.searchincitydictionary();
            case 8:
                info.searchinstatedictionary();
        }

    }
}