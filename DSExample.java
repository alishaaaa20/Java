import java.io.*;


class Student implements DeSerializable{
    String name;

    public Student(String name){
        this.name=name;
    }

    public void print(){
        System.out.println(this.name);
    }
}
class DSExample{
    public  static void main(String[]args){
        try{
            FileInputStream fis= new FileInputStream("object.txt");
            ObjectInputStream os=new ObjectInputStream(fis);
            Student obj = (Student)os.readObject();

            obj.print();
            os.close();
            fis.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}