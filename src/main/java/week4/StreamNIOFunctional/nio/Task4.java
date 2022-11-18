package week4.StreamNIOFunctional.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Переместить файл в папку
 */
public class Task4 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/test1.txt");
        Path targetPath = Paths.get("src/newFolder/test1.txt");
        
        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
