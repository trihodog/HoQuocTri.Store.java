package MyStore.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Admin {
    static ArrayList<Products> dsSP=new ArrayList<>();
    static ArrayList<Customers> dsKH=new ArrayList<>();
    public static void Interface1() {
        System.out.println("""
                                
                LỰA CHỌN CỦA BẠN
                
                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                
                | 1: Thêm Sản Phẩm            |            
                | 2: Chỉnh Sửa Sản Phẩm       |
                | 3: Xóa Sản Phẩm             |
                | 4: Xem Toàn Bộ Sản Phẩm     |
                | 5: Tìm Kiếm Sản Phẩm        |
                | 6: Sắp Xếp Sản Phẩm         |
                | 7: Thoát                    |
                 - - - - - - - - - - - - - - -
                """);
        int Choose = new Scanner(System.in).nextInt();
        switch (Choose) {
            case 1:
                AddProduct();
                break;
            case 2:
                EditProduct();
                break;
            case 3:
                DeleteProduct();
                break;
            case 4:
                OutputProduct();
                break;
            case 5:
                SeachProduct();
                break;
            case 6:
                SortProduct();
                break;
            case 7:
               Menu();
                break;
        }
    }
    public static void AddProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Sản Phẩm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập Sản Phẩm thứ "+(i+1)+" :");

            System.err.println("Nhập ID (ID không trùng với ID đã có: )");
            sc.nextLine();
            String ProductID = sc.nextLine();
            System.err.println("Nhập Name");
            String ProductName = sc.nextLine();
            System.err.println("Nhập Giá");
            int Price = sc.nextInt();
            System.err.println("Số Lượng");
            int Quantity = sc.nextInt();
            Products p = new Products(ProductID, ProductName, Price, Quantity);
            dsSP.add(p);



            /*dsSP.add(new Products(ProductID, ProductName, Price, Quantity));*/
        }

    }

    public static void EditProduct(){
        boolean seach=false;
        System.out.println("Nhập Mã Sản Phẩm Muốn đổi");
        String maSP= new Scanner(System.in).nextLine();
        for (Products products : dsSP) {
            if (products.getProductID().equals(maSP)) {
                seach = true;
                System.err.println("Nhập ID mới");
                String newId = new Scanner(System.in).nextLine();
                System.err.println("Nhập Tên mới");
                String newName = new Scanner(System.in).nextLine();
                System.err.println("Nhập Giá mới");
                int newPrice = new Scanner(System.in).nextInt();
                System.err.println("Nhập số lượng mới");
                int newQuatyti = new Scanner(System.in).nextInt();
                products.setProductID(newId);
                products.setProductName(newName);
                products.setPrice(newPrice);
                products.setQuantity(newQuatyti);
            }
          
            }if (seach ==false) {
                System.err.println("Không Tìm Thấy Mã Sp");
        }
    }


    public static void DeleteProduct(){
        boolean seach=false;
        System.err.println("Nhập Mã Sản Phẩm Muốn xóa");
        String maSP = new Scanner(System.in).nextLine();
        for (int i=0;i<dsSP.size();i++){
            if(dsSP.get(i).getProductID().equals(maSP)){
                seach=true;
                dsSP.remove(i);
            }
        }
        if(seach==false){
            System.err.println("Không Tìm Thấy Mã Sp");
        }
    }


    public static void OutputProduct(){
        System.out.println("Danh Sách Khách Hàng");
        for (Products products : dsSP) {
            System.err.println("Mã SP: " + products.getProductID() + "\tTên SP: " + products.getProductName() + "\tGiá SP: " + products.getPrice() + "\tSố Lượng SP: " + products.getQuantity());

        }
    }



    public static void SeachProduct(){
        boolean seach=false;
        System.out.println("Nhập Tên Sản Phẩm cần tìm: ");
        String nameSp= new Scanner(System.in).nextLine();
        for (Products products : dsSP)
            if (products.getProductName().contains(nameSp)) {
                seach = true;
                System.out.println("Mã SP: " + products.getProductID() + "\tTên SP: " + products.getProductName() + "\tGiá SP: " + products.getPrice() + "\tSố Lượng SP: " + products.getQuantity());
            }
        if (seach==false){
            System.out.println("Không Tìm Thấy Sản Phẩm");
        }
    }


    public static void SortProduct(){
        System.out.println("Sắp Xếp Theo Tên (a-z)");
        Collections.sort(dsSP, new SortProductsName());
        for (Products sp:dsSP)
            System.err.println("Mã SP: "+sp.getProductID()+"\tTên SP: "+sp.getProductName()+"\tGiá SP: "+sp.getPrice()+"\tSố Lượng SP: "+sp.getQuantity());


        System.out.println("Sắp Xếp Theo Giá(Cao-Thấp)");
        Collections.sort(dsSP, new SortProductsPrice());
        for (Products sp:dsSP)
            System.err.println("Mã SP: "+sp.getProductID()+"\tTên SP: "+sp.getProductName()+"\tGiá SP: "+sp.getPrice()+"\tSố Lượng SP: "+sp.getQuantity());

    }
    public static void Interface2(){
        System.out.println("""
                                  
                LỰA CHỌN CỦA BẠN             
                                  
                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
                | 1: Thêm Khách Hàng          |            
                | 2: Chỉnh Sửa Khách Hàng     |
                | 3: Xóa Khách Hàng           | 
                | 4: Xem Toàn Bộ Khách Hàng   |
                | 5: Tìm Kiếm Khách Hàng      |
                | 6: Sắp Xếp Khách Hàng       |
                | 7: Thoát                    |
                 - - - - - - - - - - - - - - - 
                """);
        int Choose= new Scanner(System.in).nextInt();
        switch (Choose) {
            case 1:
                AddCustomer();
                break;
            case 2:
                EditCustomer();
                break;
            case 3:
                DeleteCustomer();
                break;
            case 4:
                OutputCustomer();
                break;
            case 5:
                SeachCustomer();
                break;
            case 6:
                SortCustomer();
                break;
            case 7:
               Menu();
               break;
        }

    }
    public static void AddCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Khách Hàng: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập Khách Hàng thứ "+(i+1)+" :");

            System.err.println("Nhập ID (ID không trùng với ID đã có: )");
            int CustomerID= sc.nextInt();
            sc.nextLine();
            System.err.println("Nhập Name");
            String CustomerName = sc.nextLine();
            System.err.println("Email:");
            String Email= sc.nextLine();
            System.err.println("Số Điện Thoai: ");
            String PhoneNumber = sc.nextLine();
            dsKH.add(new Customers(CustomerID, CustomerName, Email, PhoneNumber));
        }
    }


    public static void EditCustomer(){
        boolean seach=false;
        System.out.println("Nhập Mã Khách Hàng Muốn đổi");
        int maKH= new Scanner(System.in).nextInt();
        for (int i=0;i<dsKH.size();i++){
            if(dsKH.get(i).getCustomerID()==maKH){
                seach=true;
                System.err.println("Nhập ID mới");
                int newID= new Scanner(System.in).nextInt();
                System.err.println("Nhập Tên mới");
                String newName= new Scanner(System.in).nextLine();
                System.err.println("Nhập Email mới");
                String newEmail= new Scanner(System.in).nextLine();
                System.err.println("Nhập SĐT mới");
                String newPhoneNumber= new Scanner(System.in).nextLine();
                dsKH.get(i).setCustomerID(newID);
                dsKH.get(i).setCustomerName(newName);
                dsKH.get(i).setEmail(newEmail);
                dsKH.get(i).setPhoneNumber(newPhoneNumber);
            }

            }if(seach==false){
                System.out.println("Không Tìm Thấy Mã KH");
        }
    }


    public static void DeleteCustomer(){
        boolean seach=false;
        System.out.println("Nhập Mã Khách Hàng Muốn xóa");
        int maKH = new Scanner(System.in).nextInt();
        for (int i=0;i<dsKH.size();i++){
            if(dsKH.get(i).getCustomerID()==maKH){
                seach=true;
                dsKH.remove(i);
            }
        }
        if(seach==false){
            System.err.println("Không Tìm Thấy Mã KH");
        }
    }


    public static void OutputCustomer(){
        System.out.println("Danh Sách Khách Hàng");
        for (int i=0;i<dsKH.size();i++)
            System.err.println("Mã KH: "+dsKH.get(i).getCustomerID()+"\tTên KH: "+dsKH.get(i).getCustomerName()+"\tEmail: "+dsKH.get(i).getEmail()+"\tSố Điện Thoại: "+dsKH.get(i).getPhoneNumber());
    }


    public static void SeachCustomer(){
        boolean seach=false;
        System.out.println("Nhập Tên Khách Hàng cần tìm: ");
        String nameKH= new Scanner(System.in).nextLine();
        for(int i=0;i<dsKH.size();i++)
            if(dsKH.get(i).getCustomerName().contains(nameKH)){
                seach=true;
                System.err.println("Mã KH: "+dsKH.get(i).getCustomerID()+"\tTên KH: "+dsKH.get(i).getCustomerName()+"\tEMail: "+dsKH.get(i).getEmail()+"\tSỐ ĐIỆN Thoại: "+dsKH.get(i).getPhoneNumber());
            }
        if (seach==false){
            System.err.println("Không Tìm Thấy Khách Hàng");
        }
    }


    public static void SortCustomer(){
        System.out.println("Sắp Xếp Theo Tên (a-z)");
        Collections.sort(dsKH, new SortCustomersName());
        for (Customers kh:dsKH)
            System.err.println("Mã KH: "+kh.getCustomerID()+"\tTên KH: "+kh.getCustomerName()+"\tEmail: "+kh.getEmail()+"\tSố Điện Thoại: "+kh.getPhoneNumber());
    }
    public static void Menu() {
        System.out.println("""
                   **********************************
                   ********** Fashion Store *********
                   **********************************
                         _ _ _ _ _ _ _ _ _ _ _ _       
                        | 1: Quản Lý Sản Phẩm   |
                        | 2: Quản Lý Khách Hàng |
                        | 3: Thoát              |
                         - - - - - - - - - - - -
                        
                   **********************************       
                """);
        System.out.println("Lựa Chọn: ");
        while (true) {
            int Choose = new Scanner(System.in).nextInt();
            switch (Choose) {
                case 1:
                    while (true) {
                        Interface1();
                    }
                case 2:
                    while (true) {
                        Interface2();
                    }
                case 3:
                    System.err.println("Cảm Ơn!");
                    System.exit(0);
                    break;
            }
        }}
}
