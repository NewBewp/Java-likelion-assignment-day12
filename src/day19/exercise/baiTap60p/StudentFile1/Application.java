package day19.exercise.baiTap60p.StudentFile1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input name of file to create
        System.out.println("Input name of file to create: ");
        String fileNameInput = sc.nextLine();
        createFile(fileNameInput);

        // Read data from StudentsList.txt
        String fileToRead = "StudentsList.txt";
        List<String> content = readFile(fileToRead);

        deleteFile(fileToRead);

        //Get stop index from user
        int stopIndex = stopIndex();

        // Write data to the new file
        writeFile(fileNameInput, content, stopIndex);

        System.out.println("Program completed successfully.");



    }

    public static void writeFile(String fileNameInput, List<String> content, int stopIndex) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameInput))) {
            for (int i = 0; i < content.size(); i++) {
                if(i == stopIndex) {
                    System.out.println("Pausing for 10 seconds...");
                    Thread.sleep(10000);
                    System.out.println("Resuming writing to file...");
                }
                bw.write(content.get(i));
                bw.newLine();
            }
//            for (String line : content) {
//                bw.write(line);
//                bw.newLine();
//            }
            System.out.println("Data written to file successfully");
        } catch (IOException |InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String fileToRead) {
            List<String> content = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
                String line;
                while ((line = br.readLine()) != null) {
                    content.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
    }

    public static void createFile(String fileNameInput) {
        try {
            File file = new File(fileNameInput);
            if (file.createNewFile()) {
                System.out.println("File created: " + fileNameInput);
            } else {
                System.out.println("File already exists: " + fileNameInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Optionally delete the original file after writing to new file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + fileName);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static int stopIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stop index: ");
        int stopIndex = scanner.nextInt();

        return stopIndex;
    }
}
