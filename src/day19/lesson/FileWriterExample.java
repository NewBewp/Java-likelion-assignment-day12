package day19.lesson;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "Class4.txt";
        String content = "Xin chào!!";

        FileWriter fw = null;

        try{
            fw = new FileWriter(fileName);
            fw.write(content);
            System.out.println("Đã ghi file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
