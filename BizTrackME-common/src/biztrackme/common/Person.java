package biztrackme.common;

/**
 *
 * @author Eran
 */
public abstract class Person {

  String name;
  String phone;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  
}