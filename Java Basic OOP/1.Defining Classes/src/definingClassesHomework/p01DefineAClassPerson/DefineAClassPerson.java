package definingClassesHomework.p01DefineAClassPerson;

import java.lang.reflect.Field;
class Person{
    String name;
    int age;
}
public class DefineAClassPerson {
    public static void main(String[] args) throws Exception {
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }

}
