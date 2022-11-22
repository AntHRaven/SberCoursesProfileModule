package week4.StreamNIOFunctional.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Работа с файловой системой
Создать файл в src/ с названием test.txt
 */

//TODO Таблица методов Path
//https://javarush.com/quests/lectures/questsyntaxpro.level15.lecture04
public class Task1 {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        Path path2 = Path.of("src/test.txt");
        try {
            Path createdFilePath = Files.createFile(path);
            System.out.println("File created at path: " + createdFilePath);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
