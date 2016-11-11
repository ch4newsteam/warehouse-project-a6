package customer;

import java.util.Scanner;

//import java.utl.scanner
public class Warhouse {
public Customer[] custmer;
int i=0;
// inventory
// que 




public void addCustomer()
{
	Scanner scaner=new Scanner(System. in);
	System.out.println("what is your name");
	String temp=scaner.nextLine();
	int j=0;
	while(j<custmer.length)
	{
			if(custmer[j].name==temp)
			{
				System.out.println(("name taken choice another"));		
			 temp=scaner.nextLine();	
			 j=0;
		}
				
		}
		
		Customer temp2=new Customer(temp);
		custmer[i]=temp2;
		i++;
	}
	
	
}

