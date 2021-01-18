package question8;

/*
 * 8. Store user defined employee objects into arraylist and Remove duplicates from arraylist without using collections.
 * 
 */

public class Employee {

	private int employeeId; 
    private String employeeName;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public Employee(int employeeId,String employeeName) {
    	this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            return ((Employee) obj).employeeId == employeeId;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.employeeId;
    }
    
}
