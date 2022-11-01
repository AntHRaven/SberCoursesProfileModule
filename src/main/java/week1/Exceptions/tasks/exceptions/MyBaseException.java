package week1.Exceptions.tasks.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyBaseException extends RuntimeException {
  private static final String PKG_DIRECTORY = "/Users/andreigavrilov/Work/Projects/СберКурсыШкола/Java1/FirstPracticeWeek/src/week8/oop/secondpart/file";
  private static final String OUTPUT_FILE_NAME = "output.txt";
  public MyBaseException(String errorMessage) {
    super(errorMessage);
    try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
      wr.write("Hello!");
    } catch (IOException e) {
      System.out.println("LOG: " + e.getMessage());
    }
    System.out.println("LOG: " + errorMessage);
  }

}
