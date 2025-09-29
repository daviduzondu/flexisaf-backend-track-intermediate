import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// 1. Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface EnhancementRequest {
    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unknown";
}

// 2. Use the annotation
@EnhancementRequest(
    id = 101,
    synopsis = "Add export to PDF feature"
)
class ReportGenerator {
    // class body
}

// 3. Test program to read the annotation
public class UsingAnnotations {
    public static void main(String[] args) {
        Class<ReportGenerator> obj = ReportGenerator.class;

        // Check if annotation is present
        if (obj.isAnnotationPresent(EnhancementRequest.class)) {
            EnhancementRequest req = obj.getAnnotation(EnhancementRequest.class);

            System.out.println("Enhancement Request Details:");
            System.out.println("ID: " + req.id());
            System.out.println("Synopsis: " + req.synopsis());
            System.out.println("Engineer: " + req.engineer());
            System.out.println("Date: " + req.date());
        }
    }
}
