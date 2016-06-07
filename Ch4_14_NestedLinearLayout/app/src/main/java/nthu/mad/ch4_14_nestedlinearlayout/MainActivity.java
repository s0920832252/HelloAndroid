package nthu.mad.ch4_14_nestedlinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button btn,btn2,btn3,btn4;
    private ImageView iv;
    private TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        iv=(ImageView)findViewById(R.id.imageView);
        tv=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);

        View.OnClickListener OCL=new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (((Button)v).getId())
                {
                    case R.id.button:
                        iv.setImageResource(R.drawable.mb5);
                        tv.setText(getString(R.string.mb5));
                        tv2.setText(getString(R.string.mb5_1));
                        break;

                    case R.id.button2:
                        iv.setImageResource(R.drawable.mb6);
                        tv.setText(getString(R.string.mb6));
                        tv2.setText(getString(R.string.mb6_1));
                        break;

                    case R.id.button3:
                        iv.setImageResource(R.drawable.mb7);
                        tv.setText(getString(R.string.mb7));
                        tv2.setText(getString(R.string.mb7_1));
                        break;

                    case R.id.button4:
                        iv.setImageResource(R.drawable.mb8);
                        tv.setText(getString(R.string.mb8));
                        tv2.setText(getString(R.string.mb8_1));
                        break;
                }
            }
        };
        btn.setOnClickListener(OCL);
        btn2.setOnClickListener(OCL);
        btn3.setOnClickListener(OCL);
        btn4.setOnClickListener(OCL);
    }
}
