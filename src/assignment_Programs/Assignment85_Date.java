package assignment_Programs;
import java.util.Date;
public class Assignment85_Date
{//"WAP to find out the current date, past date and future date using String function
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println("Current date: "+d1);
		String format1_current=d1.toString();
		
		String month_current=format1_current.substring(4, 7);
		String date_current=format1_current.substring(8, 10);
		String year_current=format1_current.substring(format1_current.length()-4);
		
		String format2=date_current.concat("-").concat(month_current).concat("-").concat(year_current);
		System.out.println("Format1 : "+format2);
		String format3=date_current.concat("/").concat(month_current).concat("/").concat(year_current);
		System.out.println("Format2 : "+format3);//current time
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*2));
		System.out.println("future date: "+d2);
		String format1_future=d2.toString();
		
		String month_future=format1_future.substring(4, 7);
		String date_future=format1_future.substring(8, 10);
		String year_future=format1_future.substring(format1_future.length()-4);
		
		String format4=date_future.concat("-").concat(month_future).concat("-").concat(year_future);
		System.out.println("Format1 : "+format4);
		String format5=date_future.concat("/").concat(month_future).concat("/").concat(year_future);
		System.out.println("Format2 : "+format5);//future time
		
        Date d3=new Date(d1.getTime()-(1000*60*60*24*3));
		System.out.println("past date: "+d3);
		String format1_past=d3.toString();
		
		String month_past=format1_past.substring(4, 7);
		String date_past=format1_past.substring(8, 10);
		String year_past=format1_past.substring(format1_past.length()-4);
		
		String format6=date_past.concat("-").concat(month_past).concat("-").concat(year_past);
		System.out.println("Format1 : "+format6);
		String format7=date_past.concat("/").concat(month_past).concat("/").concat(year_past);
		System.out.println("Format2 : "+format7);//past time
	}

}
