import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    // 34 - File writing

    String fileContent = """
        Hello
        This is file writing
        in java
        """;
    String filePath = "file.txt";

    try (FileWriter writer = new FileWriter(filePath)) {
      writer.write(fileContent);
      System.out.println("File created!");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
