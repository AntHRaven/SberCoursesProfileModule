package week4.StreamNIOFunctional.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Копировать файл с контентом
 */
public class Task3 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/test.txt");
        Path targetPath = Paths.get("src/test1.txt");
        
        try {
            Path path = Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Target file Path: " + path);
            System.out.println("Copied Content: \n" + new String(Files.readAllBytes(path)));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
