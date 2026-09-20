public class Employee extends EmployeeList{
    private int IDNumber;
    private String name;
    private String title;
    private EmployeeList subordinate;
    public Employee(int IDNumber,String name,String title,EmployeeList subordinate){
        this.IDNumber = IDNumber;
        this.name = name;
        this.title = title;
        this.subordinate = subordinate;
    }
}
