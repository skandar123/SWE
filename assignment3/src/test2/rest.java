//Name: Sayantika Kandar
package test2;

public class rest {
	
	
	private String city;
	private String state;
	private String zip;
	
	public rest(String state,String city,String zip)
	{
		this.state=state;
		this.city=city;
		this.zip=zip;
		
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	public rest()
	{
		super();
	}
}



