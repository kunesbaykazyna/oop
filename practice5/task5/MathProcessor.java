package practice5.task5;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class MathProcessor {

    private static double calculate(String expression) {
        String op = "";

        if (expression.contains("+")) op = "+";
        else if (expression.contains("-")) op = "-";
        else if (expression.contains("*")) op = "*";
        else if (expression.contains("/")) op = "/";
        else {
            throw new UnsupportedOperationException("Unsupported operator in: " + expression);
        }

        String[] parts = expression.split(Pattern.quote(op));

        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }

        double left = Double.parseDouble(parts[0].trim());
        double right = Double.parseDouble(parts[1].trim());

        if (op.equals("+")) {
            return left + right;
        } else if (op.equals("-")) {
            return left - right;
        } else if (op.equals("*")) {
            return left * right;
        } else if (op.equals("/")) {
            if (right == 0) {
                throw new ArithmeticException("Cannot divide by zero: " + expression);
            }
            return left / right;
        } else {
            throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task5\\exspressions.txt";
        String resultsFile = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task5\\results.txt";
        String logFile = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task5\\log.txt";

        try (Scanner sc = new Scanner(new File(inputFile));
             PrintWriter resWriter = new PrintWriter(new FileWriter(resultsFile));
             PrintWriter logWriter = new PrintWriter(new FileWriter(logFile))) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                try {
                    double result = calculate(line);
                    resWriter.println(line + " = " + result);
                } 
                catch (NumberFormatException e) {
                    logWriter.println("Number format error: " + line);
                } 
                catch (UnsupportedOperationException e) {
                    logWriter.println(e.getMessage());
                } 
                catch (IllegalArgumentException e) {
                    logWriter.println(e.getMessage());
                } 
                catch (ArithmeticException e) {
                    logWriter.println(e.getMessage());
                }
            }

            System.out.println("Processing complete. Check results.txt and log.txt.");

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}