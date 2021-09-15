package demoo.lti.demos;



	public class Customer {
	   int pid;
	   String pname;
	   int cost;
	   
	   
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public Customer(int pid, String pname, int cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}




	public  Customer() {
		super();
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	  
	}

