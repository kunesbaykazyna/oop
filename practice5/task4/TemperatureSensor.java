package practice5.task4;
import java.io.*;
import java.util.Random;

public class TemperatureSensor {

    static String fileName = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task4\\sensor.bin";
    
    private static void writeData() {
        Random random = new Random();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            for (int i = 0; i < 60; i++) {
                double temp = 15.0 + (35.0 - 15.0) * random.nextDouble();
                dos.writeDouble(temp);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void patchData() {

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {

            raf.seek(29 * 8);
            raf.writeDouble(999.9);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readAndAnalyze() {

        double sum = 0;
        double max = Double.MIN_VALUE;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {

            for (int i = 0; i < 60; i++) {
                double temp = dis.readDouble();

                sum += temp;

                if (temp > max) {
                    max = temp;
                }
            }

            double avg = sum / 60;

            System.out.println("Average: " + avg);
            System.out.println("Max: " + max);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        writeData();    
        patchData();      
        readAndAnalyze(); 
    }
}
