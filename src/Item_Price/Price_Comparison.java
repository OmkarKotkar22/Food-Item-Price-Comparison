/*6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
*/

package Item_Price;

import java.util.*;
public class Price_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		FoodItem f[] = new FoodItem[size];
		
		int Id = 0, Price = 0;
		String Name = " ";
		
		for(int i = 0; i < f.length; i++)
		{
			f[i] = new FoodItem();
			
			System.out.println("Enter the Food Item Name: ");
			Name = sc.next();
			
			System.out.println("Enter the Food Item Price: ");
			Price = sc.nextInt();
			
			f[i].setFoodName(Name);
			f[i].setFoodPrice(Price);
			
			System.out.println("Id \t\t Food Name \t\t Food Price");
			System.out.println(f[i].getId() + "\t\t" + f[i].getFoodName() + "\t\t" + f[i].getFoodPrice());
		}
		
		for(int i = 0; i < f.length; i++)
		{
			for(int j = i+1; j < f.length; j++)
			{
				if(f[i].getFoodPrice() < f[j].getFoodPrice())
				{
					System.out.println(f[i].getFoodName() + " is a Cheaper than " + f[j].getFoodName() + " becuase of price: Rs." + f[i].getFoodPrice());
				}
				else if(f[j].getFoodPrice() < f[i].getFoodPrice())
				{
					System.out.println(f[j].getFoodName() + " is a Cheaper than " + f[i].getFoodName() + " becuase of price: Rs." + f[j].getFoodPrice());
				}
				else
				{
					System.out.println(f[i].getFoodName() + " & " + f[j].getFoodName() + " Both Food Item Price are Same: Rs."+ f[i].getFoodPrice() +" Rs." + f[j].getFoodPrice());

				}
			}
		}
	}
}
