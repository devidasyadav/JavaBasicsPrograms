package module3_Programs;

import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1= new Date();
		System.out.println(d1.getTime());
		
		String name="kv no 213 hada";
		System.out.println(name.replaceAll("[0-9]", "dev"));
		name.replaceAll(name, name);
		System.out.println(name.repeat(3));
	}

}
