package driver;

import model.AdminDepartment;
import model.HrDepartment;
import model.TechDepartment;

public class Main {

	public static void main(String[] args) {
	
		AdminDepartment adminDepartment = new AdminDepartment();// New object of Admin Department
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println();//A blank line as per expected output
		
		HrDepartment hrDepartment = new HrDepartment();//New object of Hr Department
		System.out.println("Welcome to "+ hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println();//A blank line as per expected output
		
		TechDepartment techDepartment = new TechDepartment();//New object of Tech Department 
		System.out.println("Welcome to "+ techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		

	}

}
