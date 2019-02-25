import java.util.Scanner;
public class HW5 {
	public static void main(String[] args)
	{
		Scanner consoleInput = new Scanner(System.in);
		printGPA(consoleInput);
		
	}
	public static void printGPA(Scanner input)
	{
		System.out.print("Enter a student record: ");
		String name = input.next();
		int total = input.nextInt();
		String grades = input.nextLine();
		
		int sum = 0;        
        String stringConcat = "";
        double gpa = 0.0;
        
        System.out.println("Student record: " + name + " " + total + " " +
                grades);
        
        for(int i = 1; i < grades.length(); i++)
        {
        	char ch = grades.charAt(i);
            char ch2 = grades.charAt(i + 1);                
            stringConcat = String.valueOf(ch) + String.valueOf(ch2);
            int number = Integer.parseInt(stringConcat);
            sum += number;
            gpa = (double)sum / (double)total;              
            i += 2;         
        }
        System.out.println(name + "'s grade is " + gpa);
	}
	
	
	
	

}
