package co.GrandCircus.SpringLabs;



public class Items {
	private Integer id;
	private String Name;
	private String Description;
	private Integer Quantity;
	private String Price;
	
	
	public Items() {
		super();
		
	}


	public Items(Integer id, String name, String description, Integer quantity, String price) {
		super();
		this.id = id;
		this.Name = name;
		this.Description = description;
		this.Quantity = quantity;
		this.Price = price;
	}


	public Items(String name, String description, Integer quantity, String price) {
		super();
		this.Name = name;
		this.Description = description;
		this.Quantity = quantity;
		this.Price = price;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public Integer getQuantity() {
		return Quantity;
	}


	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}


	public String getPrice() {
		return Price;
	}


	public void setPrice(String price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "Items [id=" + id + ", Name=" + Name + ", Description=" + Description + ", Quantity=" + Quantity
				+ ", Price=" + Price + "]";
	}


	
	
	
	

}
