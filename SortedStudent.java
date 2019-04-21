package reflection.exerc_three;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class SortedStudent implements Comparator<Object> {
	private Field f;
	@Override
	public int compare(Object o1, Object o2) {
		if(o1.getClass().equals(o2.getClass())) {
			o1 = searchAnnotation(o1);
			o2 = searchAnnotation(o2);
			if(o1==null||o2==null) {
				new NullPointerException();
			}else if(o1.compareTo(o2)>0) {
				return 1;
			} else if(o1.compareTo(o2)<0) {
				return -1;
			}
		}
		return 0;
	}
	private Object searchAnnotation(Object o1) {
		Field[] fields = o1.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(fields[i].isAnnotationPresent(MyAnnotation.class)) {
				f=fields[i];
				f.setAccessible(true);
				return f;
			}
		}
		return null;
	}

}
