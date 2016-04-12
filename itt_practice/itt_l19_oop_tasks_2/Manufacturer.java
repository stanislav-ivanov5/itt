package lesson19_oop_tasks_2;

public class Manufacturer {

	private static final String PHONE_NUM_PREFIX = "08";
	private static final String FAX_NUM_PREFIX = "08";
	private static final int FAX_NUM_LENGTH = 10;
	private static final int PHONE_NUM_LENGTH = 10;
	private static final String DEFAULT_FAX_NUM = "9000000";
	private static final String DEFAULT_PHONE_NUM = "0800000000";
	private static final String DEFAULT_ADDRESS = "";
	private static final String DEFAULT_COUNTRY_NAME = "";
	private static final String DEFAULT_MANUFACTURER_NAME = DEFAULT_COUNTRY_NAME;
	
	private String nameOfManufacturer;
	private String country;
	private String address;
	private String phoneNum;
	private String faxNum;
	
	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}
	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = (nameOfManufacturer != null) ? 
				nameOfManufacturer : DEFAULT_MANUFACTURER_NAME;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = (country != null) ? country : DEFAULT_COUNTRY_NAME;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = (address != null) ? address : DEFAULT_ADDRESS;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		boolean isValidPhoneNum = phoneNum != null 
				&& phoneNum.length() == PHONE_NUM_LENGTH && phoneNum.startsWith(PHONE_NUM_PREFIX);
		this.phoneNum = (isValidPhoneNum ) ? phoneNum : DEFAULT_PHONE_NUM;
	}
	public String getFaxNum() {
		return faxNum;
	}
	public void setFaxNum(String faxNum) {
		boolean isValidFaxNum = faxNum != null 
				&& faxNum.length() == FAX_NUM_LENGTH && faxNum.startsWith(FAX_NUM_PREFIX);
		this.faxNum = (isValidFaxNum) ? faxNum : DEFAULT_FAX_NUM;
	}
}
