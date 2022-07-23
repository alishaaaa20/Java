import java.io.*;

class Student implements Serializable{
    String name;

    public Student(String name){
        this.name=name;
    }

    public void print(){
        System.out.println(this.name);
    }
}

class SExample{
    public  static void main(String[]args){
        Student s= new Student("Alisha");
        try{
            FileOutputStream fos= new FileOutputStream("object.txt");
            ObjectOutputStream os=new ObjectOutputStream(fos);

            os.writeObject(s);
            os.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}