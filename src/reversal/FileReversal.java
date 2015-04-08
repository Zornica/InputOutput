package reversal;

import java.io.*;

public class FileReversal {
  private String file;

  /**
   * Constructor
   * @param file name of the file
   */
  public FileReversal(String file) {
    this.file = file;
  }

  /**
   * Revers the content of the file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public void revers() throws FileNotFoundException, IOException {

    BufferedReader in = new BufferedReader(new FileReader(file));
    String st = in.readLine();
    StringBuilder a = new StringBuilder();
    while (st != null) {
      a.append(st).append("\n");
      st = in.readLine();
    }
    a.deleteCharAt(a.length() - 1);
    in.close();
    BufferedWriter out = new BufferedWriter(new FileWriter(file));
    out.write(a.reverse().toString());
    out.close();

  }
}
