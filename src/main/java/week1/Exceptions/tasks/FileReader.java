package week1.Exceptions.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//https://javarush.ru/quests/lectures/questsyntaxpro.level15.lecture00-
public class FileReader {
  public static void main(String[] args) {
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File("input.txt"));
      ArrayList<String> lines = new ArrayList<>();
      while (scanner.hasNextLine()) {
        lines.add(scanner.nextLine());
      }
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage()); //предположим пишем в лог
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }

//Показать то что класс является Closeable
//  public static void main(String[] args) {
//    //try-with-resources - AutoClosable интерфейс потому что
//    try (Scanner scanner = new Scanner(new File("input.txt"))) {
//      ArrayList<String> lines = new ArrayList<>();
//      while (scanner.hasNextLine()) {
//        lines.add(scanner.nextLine());
//      }
//
//      for (String line : lines) {
//        System.out.println("Line: " + line);
//      }
//    }
//    catch (FileNotFoundException e) {
//      System.out.println("LOG: " + e.getMessage());
//    }
//  }



}
