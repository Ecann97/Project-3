import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Order {
	
	private String item;
	private String shipping_Address;
	
	private int quantity;
	private int user_ID;
	private int cost;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getShipping_Address() {
		return shipping_Address;
	}
	public void setShipping_Address(String shipping_Address) {
		this.shipping_Address = shipping_Address;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader iT= new BufferedReader(new FileReader("item.txt"));
		ArrayList<String> item = new ArrayList<String>();
		String ite = iT.readLine();
		while(ite != null)
		{
			item.add(ite);
			ite = iT.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader sA = new BufferedReader(new FileReader("shipping_Address.txt"));
		ArrayList<String> shipping_Address = new ArrayList<String>();
		String address = sA.readLine();
		while(address != null)
		{
			shipping_Address.add(address);
			address = sA.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader qA = new BufferedReader(new FileReader("quantity.txt"));
		ArrayList<String> quantity = new ArrayList<String>();
		String quan = qA.readLine();
		while(quan != null)
		{
			quantity.add(quan);
			quan = qA.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader uI = new BufferedReader(new FileReader("user_ID.txt"));
		ArrayList<String> user_ID = new ArrayList<String>();
		String user = uI.readLine();
		while(user != null)
		{
			user_ID.add(user);
			user = uI.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader cO = new BufferedReader(new FileReader("cost.txt"));
		ArrayList<String> cost = new ArrayList<String>();
		String price = cO.readLine();
		while(price != null)
		{
			cost.add(price);
			price = cO.readLine();
		}
		
		
}
	

}
