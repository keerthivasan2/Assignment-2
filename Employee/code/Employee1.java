class Employee1
{
	int id;
	String name;
	float salary;
	 Employee1(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public void display() {
	    System.out.println("id: "+id );
		System.out.println("Name :" +name);
		System.out.println("salary: "+salary);	
	}
	
	public static void main(String...args) {
		Employee1 EM=new Employee1(406,"Keerthivasan",45000);
		EM.display();
		
	}
}