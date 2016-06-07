package nthu.mad.ch4_6_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private CheckBox cb,cb2,cb3;
    private EditText et,et2,et3;
    private RadioButton rb,rb2,rb3;
    private Button btn;
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb=(CheckBox)findViewById(R.id.checkBox);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        et=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        rb=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        btn=(Button)findViewById(R.id.button);
        tv3=(TextView)findViewById(R.id.textView3);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                    et.setText("1200");
                else
                    et.setText("0");
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                    et2.setText("1400");
                else
                    et2.setText("0");
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(cb3.isChecked())
                    et3.setText("1100");
                else
                    et3.setText("0");
            }
        });

        rb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), rb.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        rb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),rb2.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        rb3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),rb3.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                long disSum=0;
                int  sum=0;
                String msg=getString(R.string.title)+'\n';
                if(cb.isChecked())
                {
                    sum=sum+Integer.parseInt(et.getText().toString());
                    msg=msg+cb.getText()+": "+et.getText()+getString(R.string.dollar)+'\n';
                }
                if(cb2.isChecked())
                {
                    sum=sum+Integer.parseInt(et2.getText().toString());
                    msg=msg+cb2.getText()+": "+et2.getText()+getString(R.string.dollar)+'\n';
                }
                if(cb3.isChecked())
                {
                    sum=sum+Integer.parseInt(et3.getText().toString());
                    msg=msg+cb3.getText()+": "+et3.getText()+getString(R.string.dollar)+'\n';
                }
                msg=msg+'\n'+getString(R.string.sum)+sum+getString(R.string.dollar)+'\n'
                        +getString(R.string.discount);

                if(rb.isChecked())
                {
                    disSum=Math.round(sum*0.7);
                    msg=msg+rb.getText()+'\n';
                }
                if(rb2.isChecked())
                {
                    disSum=Math.round(sum*0.8);
                    msg=msg+rb2.getText()+'\n';
                }
                if(rb3.isChecked())
                {
                    disSum=Math.round(sum*0.9);
                    msg=msg+rb3.getText()+'\n';
                }
                msg=msg+getString(R.string.disSum)+disSum+getString(R.string.dollar);
                tv3.setText(msg);
            }
        });



    }
}
