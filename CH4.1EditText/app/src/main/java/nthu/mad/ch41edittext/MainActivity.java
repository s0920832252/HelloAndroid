package nthu.mad.ch41edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText ed,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText3);
        ed3=(EditText)findViewById(R.id.editText4);

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
                if(event.getAction()==KeyEvent.ACTION_DOWN && keyCode==KeyEvent.KEYCODE_ENTER)
                {
                    Toast.makeText(getApplicationContext(),ed2.getText(),Toast.LENGTH_SHORT).show();
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
                if(event.getAction()==KeyEvent.ACTION_DOWN && keyCode==KeyEvent.KEYCODE_ENTER)
                {
                    Toast.makeText(getApplicationContext(),ed3.getText(),Toast.LENGTH_SHORT).show();
                    return true;//監聽結束
                }
                return false;//繼續監聽
            }
        });

    }
}
