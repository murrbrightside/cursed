package Pipa;

public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private int id;
    private static int idGen = 1;
    public Employee(String fullName,int  salary, int department){
        this.fullName =  fullName;
        this.salary = salary;
        this.department = department;
        this.id = idGen++;
    }
    public String getName(){
        return this.fullName;
    }
    public int getSalary(){

        return this.salary;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getId(){
        return this.id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public String toString (){
        return "ФИО " + fullName + " зарплата " + salary + " айди " + id + " отдел " + department;
    }
}


