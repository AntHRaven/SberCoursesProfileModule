package week3.AnnotationAndReflection.practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LoggingService {

    public static void log(Object o, String methodName) {
        Class<?> cls = o.getClass();
        for(Method method : cls.getMethods()) {
            if(method.getName().equals(methodName)) {
                for(Annotation annotation : method.getAnnotations()) {
                    if(annotation instanceof ToBeLogged) {
                        switch (((ToBeLogged) annotation).logLevel()) {
                            case INFO -> System.out.println("INFO Logging method" + method.getName() + "at time: " + LocalDateTime.now());
                            case DEBUG -> System.out.println("DEBUG Logging method" + method.getName() + "at time: " + LocalDateTime.now());
                        }
                    }
                }
            }
        }
    }
}
