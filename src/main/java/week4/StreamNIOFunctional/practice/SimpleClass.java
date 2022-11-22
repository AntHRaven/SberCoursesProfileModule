package week4.StreamNIOFunctional.practice;

public class SimpleClass {
  private String firstName;
  private String secondName;
  private String login;
  private String password;
  private Integer age;

  public SimpleClass(String firstName, String secondName, String login, String password,
      Integer age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.login = login;
    this.password = password;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "\nSimpleClass{" +
        "firstName='" + firstName + '\'' +
        ", secondName='" + secondName + '\'' +
        ", login='" + login + '\'' +
        ", password='" + password + '\'' +
        ", age=" + age +
        '}';
  }
}
