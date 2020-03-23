package thesevenitsolutions.com.docshub;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;

public class useraddress extends AppCompatActivity {
    @BindView(R.id.imgaddress)
    ImageView imgaddress;
    @BindView(R.id.txtcity)
    EditText txtcity;
    @BindView(R.id.txtpin)
    EditText txtpin;
    @BindView(R.id.txtname)
    EditText txtname;
    @BindView(R.id.txtnum)
    EditText txtnum;
    @BindView(R.id.txtstreet)
    EditText txtstreet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useraddress);
    }
}
