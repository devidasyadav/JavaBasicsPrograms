package assignment_Programs;

public class Assignment119_Encapsulation 
{//WAP on Encapsulation
	
	private String name;

    // Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
	public static void main(String[] args) 
	{
		Assignment119_Encapsulation p = new Assignment119_Encapsulation();
        p.setName("Geek"); 
        System.out.println("Name=> " + p.getName());
	}

}
