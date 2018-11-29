import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Address {
	
	private String street;
	private String city;
	private String state;
	
	private int zipcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	
public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader sT= new BufferedReader(new FileReader("street.txt"));
		ArrayList<String> street = new ArrayList<String>();
		String str = sT.readLine();
		while(str != null)
		{
			street.add(str);
			str = sT.readLine();
		}
		
	
		@SuppressWarnings("resource")
		BufferedReader cI= new BufferedReader(new FileReader("city.txt"));
		ArrayList<String> city = new ArrayList<String>();
		String cit = cI.readLine();
		while(cit != null)
		{
			city.add(cit);
			cit = cI.readLine();
		}
			
		
				
		@SuppressWarnings("resource")
		BufferedReader sA= new BufferedReader(new FileReader("state.txt"));
		ArrayList<String> state = new ArrayList<String>();
		String sta = sA.readLine();
		while(sta != null)
		{
			state.add(sta);
			sta = sA.readLine();
		}
		
		
		@SuppressWarnings("resource")
		BufferedReader zC= new BufferedReader(new FileReader("zipcode.txt"));
		ArrayList<String> zipcode = new ArrayList<String>();
		String zip = zC.readLine();
		while(zip != null)
		{
			zipcode.add(zip);
			zip = zC.readLine();
		}
		
}
}
