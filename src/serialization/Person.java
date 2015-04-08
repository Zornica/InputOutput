package serialization;

/**
 * Random Class
 */
public class Person implements java.io.Serializable {
  public String name;
  public int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
}
