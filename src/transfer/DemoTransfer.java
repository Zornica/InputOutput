package transfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class DemoTransfer {
  public static void main(String[] args) {
    String fileIn = "reversal.txt";
    String fileOut = "test.txt";

    int numberOfBytes = 100;
    int offset = 4;
    TransferObject f = new TransferObject();
    try{
      InputStream in = new FileInputStream(fileIn);
      OutputStream out = new FileOutputStream(fileOut);
      System.out.println("The written bytes are : " + f.transfer(in,out,numberOfBytes,offset));
    }catch(IOException e ){
      System.out.println(e.getMessage());
    }

  }
}
