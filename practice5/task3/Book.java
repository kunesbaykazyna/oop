package practice5.task3;
import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private transient int visitCounter;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.visitCounter = 0;
    }

    public void visit() {
        visitCounter++;
    }

    public int getVisitCounter() {
        return visitCounter;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', visits=" + visitCounter + "}";
    }
}

//try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
//    Book myBook = new Book("Java Guide", 2023);
//    oos.writeObject(myBook); // Здесь Java добавит нужный заголовок
//} catch (IOException e) {
//    e.printStackTrace();
//}
//
//// 2. ЧТЕНИЕ (Теперь ObjectInputStream поймет формат)
//try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))) {
//    Book readBook = (Book) ois.readObject();
//    System.out.println(readBook.getName());
//} catch (IOException | ClassNotFoundException e) {
//    e.printStackTrace();
//}

//public class ObjectInputStreamDemo {
//    public static void main(String[] args) {
//        String filename = "personData.ser";
//
//        // Code to write the object (assumed to have run previously using ObjectOutputStream)
//        // ...
//
//        // Reading the object from the file using try-with-resources for automatic closing
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
//            Person readPerson = (Person) ois.readObject(); // Cast the read object
//            System.out.println("Object read from file:");
//            readPerson.display();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
