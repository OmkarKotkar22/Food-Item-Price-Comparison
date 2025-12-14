package Item_Price;

public class FoodItem {
	private static int counter = 0;
	private int id;
	private String name;
	private int price;
	
	public FoodItem()
	{
		counter++;
		id = counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setFoodName(String n)
	{
		name = n;
	}
	public String getFoodName()
	{
		return name;
	}
	
	public void setFoodPrice(int p)
	{
		price = p;
	}
	public int getFoodPrice()
	{
		return price;
	}
}
