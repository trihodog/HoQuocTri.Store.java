package MyStore.java;


public class Products {
    private  String ProductID;
    private  String ProductName;
    private  int Price;
    private  int Quantity;

    public Products(){

    }

    public Products(String productID,String productName,int price,int quantity){
        this.ProductID=productID;
        this.ProductName=productName;
        this.Price=price;
        this.Quantity=quantity;
    }



    public  String getProductID() {
        return ProductID;
    }

    public  void setProductID(String productID) {
        ProductID = productID;
    }

    public  String getProductName() {
        return ProductName;
    }

    public  void setProductName(String productName) {
        ProductName = productName;
    }

    public  int getPrice() {
        return Price;
    }

    public  void setPrice(int price) {
        Price = price;
    }

    public  int getQuantity() {
        return Quantity;
    }

    public  void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
