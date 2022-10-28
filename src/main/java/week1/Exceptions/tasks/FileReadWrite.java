package week1.Exceptions.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileReadWrite {
  private static final String PKG_DIRECTORY = "/Users/andreigavrilov/Work/Projects/СберКурсыШкола/Java1/FirstPracticeWeek/src/week8/oop/secondpart/file";
  private static final String OUTPUT_FILE_NAME = "output.txt";
  private static final String INPUT_FILE_NAME = "input.txt";

  public static void main(String[] args) {
    try {
      readAndWrite();
    }
    catch (IOException e) {
      System.out.println("LOG: " + e.getMessage());
    }
  }

  public static void readAndWrite() throws IOException {
    Scanner scanner = new Scanner(new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));
    Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);

    try (scanner; writer) {
      //scanner = null; - так нельзя, переменная должна быть final/effectively final, чтобы закрыть ресурс.
      while (scanner.hasNext()) {
        writer.write(scanner.nextLine() + "\n");
      }
    }
  }

}
