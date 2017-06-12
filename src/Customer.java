
public class Customer {
	private int CustomerId;
	private String Title;
	private String FullName;
	private String LastName;
	private String StreetAddress;
	private String City;
	private String State;
	private String ZipCode;
	private String EmailAddress;
	private String Position;
	private String Company;
	
	// add edit customers address
	public int toInt(){
		return CustomerId;
	}
	public String toString(){
		return Title + " " + FullName + "\n " + StreetAddress + "\n" + City + ", " + State + " " + ZipCode
				+ "\n" + EmailAddress + "\n" + Position + " at " + Company;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getFullName(String fullName) {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
