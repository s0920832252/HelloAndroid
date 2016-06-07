package nthu.mad.ch4_15_scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    private LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = (LinearLayout) findViewById(R.id.linear);

        for (int i = 1; i <= 20; i++)
        {
            EditText et = new EditText(this);
            Button btn = new Button(this);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            et.setHint(getString(R.string.et));
            btn.setText(getString(R.string.btn));

            linear.addView(et, params);
            linear.addView(btn, params);

        }
    }
}
