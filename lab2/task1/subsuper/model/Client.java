package lab2.task1.subsuper.model;

public class Client extends Person {
	private String email;
	
	public Client(String name, int age, String phoneNumber,String email) {
		super(name, age, phoneNumber);
		this.email=email;
	}
	
	@Override
	public boolean equals(Object o) {
		//if(this==o)return true;
		if (!super.equals(o)) return false; 
		if(o==null || !(o instanceof Client))return false;
		Client a=(Client) o;
		return email.equals(a.email);
	}
	
	@Override
	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), email);
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return super.toString()+" email: "+email;
	}
	
}
