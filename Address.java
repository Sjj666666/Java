package week4;

public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	private String postcode;

	public Address() {
		country = "δ֪";
		province = "δ֪";
		city = "δ֪";
		street = "δ֪";
		postcode = "δ֪";
	}

	public Address(String country, String province, String city, String street, String postcode) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void displayAddress() {
		System.out.println("Country:"+country);
		System.out.println("Province:"+province);
		System.out.println("City:"+city);
		System.out.println("Street:"+street);
		System.out.println("Postcode:"+postcode);
	}

}
