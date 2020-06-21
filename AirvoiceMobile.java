import java.util.Scanner;

class Customer {
    private String customerName;
    private long contactNumber;
    private String emailId;
    private int age;

    public Customer() {
        customerName = null;
        contactNumber = 0;
        emailId = null;
        age = 0;
    }
     
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class AirvoiceMobile {
    public static void main(String[] args) {
        String name, email;
        long contactNumber;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        name = sc.nextLine();
        System.out.println("Enter the ContactNumber:");
        contactNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the EmailId:");
        email = sc.nextLine();
        System.out.print("Age:");
        age = sc.nextInt();

        Customer customer = new Customer();

        customer.setCustomerName(name);
        customer.setContactNumber(contactNumber);
        customer.setEmailId(email);
        customer.setAge(age);

        System.out.println("Name:" + customer.getCustomerName());
        System.out.println("ContactNumber:" + customer.getContactNumber());
        System.out.println("EmailId:" + customer.getEmailId());
        System.out.print("Age:" + customer.getAge());
        
        sc.close();
    }
}