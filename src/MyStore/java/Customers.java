package MyStore.java;

public class Customers {
    private  int CustomerID;
    private  String CustomerName;
    private String Email;
    private  String PhoneNumber;

    public Customers(){

    }
    public Customers(int customerID,String customerName,String email,String phoneNumber){
        CustomerID=customerID;
        CustomerName=customerName;
        Email=email;
        PhoneNumber=phoneNumber;
    }

    public  int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public  String getCustomerName() {
        return CustomerName;
    }

    public  void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public  String getEmail() {
        return Email;
    }

    public  void setEmail(String email) {
        Email = email;
    }

    public  String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
