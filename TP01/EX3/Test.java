package TP01.EX3;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Luiz", "Emirados Arabes");
		Student student = new Student(person.getName(), person.getAddress(),"ADS", 4, 150.00);
		Staff staff = new Staff(person.getName(), person.getAddress(),"federal", 35000);
		System.out.println(student);
		System.out.println(staff);
		
		System.out.println();
		
		System.out.println("Alterando Sets de Student e Staff");
		student.setProgram("Desenvolvimento de sistemas");
		student.setYear(2024);
		student.setFee(10);
		
		staff.setPay(15400);
		staff.setSchool("IFSP");
		
		System.out.println(student);
		System.out.println(staff);
	}
}
