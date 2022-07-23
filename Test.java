class Employee{
    private int id;
    private String name;
    private String post;
    private int salary;

    public Employee(int id, String name, String post, int salary){
        this.id=id;
        this.name=name;
        this.post=post;
        this.salary=salary;
    }

    public String toString(){
        return "id="+this.id + "name="+this.name +"post="+this.post +"salary="+this.salary; 
    }
}
class Test{
    public static void main(String[]args){
        Employee E = new Employee(1, "alisha", "programmer", 50000);
    
    System.out.println(E);

    }
    

}
    
