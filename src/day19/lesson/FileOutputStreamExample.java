package day19.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // Đường dẫn đến file
        String fileName = "Class3";

        String content = "Hello World";

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(fileName);
            fos.write(content.getBytes());
            System.out.println("Đã tạo file thành công");
        } catch (IOException io) {
            io.printStackTrace();
        }finally {
            try {
                fos.close();
            }catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
    }
}
