package thesevenitsolutions.com.docshub;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class findhospital extends AppCompatActivity {
    RatingBar rating2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findhospital);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        rating2 = (RatingBar) findViewById(R.id.rating2);
        rating2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String rating = String.valueOf(rating2.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }

        });
    }
}

