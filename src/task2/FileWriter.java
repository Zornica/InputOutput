package task2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class FileWriter {
  private String quitValue;
  private String file;

  /**
   * Constructor with parameters
   *
   * @param quitValue is the symbol which stops the recording in file
   * @param file      is the file where we record
   */
  public FileWriter(String quitValue, String file) {
    this.file = file;
    this.quitValue = quitValue;
  }

  /**
   * Records in the file
   *
   * @throws FileNotFoundException
   */
  public void writeFile() throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    PrintStream fileWriter = new PrintStream(file);
    String val;
    do {
      val = sc.nextLine();
      fileWriter.println(val);
    }
    while (!val.equals(quitValue));    //while(!val.contains(quitValue))
    fileWriter.close();
  }


}
