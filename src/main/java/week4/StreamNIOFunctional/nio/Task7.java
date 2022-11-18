package week4.StreamNIOFunctional.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Записать строку в файл:
 */
public class Task7 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/testToWrite.txt");
        Files.writeString(path, "My perfect string");
    }
}
