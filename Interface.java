import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Interface {

	static User u = new User();
	static Order o = new Order();
	static Address a = new Address();
	
	public static ArrayList<String> user_Information() 
	{
		ArrayList<String> user_Info = new ArrayList<String>();
		user_Info.add(u.getFirst_Name());
		user_Info.add(u.getLast_Name());
		user_Info.add(u.getAddress());
		user_Info.add(u.getEmail());
		user_Info.add(u.getPassword());
		
		return user_Info;
	}
	
	public static ArrayList<Object> order_Information()
	{
		ArrayList<Object> order_Info = new ArrayList<Object>();
		order_Info.add(o.getCost());
		order_Info.add(o.getQuantity());
		order_Info.add(o.getUser_ID());
		order_Info.add(o.getItem());
		order_Info.add(o.getShipping_Address());
		
		return order_Info;
		
	}
	
	public static ArrayList<Object> address_Information()
	{
		ArrayList<Object> address_Info= new ArrayList<Object>();
		address_Info.add(a.getZipcode());
		address_Info.add(a.getCity());
		address_Info.add(a.getState());
		address_Info.add(a.getStreet());
		
		return address_Info;
	}
	
	
}
