package week4.StreamNIOFunctional.practice.task5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
//  Получить список всех файлов и папок в папке
  public static void main(String[] args) {
    Path path = Path.of("c:\\windows");

    try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
      for(Path path1 : files) {
        System.out.println(path1);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
