package md.alishop.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MessageRecieve extends MainActivity {
    Socket s;
    ServerSocket ss;
    BufferedReader br;
    InputStreamReader isr;
    String message="";
 public String  recieve ()
 {


     try
     {
         ss=new ServerSocket(8081);
         while(true)
         {
             s=ss.accept();
             isr = new   InputStreamReader(s.getInputStream());
             br=new BufferedReader (isr);
             message=br.readLine();
           //  System.out.println(message);


         }
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
     return  message;
 }

}
