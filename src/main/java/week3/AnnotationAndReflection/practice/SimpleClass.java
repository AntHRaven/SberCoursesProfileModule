package week3.AnnotationAndReflection.practice;

import java.util.Date;

public class SimpleClass {

    @SetValue(value = "test123")
    private String string;
    private Integer integer;
    private Date date;

    @SetValue(value = "publictest123")
    public String publicString;
    public Integer publicInteger;
    public Date publicDate;


    private void printMessage(String message) {
        System.out.println(message);
    }

    @Invoke
    private void printMessage() {
        System.out.println("hello world");
    }

    public String getString() {
        return string;
    }

    public Integer getInteger() {
        return integer;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
               "string='" + string + '\'' +
               ", integer=" + integer +
               ", date=" + date +
               ", publicString='" + publicString + '\'' +
               ", publicInteger=" + publicInteger +
               ", publicDate=" + publicDate +
               '}';
    }
}
