package task_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\КУРС ПО JAVA\\Java Advanced\\№3. Basic IO, NIO  -  How to work with Strings. [String, StringBuilder, StringBuffer]\\Homework_3\\src\\task_2\\Information.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
