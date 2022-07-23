import java.io.*;
import java.util.Scanner;

class pExample{
    public static void main(String[]args){
        try{
            Scanner scan= new Scanner(System.in);
            FileOutputStream fos= new FileOutputStream("record.txt");
            DataOutputStream dos= new DataOutputStream(fos);
            String prompt;
            do{
                System.out.println("Enter a name");
                String name= scan.next();

                System.out.println("Enter a age");
                int age= scan.nextInt();

                System.out.println("Enter a faculty");
                String faculty= scan.next();

                System.out.println("Enter yes to continue or no to discard");

                dos.writeUTF(name);
                dos.writeInt(age);
                dos.writeUTF(faculty);

                prompt= scan.next();
                
            }while(prompt.toLowerCase(a).equals("yes"));

            dos.close();
            fos.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}