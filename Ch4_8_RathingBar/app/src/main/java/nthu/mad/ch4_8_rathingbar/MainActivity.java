package nthu.mad.ch4_8_rathingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private RatingBar rb;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb=(RatingBar)findViewById(R.id.ratingBar);
        iv=(ImageView)findViewById(R.id.imageView);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                String msg=getString(R.string.RathingBar_text)+rb.getRating()+getString(R.string.Num_Star);
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                if(rating>3.5)
                    iv.setImageResource(R.drawable.on);
                else
                    iv.setImageResource(R.drawable.off);

            }
        });


    }


}
