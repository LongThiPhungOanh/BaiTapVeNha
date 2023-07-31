package aQBaiTap1;
import java.io.*;
import java.util.*;
public class ManagerProduct extends ManagerCategory {
    private final Scanner input = new Scanner(System.in);
    List<Product> productList;
    public ManagerProduct(){
        productList = new ArrayList<>();
        productList = readProduct();
    }
    public int returnId() {
        showCategory();
        int checkI = -1;
        try {
            System.out.println("Name Category");
            String name = input.nextLine();
            for (int i = 0; i < categoryList.size(); i++) {
                if (categoryList.get(i).getName().equals(name)) {
                    checkI = i;
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("error, please re-enter");
        }
        return checkI;
    }
    public void addProduct(int checkI) {
        // returnId();
        try {
            if (checkI >= 0) {
                System.out.println("Name");
                String nameProduct = input.nextLine();
                System.out.println("Price");
                Double priceProduct = Double.parseDouble(input.nextLine());
                System.out.println("Quantity");
                int newQuantity = Integer.parseInt(input.nextLine());
                Product newProduct = new Product(Product.getTemp(), nameProduct, priceProduct, newQuantity, categoryList.get(checkI));
                productList.add(newProduct);
                writeProduct(productList);
                System.out.println("successful");
            }
            if (checkI < 0) {
                System.out.println("Name not found");
            }
        } catch (Exception e) {
            System.out.println("error, please re-enter");
        }
    }
    public void editProduct (int checkI) {
        displayProduct();
        try {
            if (checkI >= 0){
                int checkId = -1;
                System.out.println("Id product you to want edit");
                int id = Integer.parseInt(input.nextLine());
                for (int i = 0; i < productList.size(); i++) {
                    if (id == productList.get(i).getId()){
                        checkId = i;
                        break;
                    }
                } if (checkId >= 0){
                    System.out.println("New name");
                    String nameProduct = input.nextLine() ;
                    System.out.println("New price");
                    Double priceProduct = Double.parseDouble(input.nextLine());
                    System.out.println("New quantity");
                    int newQuantity = Integer.parseInt(input.nextLine());
                    productList = readProduct();
                    productList.get(checkId).setId(Product.getTemp());
                    productList.get(checkId).setName(nameProduct);
                    productList.get(checkId).setPrice(priceProduct);
                    productList.get(checkId).setQuantity(newQuantity);
                    writeProduct(productList);
                } else {
                    System.out.println("Id not found!");
                }
            } else {
                System.out.println("Name Category not found!");
            }
        } catch (Exception e){
            System.out.println("error, please re-enter");
        }
    }
    public String returnName(){
        showCategory();
        String name = null;
        try {
            System.out.println("Name Category want to show");
            name = input.nextLine();
        } catch (Exception E){
            System.out.println("error, please re-enter");
        }
        return name;
    }
    public void displayProduct(){
        productList = readProduct();
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    public void showProduct(String name) {
        try {
            boolean contains = false;
            for (Category category : categoryList) {
                if (category.getName().equals(name)){
                    contains = true;
                    break;
                }
            } if (contains){
                productList = readProduct();
                for (Product display: productList) {
                    if(display.getCategory().getName().equals(name)){
                        System.out.println(display);
                    }
                }
            } else {
                System.out.println("Name not found");
            }
        } catch (Exception e){
            System.out.println("error, please re-enter");
        }
    }
    public List<Product> maxPrice(){
        List<Product> maxPrice = new ArrayList<>();
        if(productList.size() == 0){
            return maxPrice;
        }
        double max = productList.get(0).getPrice();
        for (Product value : productList) {
            if (value.getPrice() > max) {
                max = value.getPrice();
            }
        }
        for (Product product : productList) {
            if (max == product.getPrice()) {
                maxPrice.add(product);
            }
        }
        return maxPrice;
    }
    public List<Product> minPrice(){
        List<Product> minPrice = new ArrayList<>();
        if(productList.size()==0){
            return minPrice;
        }
        double min = productList.get(0).getPrice();
        for (Product value : productList) {
            if (value.getPrice() < min) {
                min = value.getPrice();
            }
        }
        for (Product product : productList) {
            if (min == product.getPrice()) {
                minPrice.add(product);
            }
        }
        return minPrice;
    }
    public void displayMaxMin(List<Product> max, List<Product> min){
        if(max.size() > 0){
            for (Product maxPrice: max){
                System.out.println("Most expensive products " + maxPrice);
            }
        }else {
            System.out.println("Currently no products available");
        }
        if (min.size()>0){
            for (Product minPrice: min){
                System.out.println("lowest price products " + minPrice);
            }
        } else {
            System.out.println("Currently no products available");
        }
    }
    public void searchName(){
        try {
            System.out.println("The name you want to search for");
            String name = input.nextLine();
            for (Product product : productList) {
                if (product.getName().equals(name)) {
                    System.out.println("The object which you want to search: " + product);
                }
            }
        } catch (Exception e){
            System.out.println("error, please re-enter");
        }
    }
    public void searchPrice(){
        try {
            System.out.println("The price you want to search for");
            Double price = input.nextDouble();
            for (Product product : productList) {
                if (product.getPrice().equals(price)) {
                    System.out.println("The object which you want to search: " + product);
                }
            }
        } catch (Exception e) {
            System.out.println("error, please re-enter");
        }
    }
    public void writeProduct(List<Product> obj) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/aQBaiTap1/File/Product"))) {
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            System.out.println("error, please re-enter");
        }
    }
    public List<Product> readProduct() {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/aQBaiTap1/File/Product"))) {
            Object object = objectInputStream.readObject();
            products = (List<Product>) object;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println("error, please re-enter");
        }
        return products;
    }

}

