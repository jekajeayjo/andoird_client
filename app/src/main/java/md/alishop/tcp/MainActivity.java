package md.alishop.tcp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
EditText e1,e2;
TextView t1;
   static String mess="";
     public String answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView) findViewById(R.id.textView3) ;

        Thread mythread =new Thread(new MyServerThread());
        mythread.start();

    }
    public  void send (View v)
    {
        mess="Select id  from dbo.enter where loginn='"+e1.getText().toString()+"' and passwordd="+e2.getText().toString()+";";
      MessageSender ms=new MessageSender();
ms.execute(mess);
//MessageRecieve mr=new MessageRecieve();
//answer=mr.answer;
//t1.setText(answer);

    }
}
