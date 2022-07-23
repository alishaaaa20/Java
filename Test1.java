class Employee{
    private String name;
    private int id, salary;

    public Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public int getYearlySalary(){
        return this.salary*12;
    }

    public String toString(){
        return "name="+this.name + "id="+this.id + "salary=" + this.getYearlySalary();
    }
}

class Teacher extends Employee{
    int nClasses;

    public Teacher(String name, int id, int salary, int nClasses){
        super(name,id,salary);
        this.nClasses=nClasses;
    }

    public int getYearlySalary(){
        return super.getYearlySalary() +this.nClasses*100;
    }
}

class Test1{
    public static void main(String[]args){
        Employee E= new Employee("alisha", 1, 100);
        Teacher T= new Teacher("aashika", 2, 100, 5);
        System.out.println(E);
        System.out.println(T);
    }
}

