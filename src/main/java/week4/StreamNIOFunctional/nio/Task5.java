package week4.StreamNIOFunctional.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Прочитать и вывести содержимое файла с помощью NIO и newBufferedReader:
 */
public class Task5 {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
            
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
