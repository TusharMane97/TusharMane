package seleniumProgram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	
	public static void main(String[]args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		RadioButtonHandling obj = new RadioButtonHandling();
		Class obj1 = obj.getClass();
		Method[] methods = obj1.getDeclaredMethods();
		for(Method m : methods) {
			if(m.getName().equals("launchBrowser")) {
				m.invoke(obj);
			}
		}
	}

}
