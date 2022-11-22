package week4.StreamNIOFunctional.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;

/*
Прочитать и вывести содержимое файла с помощью NIO и newBufferedReader:
 */
public class Task5 {
    public static final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("C:\\Users\\n.veko\\IdeaProjects\\sbercoursesproject\\src\\test.txt");
        Path path = Paths.get("src/text.txt");
        LinkedBlockingDeque<Callable<String>> callables = new LinkedBlockingDeque<>();
        callables.add(new ReadFile(path));
        callables.add(new ReadFile(path));
        callables.add(new ReadFile(path));
        try {
            executor.invokeAll(callables);
            executor.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
//            String currentLine = null;
//            while ((currentLine = reader.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        }
    }

    public static class ReadFile implements Callable<String> {

        Path path;

        public ReadFile(Path path) {
            this.path = path;
        }

        @Override
        public String call() throws Exception {
            System.out.println(path);
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
                String currentLine = null;
                while ((currentLine = reader.readLine()) != null) {
                    System.out.println(currentLine);
                    stringBuilder.append(currentLine);
                }
            } catch (NoSuchFileException e) {
                System.out.println(e);
            }
            return stringBuilder.toString();
        }
    }
}
