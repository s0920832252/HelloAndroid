package nthu.mad.ch4_11_imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private Button btn,btn2,btn3;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        iv=(ImageView)findViewById(R.id.imageView);

        /* 多個元件 一對一 多個監視器
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                iv.setImageResource(R.drawable.image);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                iv.setImageResource(R.drawable.image2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                iv.setImageResource(R.drawable.image3);
            }
        });
        */

        //一個監聽器 對 多個元件
        View.OnClickListener OCKL=new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (((Button)v).getId())
                {
                    case R.id.button:
                        iv.setImageResource(R.drawable.image);
                        break;
                    case R.id.button2:
                        iv.setImageResource(R.drawable.image2);
                        break;
                    case R.id.button3:
                        iv.setImageResource(R.drawable.image3);
                        break;
                    default:
                        finish();
                }
            }
        };
        btn.setOnClickListener(OCKL);
        btn2.setOnClickListener(OCKL);
        btn3.setOnClickListener(OCKL);

    }
}
