package nthu.mad.ch4_7_togglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    private ToggleButton tb;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb=(ToggleButton)findViewById(R.id.toggleButton);
        iv=(ImageView)findViewById(R.id.imageView);

        tb.setTextSize(24);
        tb.setBackgroundColor(Color.DKGRAY);
        //tb.setTextOff("請開燈");
        //tb.setTextOn("請關燈");

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                iv.setImageResource((isChecked)?R.drawable.on:R.drawable.off);
                tb.setTextColor((isChecked)? Color.WHITE:Color.BLACK);
                tb.setTextSize((isChecked)?36:24);
            }
        });
    }
}
