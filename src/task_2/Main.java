package task_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\КУРС ПО JAVA\\Java Advanced\\№3. Basic IO, NIO  -  How to work with Strings. [String, StringBuilder, StringBuffer]\\Homework_3\\src\\task_2\\Information.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
