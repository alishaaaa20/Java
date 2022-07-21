import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {

    public static void main(String [] args)
    {
        try{
            Socket s= new Socket("localhost",4000);
            Scanner scan= new Scanner(System.in);

            System.out.println("Enter a string");

            String val= scan.next();

            DataOutputStream dos= new DataOutputStream(s.getOutputStream());
            dos.writeUTF(val);

            DataInputStream dis=new DataInputStream(s.getInputStream());

            String ans=dis.readUTF();
            System.out.println("The string is "+ans);
            dis.close();
            dos.close();
            scan.close();
            s.close();


        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    
}