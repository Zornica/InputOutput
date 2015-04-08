package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class DataClass {
  /**
   * Reads the file and display the elements
   *
   * @param in is the file which we read
   * @throws IOException
   * @throws ClassNotFoundException
   */
  public Object getObject(InputStream in) throws IOException, ClassNotFoundException {
    ObjectInputStream fileIn = new ObjectInputStream(in);

    return    fileIn.readObject();
  }

  /**
   * Records the objects in the file
   *
   * @param out is the file
   * @param o   is the object which we record
   * @throws IOException
   */
  public void saveObject(OutputStream out, Object o) throws IOException {
    ObjectOutputStream fileOut = new ObjectOutputStream(out);
    fileOut.writeObject(o);

  }
}
