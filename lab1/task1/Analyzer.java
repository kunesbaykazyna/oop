package lab1.task1;
import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Data d = new Data();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number(Q): ");

        while (s.hasNext()) {
            String input = s.next();
            
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            else {
            	double g= Double.parseDouble(input);
            	d.add(g);
            }
        }

        System.out.println("Average: " + d.avg());
        System.out.println("Max: " + d.maxxx());
        System.out.println("Sum: " + d.summ());
        
        s.close();
    }
}










//мне надо было в аналайзер вывести методы адд макс и сумм и вызывать оттудого или же просто выводить результат в аналайзер классе
//во втором случии могу же просто дататест переименовать на аналайзер
