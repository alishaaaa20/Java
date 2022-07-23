public abstract class Sportsperson{
    String name;
    int age;

    public Sportsperson(String name, int age){
        this.name=name;
        this.age=age;
    }

    public abstract void pointStats();

    public void displayInfo(){
        System.out.println("Name="+ this.name + "age="+ this.age);
    }

}

public abstract class FootballPlayer extends Sportsperson{
    int goals;

    public FootballPlayer(String name, int age, int goals){
        super(name,age);
        this.goals=goals;
    }

    public void printStats(){
        System.out.println(this.goals);
    }
}

class Abstract{
    public static void main(String[]args){
        Sportsperson s= new Sportsperson("alisha", 20);
        FootballPlayer f= new FootballPlayer("aashika", 20);
        System.out.println(s);
        System.out.println(f);
    }
}