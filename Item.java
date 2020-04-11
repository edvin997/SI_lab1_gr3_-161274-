enum danok {"A"=0.18, "B"=0.5, "V"=0};
class Item {
	int id;
	String name;
	double price;
	danok dan;

	//TODO add variable.
	//TODO constructor

	//TODO setters and getters


	public Item(int id, String name, double price, danok dan) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.dan = dan;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDan(danok dan) {
		this.dan = dan;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public danok getDan() {
		return dan;
	}
	double taxReturn () {
		//TODO
		int dank=price*dan;
		return dank*0.15
	}
}