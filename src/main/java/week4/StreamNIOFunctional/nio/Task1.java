package week4.StreamNIOFunctional.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Работа с файловой системой
Создать файл в src/ с названием test.txt
 */
public class Task1 {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        try {
            Path createdFilePath = Files.createFile(path);
            System.out.println("File created at path: " + createdFilePath);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
