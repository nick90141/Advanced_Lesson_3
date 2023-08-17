package task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "D:/КУРС ПО JAVA/Java Advanced/№3. Basic IO, NIO  -  How to work with Strings. [String, StringBuilder, StringBuffer]/Homework_3/src/task_4/Name.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
