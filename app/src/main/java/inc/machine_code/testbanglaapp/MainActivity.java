package inc.machine_code.testbanglaapp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.iv_show_bangla);
        this.setTitle("মার্টির প্ৰাণ");

//        Typeface typeface=Typeface.createFromAsset(getAssets(),"Bangla2.ttf");
//        textView.setTypeface(typeface);
        textView.setText("");
    }
}
