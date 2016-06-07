package nthu.mad.ch4_10_seekbardemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private RelativeLayout RL;
    private SeekBar sb,sb2,sb3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RL=(RelativeLayout)findViewById(R.id.relative);
        sb=(SeekBar)findViewById(R.id.seekBar);
        sb2=(SeekBar)findViewById(R.id.seekBar2);
        sb3=(SeekBar)findViewById(R.id.seekBar3);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                RL.setBackgroundColor(Color.rgb(sb.getProgress(),sb2.getProgress(),sb3.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.start)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.end)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                RL.setBackgroundColor(Color.rgb(sb.getProgress(),sb2.getProgress(),sb3.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.start)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.end)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                RL.setBackgroundColor(Color.rgb(sb.getProgress(),sb2.getProgress(),sb3.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.start)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                String msg=getString(R.string.end)+getString(R.string.red)+sb.getProgress()
                        +"  "+getString(R.string.green)+sb2.getProgress()
                        +"  "+getString(R.string.blue)+sb3.getProgress();
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
