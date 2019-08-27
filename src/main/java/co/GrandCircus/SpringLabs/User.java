package co.GrandCircus.SpringLabs;

public class User {

	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String eMail;
	
	private String passWord;
	
	private String phoneNum; 
	 
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public User( String firstName, String lastName, String eMail, String passWord, String phoneNum) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.passWord = passWord;
		this.phoneNum = phoneNum;
	}


	public User(Integer id, String firstName, String lastName, String eMail, String passWord, String phoneNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.passWord = passWord;
		this.phoneNum = phoneNum;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	

}