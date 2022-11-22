package week4.StreamNIOFunctional.practice.task7;


import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Удалить все файлы которые были созданы больше недели назад
public class Main {

  public static void main(String[] args) {
    int week = 1000 * 60 * 60 * 24 * 7; //неделя
    Path dir = Paths.get(
        "C:/Users/n.veko/IdeaProjects/SberCoursesProfileModule/src/main/java/week4/StreamNIOFunctional/practice");
    List<Path> paths = getAllFilesAndDirs(dir);
    paths.forEach(i -> {
      try {
        Files.getAttribute(i, "creationTime");
        BasicFileAttributes attr =
            Files.readAttributes(i, BasicFileAttributes.class);
        if (attr.creationTime().toMillis() < (new Date().getTime() - week)) {
          Files.delete(i);
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    });
  }

  public static List<Path> getAllFilesAndDirs(Path path) {
    List<Path> paths = new ArrayList<>();
    try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
      files.forEach(paths::add);
      return paths;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
