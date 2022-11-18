package week3.AnnotationAndReflection.annotations;

/*
Создать класс, который по аннотации @ClassDescription из предыдущего задания
выводит все описание на экран:
 */
public class AnnotationReflection {
    public static void writeDescription(Class<?> cls) {
        if (!cls.isAnnotationPresent(ClassDescription.class)) {
            return;
        }
        ClassDescription classDescription = cls.getAnnotation(ClassDescription.class);
        System.out.println("Author: " + classDescription.author());
        System.out.println("Date: " + classDescription.date());
        System.out.println("Version: " + classDescription.currentRevision());
        System.out.println("Reviewers: ");
        for (String str : classDescription.reviewers()) {
            System.out.println("> " + str);
        }
    }

    public static void main(String[] args) {
        writeDescription(PerfectClass.class);
    }
}
