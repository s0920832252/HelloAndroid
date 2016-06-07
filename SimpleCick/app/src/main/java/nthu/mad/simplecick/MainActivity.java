package nthu.mad.simplecick;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
    }

    public void btn(View v)
    {
        tv.setText(R.string.btn1);
        tv.setTextColor(Color.BLUE);
        tv.setTextSize((float) 70);
        tv.setBackgroundColor(Color.parseColor("#91AA6C"));
        Toast.makeText(MainActivity.this, getString(R.string.btn1), Toast.LENGTH_SHORT).show();

    }

    public void btn1(View v)
    {
        tv.setText(R.string.btn2);
        tv.setTextColor(Color.YELLOW);
        tv.setTextSize((float)30);
        tv.setBackgroundColor(Color.parseColor("#A11A6C"));
        Toast.makeText(MainActivity.this,getString(R.string.btn2),Toast.LENGTH_SHORT).show();

    }

    public void btn2(View v)
    {
        tv.setText("");
        tv.setTextColor(Color.BLUE);
        tv.setBackgroundColor(Color.parseColor("#8111AC"));
        Toast.makeText(MainActivity.this,getString(R.string.btn3),Toast.LENGTH_SHORT).show();

    }
}
