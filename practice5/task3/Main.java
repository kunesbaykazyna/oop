package practice5.task3;
import java.io.*;
import java.util.*;

public class Main {

    private static  String fileName = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task3\\library.dat";

    private static List<Book> loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<Book>) ois.readObject();

        } catch(FileNotFoundException e) {
        	System.err.print(e.getMessage());
        	}
        catch(ClassNotFoundException e) {
        	System.err.print(e.getMessage());
        	}
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            return new ArrayList<>();
        }
        
        return new ArrayList<>();
    }
    
    private static void saveBooks(List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(books);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        List<Book> books = loadBooks();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" A-add book \n L-list books \n Q-quit");
            String in = scanner.nextLine().toUpperCase();

            if (in.equals("A")) {

                System.out.print("Enter title: ");
                String title = scanner.nextLine();

                System.out.print("Enter author: ");
                String author = scanner.nextLine();

                books.add(new Book(title, author));
                System.out.println("Book added..!");

            } else if (in.equals("L")) {
                if (books.isEmpty()) {
                    System.out.println("No books.");
                    
                } else {
                    for (Book b : books) {
                        System.out.println(b);
                    }
                }

            } else if (in.equals("Q")) {
                saveBooks(books);
                System.out.println("Saved. Exit.");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
        }
}
