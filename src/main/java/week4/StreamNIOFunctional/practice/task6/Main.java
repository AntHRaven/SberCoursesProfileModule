package week4.StreamNIOFunctional.practice.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//Удалить все папки и файлы в которых присутствует [deleted]
public class Main {

  public static void main(String[] args) {
    deleteFiles(Path.of(
        "C:\\Users\\n.veko\\IdeaProjects\\SberCoursesProfileModule\\src\\main\\java\\week4\\StreamNIOFunctional\\practice"));
  }

  public static List<Path> getAllFilesAndDirs(Path path) {
    List<Path> paths = new ArrayList<>();
    try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
      files.forEach(paths::add);
//      for (Path item : files) {
//        paths.add(item);
//      }
      return paths;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void deleteFiles(Path path) {
    List<Path> paths = getAllFilesAndDirs(path);
    paths.forEach(i -> {
      if (i.getFileName().toString().contains("[deleted]")) {
        try {
          Files.delete(i);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }
}
