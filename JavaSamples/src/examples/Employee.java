package examples;

public class Employee {
int empId;
String name;
Address address;



/*
 * public int getEmpId() { return empId; } public void setEmpId(int empId) {
 * this.empId = empId; } public String getName() { return name; } public void
 * setName(String name) { this.name = name; } public Address getAddress() {
 * return address; }
 * 
 * 
 * public void setAddress(Address address) { this.address = address; }
 */
 
public Employee(int empId, String name, Address address) {
	super();
	this.empId = empId;
	this.name = name;
	this.address = address;
}
/*
 * public Employee(int empId, String name) { super(); this.empId = empId;
 * this.name = name; } public Employee() { // TODO Auto-generated constructor
 * stub }
 */

}
