package week4.StreamNIOFunctional.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
Прочитать и вывести содержимое файла с помощью NIO и streams()
 */
public class Task6 {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        //usual way
        try {
            List<String> contents = Files.readAllLines(path);
            for (String content : contents) {
                System.out.println(content);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //streams
        try {
            Files.lines(path).forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
