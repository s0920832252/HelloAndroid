package nthu.mad.ch4_9_seekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private RelativeLayout relative;
    private SeekBar SB;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relative = (RelativeLayout) findViewById(R.id.relative);
        SB = (SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.textView);

        SB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                relative.setBackgroundColor(Color.rgb(seekBar.getProgress(), progress, SB.getProgress()));


                String msg = getString(R.string.two) + getString(R.string.start) + getString(R.string.OnProgress)
                        + SB.getProgress();
                Toast to = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER_VERTICAL, 0, 50);
                to.show();


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                String msg = getString(R.string.one) + getString(R.string.start) + getString(R.string.OnStart)
                        + SB.getProgress();
                Toast to = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                tv.setTextColor(Color.GRAY);
                to.show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                String msg = getString(R.string.three) + getString(R.string.start) + getString(R.string.OnStop)
                        + SB.getProgress();
                Toast to = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                to.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                tv.setTextColor(Color.BLUE);
                to.show();

            }
        });
    }
}
