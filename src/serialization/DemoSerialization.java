package serialization;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class DemoSerialization {
  public static void main(String[] args) throws IOException {
    DataClass file = new DataClass();
    Person obj = new Person("Petyr", 23);
    Person obj1 = new Person("Ivan", 43);
    Person obj2 = new Person("Sisa", 52);
    InputStream in = null;
    OutputStream out = null;
    try {
      in = new FileInputStream("serialization.txt");
      out = new FileOutputStream("serialization.txt");

      System.out.println("---------------------");
      Person f = null;
      file.saveObject(out, obj);
      f = (Person) file.getObject(in);
      System.out.println(f.name + " " + f.age);
      file.saveObject(out, obj1);
      f = (Person) file.getObject(in);
      System.out.println(f.name + " " + f.age);
      file.saveObject(out, obj2);
      f = (Person) file.getObject(in);
      System.out.println(f.name + " " + f.age);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
