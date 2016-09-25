package exercises.methods.p07ImmutableList;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class P07ImmutableList {

    public static void main(String[] args) {
        Class listClass = ImmutableList.class;
        Field[] fields = listClass.getDeclaredFields();
        if (fields.length < 1) {
            throw new ClassFormatException();
        }

        Method method = listClass.getDeclaredMethods()[0];
        System.out.println(method.getReturnType().getSimpleName());

    }

}
