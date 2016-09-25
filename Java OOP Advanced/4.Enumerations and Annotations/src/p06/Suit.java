package p06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Suit {

    public String type() default "Enumeration";

    public String category()default "Suit";

    public String description()default "Provides suit constants for a Card class.";

}

