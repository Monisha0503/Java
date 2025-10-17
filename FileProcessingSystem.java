import java.io.*;
public class FileProcessingSystem {
 public static void processFile(String filename) throws IOException {
 BufferedReader reader = new BufferedReader(new FileReader(filename));
 String line;
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 reader.close();
 }
 public static void main(String[] args) {
 System.out.println("Monisha/2024503043");
 try {
 processFile("test.txt"); // Ensure file exists
 } catch (IOException e) {
 System.out.println("File error: " + e.getMessage());
 }
 }
}