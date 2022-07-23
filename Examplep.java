import java.io.*;


class Examplep{
    public static void main(String[]args){
        try{
       
            FileInputStream fis= new FileInputStream("record.txt");
            DataInputStream dis= new DataInputStream(fis);
            
            while(dis.available()>0){
                String name= dis.readUTF();
                int age= dis.readInt();
                String faculty= dis.readUTF();
                if(faculty.equals("it")){
                    System.out.println("name"+name+"age"+age);
                }
            }

      fis.close();
      dis.close();



        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}