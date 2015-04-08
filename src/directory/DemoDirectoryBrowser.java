package directory;

import java.io.FileNotFoundException;

public class DemoDirectoryBrowser {
  public static void main(String[] args) {
    String path = "/home/clouway/zuza/";
    DirectoryBrowser file = new DirectoryBrowser();
    System.out.println("   ");
    try {
      file.listContent(path);
    } catch (IllegalArgumentException e) {
      System.out.println("\n" + "This file or directory not exist!");
    }
  }
}
