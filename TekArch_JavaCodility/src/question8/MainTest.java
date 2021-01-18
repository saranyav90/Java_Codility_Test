package question8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee john=new Employee(101,"John Edward");
		Employee johnDuplicate=new Employee(101,"John Edward");
		Employee kim=new Employee(102,"Kim Lee");
		
		List<Employee> empList=new ArrayList();
		empList.add(john);
		empList.add(johnDuplicate);
		empList.add(kim);
		//System.out.println("Employee List(Duplicate): ");
		for(Employee e:empList) {
			System.out.print(e.getEmployeeName()+"  ");
		}
		
		 System.out.println();
	
		 java.util.List<Employee> uniqueEmployee = empList.stream().distinct().collect(Collectors.toList());
		 
		for(Employee e:uniqueEmployee) {
			System.out.print(e.getEmployeeId()+" , "+e.getEmployeeName());
		}
}
}
