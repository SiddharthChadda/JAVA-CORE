package CustomExcp;

import java.util.Scanner;

public class EmployeeSalary {
void calCulatesalary(float sal) throws EmployeeSalaryException {
	if (sal>20000) {
		System.out.println("u r gud emp");
	} else {
              throw new EmployeeSalaryException("u r not a gud emp");
	}
	
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter salary");
	
		float sal1= sc.nextFloat();
		float salary=sal1+ sal1*0.20f;
		
	try {
		try {
			new EmployeeSalary().calCulatesalary(salary);
		} catch (EmployeeSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	finally{
		System.out.println(salary);
	}

	}

}
