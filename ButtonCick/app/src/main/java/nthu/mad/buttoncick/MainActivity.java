package nthu.mad.buttoncick;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    Button btn,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv.setText(getString(R.string.btn1));
                tv.setTextColor(Color.RED);
                tv.setBackgroundColor(Color.YELLOW);
                btn.setBackgroundColor(Color.RED);
                Toast to=Toast.makeText(getApplicationContext(),getString(R.string.btn1),Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER,50,50);
                to.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv.setText(getString(R.string.btn2));
                tv.setTextColor(Color.BLUE);
                tv.setBackgroundColor(Color.BLACK);
                btn2.setBackgroundColor(Color.GRAY);
                Toast to=Toast.makeText(getApplicationContext(),getString(R.string.btn2),Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER,100,50);
                to.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv.setText(getString(R.string.btn3));
                tv.setTextColor(Color.CYAN);
                tv.setBackgroundColor(Color.GREEN);
                btn3.setBackgroundColor(Color.DKGRAY);
                Toast to=Toast.makeText(getApplicationContext(),getString(R.string.btn3),Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER,100,100);
                to.show();
            }
        });
    }

}
