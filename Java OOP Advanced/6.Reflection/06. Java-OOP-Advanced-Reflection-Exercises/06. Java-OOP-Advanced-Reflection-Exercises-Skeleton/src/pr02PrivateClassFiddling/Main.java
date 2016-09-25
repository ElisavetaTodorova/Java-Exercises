package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Class<BlackBoxInt> blackBoxIntClass=BlackBoxInt.class;
		Constructor ctor=blackBoxIntClass.getDeclaredConstructor();
		ctor.setAccessible(true);
		BlackBoxInt instance= (BlackBoxInt) ctor.newInstance();
		String input=null;
		while (!(input=reader.readLine()).equals("END")){
			String[] params=input.split("_");
			String command=params[0];
			int value=Integer.parseInt(params[1]);
			Method method=blackBoxIntClass.getDeclaredMethod(command,int.class);
			method.setAccessible(true);
			method.invoke(instance,value);
			Field field=blackBoxIntClass.getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(instance));

		}


	}
}
