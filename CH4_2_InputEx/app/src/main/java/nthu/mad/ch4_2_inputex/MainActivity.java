package nthu.mad.ch4_2_inputex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText ed,ed2,ed3;
    CheckBox cb,cb2,cb3;
    Button btn,btn2,btn3;
    TextView tv,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText3);
        ed3=(EditText)findViewById(R.id.editText4);
        cb=(CheckBox)findViewById(R.id.checkBox);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        tv=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);



        ed.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction()==KeyEvent.ACTION_DOWN && keyCode==KeyEvent.KEYCODE_ENTER)
                {
                    Toast.makeText(getApplicationContext(),ed.getText(),Toast.LENGTH_SHORT).show();
                    return true;//監聽結束
                }
                return false;//繼續監聽
            }
        });

        ed2.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER)
                {
                    Toast.makeText(getApplicationContext(), ed2.getText(), Toast.LENGTH_SHORT).show();
                    return true;//監聽結束
                }
                return false;//繼續監聽
            }
        });

        ed3.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER)
                {
                    Toast.makeText(getApplicationContext(), ed3.getText(), Toast.LENGTH_SHORT).show();
                    return true;//監聽結束
                }
                return false;//繼續監聽
            }
        });

        cb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String msg;
                if (((CheckBox) v).isChecked())
                    msg = "選填" + cb.getText();
                else
                    msg = "放棄" + cb.getText();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });

        cb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String msg;
                if(cb2.isChecked())
                    msg="選填"+cb2.getText();
                else
                    msg="放棄"+cb2.getText();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        cb3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String msg;
                if(((CheckBox)v).isChecked())
                    msg="選填"+cb3.getText();
                else
                    msg="放棄"+cb3.getText();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String msg=tv.getText().toString()+ed.getText()+"\n"
                        +tv2.getText()+ed2.getText()+"\n"
                        +tv3.getText()+ed3.getText();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed.setText("");
                ed2.setText("");
                ed3.setText("");
                Toast.makeText(getApplicationContext(),getString(R.string.reset),Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),R.string.exit,Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
