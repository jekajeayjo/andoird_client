package md.alishop.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import android.os.Handler;
import android.widget.Toast;

public class MyServerThread extends  MainActivity implements Runnable {
Socket s;
ServerSocket ss;
BufferedReader br;
InputStreamReader isr;
String message="";
Handler h=new Handler();

    @Override
    public void run() {
try
{

    ss=new ServerSocket(8081);
    while (true)
    {
        s=ss.accept();
        isr=new InputStreamReader(s.getInputStream());
        br=new BufferedReader (isr);
        message=br.readLine();
        t1.setText(message);
//h.post(new Runnable() {
  //  @Override
 //   public void run() {
//e1.setText(message);
  //  }
//});
    }
}
catch (IOException e)
{e.printStackTrace();}
    }
}
