package customer;

public class Customer {
	String name;
	int[] orderNums;
	int i=0;

public Customer(String name)
{
	
	this.name=name;
	this.orderNums=new int[10];
}
public void addOrder(int orderNumber)
{
orderNums[i]=orderNumber;
i++;

	
}
public void completeOrder(int orderNumber)
{
	
	
	for(int j=0;j<orderNums.length;j++)
	{
		if(orderNums[i]==orderNumber)
		{
			
			orderNums[i]=0;
		}
		
	}
}
}

