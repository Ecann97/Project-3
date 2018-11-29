import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class User {
	
	private String first_Name;
	private String last_Name;
	private String email;
	private String password;
	private String address;

	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader fN = new BufferedReader(new FileReader("first_Name.txt"));
		ArrayList<String> first_Name = new ArrayList<String>();
		String first = fN.readLine();
		while(first != null)
		{
			first_Name.add(first);
			first = fN.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader lN = new BufferedReader(new FileReader("last_Name.txt"));
		ArrayList<String> last_Name = new ArrayList<String>();
		String last = lN.readLine();
		while(last !=null)
		{
			last_Name.add(last);
			last = lN.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader eM = new BufferedReader(new FileReader("email.txt"));
		ArrayList<String> email = new ArrayList<String>();
		String ema = eM.readLine();
		while(ema !=null)
		{
			email.add(ema);
			ema = eM.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader pW = new BufferedReader(new FileReader("password.txt"));
		ArrayList<String> password = new ArrayList<String>();
		String pass = pW.readLine();
		while(pass !=null)
		{
			last_Name.add(pass);
			pass = pW.readLine();
		}
		
		@SuppressWarnings("resource")
		BufferedReader aD = new BufferedReader(new FileReader("address.txt"));
		@SuppressWarnings("unused")
		ArrayList<String> address = new ArrayList<String>();
		String add = aD.readLine();
		while(add !=null)
		{
			last_Name.add(add);
			add = aD.readLine();
		}
	}
	
	
}

