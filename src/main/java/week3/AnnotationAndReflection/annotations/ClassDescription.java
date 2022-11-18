package week3.AnnotationAndReflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
Написать аннотацию, содержащую некоторую информацию о классе:
 автор, дата создания класса, номер текущей версии, список ревьюеров.
 */

//TODO почему поля задаются как методы
@Retention(RetentionPolicy.RUNTIME) // для того чтобы мы могли обратиться к этой аннотации через рефлексию
public @interface ClassDescription {
    String author();
    String date();
    int currentRevision() default 1;
    String[] reviewers();
}
