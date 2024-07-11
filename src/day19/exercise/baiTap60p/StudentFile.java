package day19.exercise.baiTap60p;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the output file
        System.out.print("Enter the name of the output file: ");
        String fileB = scanner.nextLine();

        String fileA = "StudentsList.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileA));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileB))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading from file A: " + line);
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Writing to file B completed.");

        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found: " + fileA);
            fnfe.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O error occurred");
            e.printStackTrace();
        }

        deleteFile(fileA);
    }

    public static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
            System.out.println("File " + fileName + " deleted successfully.");
        } catch (NoSuchFileException e) {
            System.err.println("No such file/directory exists: " + fileName);
        } catch (DirectoryNotEmptyException e) {
            System.err.println("Directory is not empty: " + fileName);
        } catch (IOException e) {
            System.err.println("Invalid permissions.");
            e.printStackTrace();
        }
    }
}
