package p06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rank {

    public String type() default "Enumeration";

    public String category()default "Rank";

    public String description()default "Provides rank constants for a Card class.";


}
