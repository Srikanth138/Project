package alpha;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		Scanner sc=null;
		int a=0;
				sc=new Scanner(System.in);
				System.out.println("ENTER ANY CHAR");
				String st=sc.next();
				for(int i=0;i<st.length();i++)
				{
		char ch=st.charAt(i);
		if(0<=a && 126>=a){System.out.println(a+" IS THERE ....ALL"+(char)a);}
		else
			System.out.println("this in valide....");
//		int ch=sc.nextInt();
		
		 if(40 <=ch && ch<= 64) {System.out.println("...."+(char)ch);}
			else if(65 <=ch && ch<= 90) {System.out.println("...."+(char)ch);}
				else if(91<=ch && ch<=125) { 	//Implicit conversion is there./widening  conversion
					System.out.println("...."+(char)ch);
		}
		else
		System.out.println("THIS IS WRONG PASSWORD");
	}
		sc.close();
	}

}
