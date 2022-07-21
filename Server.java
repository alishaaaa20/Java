import java.net.*;
import java.io.*;

class Server{
    public static void main(String [] args){
        try{ 
            ServerSocket ss= new ServerSocket(4000);
            System.out.println("Server is runnig in port no: 4000");
            Socket s=ss.accept();
            System.out.println("client connected");
            DataInputStream dis= new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            String str=dis.readUTF(); 
            String nstr="";
               
            for (int i=0; i<str.length(); i++){
              char ch= str.charAt(i); 
              nstr= ch+nstr; 
            }

            if(nstr.equals(str)){
                dos.writeUTF("palindrome");
            }
            else{
                dos.writeUTF("Not palindrome");
            } 
            dos.flush();
            dos.close();
            dis.close();
            s.close();
            ss.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}