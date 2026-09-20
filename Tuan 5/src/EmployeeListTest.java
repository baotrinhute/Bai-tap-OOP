import junit.framework.TestCase;

public class EmployeeListTest extends TestCase {
    public void testConstructor(){
        EmployeeList ae1 = new EmployeeEmpty();
        Employee e1 = new Employee(67,"Liem", "Security Guard",ae1);
        EmployeeList ae2 = new EmployeeCons(e1,ae1);
        Employee e2 = new Employee(68,"Tri","Chaos",ae2);
        Employee e3 = new Employee(45,"Nam","Senior Guard",ae2);
    }
}
