package week3.AnnotationAndReflection.annotations;
/*
Написать аннотацию, содержащую некоторую информацию о классе:
 автор, дата создания класса, номер текущей версии, список ревьюеров.
 */

@ClassDescription(author = "Nikita",
                  date = "12.11.2022",
                  currentRevision = 6,
                  reviewers = {"Sergey, Inna, Vyacheslav"})
public class PerfectClass {
}

/*
Обращение к аннотации с помощью Reflection
Для проверки наличия аннотации у класса, существуют методы класса Class:
isAnnotationPresent()
Проверяет, есть ли у класса данная аннотация
getAnnotation()
Возвращает аннотацию, если она есть у класса, иначе null
getAnnotations()
Возвращает все аннотации, примененные к классу
getDeclaredAnnotations()
Как предыдущий, но не учитывает аннотации, унаследованные с помощью @Inherited
 */
