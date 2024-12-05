package examples;

public class Test {
public static void main(String[] args) {
	
	
	Address address=new Address("hyd",500072);
	Employee employee = new Employee(1,"Ravi",address);  //using constructor
	
	
	System.out.println(employee.empId);
	System.out.println(employee.name);
	System.out.println(employee.address.city);
	System.out.println(employee.address.pincode);
	
	System.out.println(address.city);
	System.out.println(address.pincode);
	
	
	/*System.out.println(employee.getAddress().getCity());
	System.out.println(employee.address.getPincode());*/
	
	
	
	
	/*Employee employee1 = new Employee(1,"Ravi");   //using setter method
	employee1.setAddress(address);
	System.out.println(employee1.getAddress().getPincode());
	System.out.println(employee1.getAddress().getCity());
	
	Employee e1=new Employee(2,"ssk");  
	e1.address = new Address("vizag",400072);
	
	System.out.println(e1.getAddress().getPincode());
	System.out.println(e1.getAddress().getCity());*/
}
}
