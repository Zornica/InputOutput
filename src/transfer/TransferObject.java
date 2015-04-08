package transfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class TransferObject {
  /**
   * Reads from first file and records in second file by bytes
   *
   * @param fileIn        firs file
   * @param fileOut       second file
   * @param numberOfBytes number of bytes which we record
   * @param offset        number of bytes which we skip before we record
   * @return number of bytes which we record in second file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public int transfer(InputStream in ,OutputStream out, int numberOfBytes, int offset) throws FileNotFoundException, IOException {

   /* in = new FileInputStream(fileIn);
    out = new FileOutputStream(fileOut);*/
    int br = 0;
    in.skip(offset);
    int c;
    while ((c = in.read()) != -1) {

      if (br < numberOfBytes) {
        out.write(c);
        br++;
      }
    }
    in.close();
    out.close();
    return br;
  }
}
