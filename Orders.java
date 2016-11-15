package code;

public class Orders {
public int ordernumber;
public InventoryItem item;
public int amount;
/*
 * public InventoryItem[] itemstoget
 * public int[] amount;
 * 
 * 
 */
 
int i=0;

//public orders(InventoryItem[], int[]  amount, ordernumber)
public Orders(InventoryItem item,int number,int ordernumber)
{
amount=number;
	this.ordernumber=ordernumber;
	this.item=item;
	//this.things=new InventoryItem[number];
	//things[i]=item;
	//amout=new int[number];
			//numberlist[i]=number;
	//i++;
	
	
	
}
/*
public void add(InventorItem item,int number)
{
	things[i]=item;
   numberlist[i]=number;
   i++;
}
*/
public int getNumber()
{
	return ordernumber;
	
}
}
