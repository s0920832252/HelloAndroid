package nthu.mad.ch4_5_checkboxbtn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    CheckBox cb,cb2,cb3;
    EditText ed,ed2,ed3,ed4;
    Button btn;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb=(CheckBox)findViewById(R.id.checkBox);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        ed=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        btn=(Button)findViewById(R.id.button);
        tv3=(TextView)findViewById(R.id.textView3);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    ed.setText("48000");
                    String msg="已選填"+cb.getText()+ed.getText();
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ed.setText("0");
                }
                int sum=Integer.parseInt(ed.getText().toString())+
                        Integer.parseInt(ed2.getText().toString())+
                        Integer.parseInt(ed3.getText().toString());
                ed4.setText(String.valueOf(sum));
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (cb2.isChecked())
                {
                    ed2.setText("53000");
                    String msg = "已選填" + cb2.getText() + ed2.getText();
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                } else
                {
                    ed2.setText("0");
                }
                int sum = Integer.parseInt(ed.getText().toString()) +
                        Integer.parseInt(ed2.getText().toString()) +
                        Integer.parseInt(ed3.getText().toString());
                ed4.setText(String.valueOf(sum));
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (cb3.isChecked())
                {
                    ed3.setText("57000");
                    String msg = "已選填" + cb3.getText() + ed3.getText();
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                } else
                {
                    ed3.setText("0");
                }
                int sum = Integer.parseInt(ed.getText().toString()) +
                        Integer.parseInt(ed2.getText().toString()) +
                        Integer.parseInt(ed3.getText().toString());
                ed4.setText(String.valueOf(sum));
            }
        });

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String List=getString(R.string.title)+"\n";
                if(cb.isChecked())
                    List=List+cb.getText()+ed.getText()+"\n";
                if(cb2.isChecked())
                    List=List+cb2.getText()+ed2.getText()+"\n";
                if(cb3.isChecked())
                    List=List+cb3.getText()+ed3.getText()+"\n";
                tv3.setText(List);
            }
        });


    }
}