package learning.basics;

public class RestaurantDetails {
	void Order(String name,String address,String ...dishes)
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Address of Customer : "+address );
		
		for(int i=0;i<dishes.length;i++)
		{
			System.out.println("Order Dishes of Customer : "+dishes[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		RestaurantDetails Res = new RestaurantDetails();
		Res.Order("Anurag","Lucknow","Paneer Hyderabadi","Mughlai Paratha","Butter Chicken Masala");
		Res.Order("Binit","BBD Lucknow","Chicken Lollipop","Chicken Briyani","Roomali Roti");
		Res.Order("Sam","Delhi","Paneer Frankie","Shahi Paneer","Mughlai Paratha");
		
	}

}
