package task2;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class DemoFileWriter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("The quitValue is : ");
    String quitValue = sc.next();
    String file = "test.txt";
    FileWriter f = new FileWriter(quitValue, file);
    try {
      f.writeFile();
    } catch (FileNotFoundException e) {
      System.out.println("Not found file with this name!");
    }
  }
}
