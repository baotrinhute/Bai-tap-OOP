public class EmployeeCons extends EmployeeList {
    private Employee rest;
    private EmployeeList last;
    public EmployeeCons(Employee rest,EmployeeList last){
        this.rest = rest;
        this.last = last;
    }
}
