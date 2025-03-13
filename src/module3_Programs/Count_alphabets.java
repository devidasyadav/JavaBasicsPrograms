package module3_Programs;

public class Count_alphabets {

	public static void main(String[] args) {
		// count number of alphabets
		int countAlphabets=0;
		int countDigits=0;
		int countSpaces=0;
		int countSpecialChar=0;
		String input="Dsdv 34 we $%^";
		char c1[]= input.toCharArray();
		
		for (int i=0; i<c1.length;i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			boolean b3= Character.isWhitespace(c1[i]);
			if(b1==true)
			{
				countAlphabets++;
			}
			if(b2==true)
			{
				countDigits++;
			}
			if(b3==true)
			{
				countSpaces++;
			}
		}
		countSpecialChar= c1.length-(countAlphabets+countDigits+countSpaces);
		System.out.println("Count of alphabets : "+countAlphabets);
		System.out.println("Count of digits : "+countDigits);
		System.out.println("Count of spaces : "+countSpaces);
		System.out.println("Count of SpecialChar : "+countSpecialChar);
	}

}
