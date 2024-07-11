package day19.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "Class3";

        FileInputStream fis = null;
        try{
            fis = new FileInputStream(sourceFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            StringBuilder fileContent = new StringBuilder();
            while ((bytesRead = fis.read(buffer))!=-1){
                fileContent.append(new String(buffer,0,bytesRead));
            }
            System.out.println("File content: ");
            System.out.println(fileContent.toString());

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
