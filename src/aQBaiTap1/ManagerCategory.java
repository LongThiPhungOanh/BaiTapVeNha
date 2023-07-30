package aQBaiTap1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ManagerCategory {
    private final Scanner input = new Scanner(System.in);
    List<Category> categoryList;
    public ManagerCategory(){
        categoryList = new ArrayList<>();
    }
    public void addCategory () {
        try {
            System.out.println("name Category");
            String newCategory = input.nextLine() ;
            boolean contains = false ;
            for (Category value : categoryList) {
                if (value.getName().equals(newCategory)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                Category category = new Category(newCategory);
                categoryList.add(category);
                write(categoryList);
            }else {
                System.out.println("Category is duplicate");
            }
        } catch (Exception e){
            System.out.println("error, please re-enter");
        }
    }
    public void showCategory () {
        categoryList = read();
        if(categoryList.isEmpty()){
            System.out.println("list Category is Empty");
            return;
        } for (Category category : categoryList){
            System.out.println(category);
        }
    }
    public void editCategory() {
        try {
            int checkId = -1;
            showCategory();
            System.out.println("Name Category want to edit");
            String name = input.nextLine();
            for (int i = 0; i < categoryList.size(); i++) {
                if (categoryList.get(i).getName().equals(name)) {
                    checkId = i;
                    break;
                }
            }
            if (checkId >= 0) {
                System.out.println("New name");
                String newName = input.nextLine();
                categoryList.get(checkId).setName(newName);
                write(categoryList);
            } else {
                System.out.println("index not found");
            }
        }catch (Exception e){
            System.out.println("error, please re-enter");
        }
    }
    public void write(List<Category> obj){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/aQBaiTap1/File/Category"));
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            System.out.println("error, please re-enter");
        }
    }
    public List<Category> read() {
        List<Category> categoryArrayList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/aQBaiTap1/File/Category"))) {
            Object object = objectInputStream.readObject();
            categoryArrayList = (List<Category>) object;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println("error, please re-enter");
        }
        return categoryArrayList;
    }
}
