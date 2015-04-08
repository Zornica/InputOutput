package directory;

import java.io.File;


public class DirectoryBrowser {
  /**
   * Checks if the path is file or directory and display message
   *
   * @param path is the path to the file or directory
   * @throws NullPointerException
   */
  public void listContent(String path) throws IllegalArgumentException{
    File file = new File(path);
    if(!file.isDirectory()){
      throw new IllegalArgumentException("The provided path is not directory!");
    }
    File[] f = file.listFiles();
    for (File a : f) {
      if (!a.isDirectory()) {
        System.out.println(a.getAbsolutePath() + "             " + "This is a file." + "\n");
      } else {
        System.out.println(a.getAbsolutePath() + "          " + "This is a directory." + "\n");
      }
    }
  }
}
