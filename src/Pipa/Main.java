package Pipa;


public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args){
        employees[0] = new Employee("Запупов Василиск Иванович",  500, 2);
        employees[1] = new Employee("Песочник Александра Павловна",  9999999, 5);
        employees[2] = new Employee("Хайруллов Ильдар Тимурович",  9999998, 5);
        employees[3] = new Employee("Полиненко Полина Романовна",  80000, 3);
        employees[4] = new Employee("Терпилов Даемас Болгарович",  1, 2);
        employees[5] = new Employee("Тунец Стива Васильевич",  50000, 4);
        employees[6] = new Employee("Жапаров Сердар Кыргызович",  1, 1);
        employees[7] = new Employee("Попов Виктор Артмемович",  50001, 3);
        employees[8] = new Employee("Наставник Скайпро Бесович",  1, 1);
        employees[9] = new Employee("Ежиков Димас Ктотамович",  8000, 3);
        for(Employee EmployeeS: employees){
            System.out.println(EmployeeS);
        }

    }
    private static int sumSalary(){
        int sum = 0;
        for(Employee Emp: employees) {
            sum += Emp.getSalary();

        }
        return sum;
    }
    private static int minSalary(int salary){
        int minn = 100000000;
        for (Employee Emp: employees){
            if (minn > Emp.getSalary()) {
                minn = Emp.getSalary();

            }

        }
        return  minn;

    }
    private static int maxSalary(int salary){
        int maxx = -10000000;
        for (Employee Emp: employees){
            if (maxx < Emp.getSalary()) {
                maxx = Emp.getSalary();

            }

        }
        return  maxx;

    }
    private static double avgSalary(){

        return  sumSalary()/(double)employees.length;

    }
    private static void fio(){
        for(Employee Emp: employees){
            System.out.println(Emp.getName());
        }






}}
