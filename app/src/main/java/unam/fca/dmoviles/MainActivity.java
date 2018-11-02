package unam.fca.dmoviles;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        final EditText et = findViewById(R.id.et);



        if (Intent.ACTION_SEND.equals(action) && type != null) {

            String extraText = intent.getStringExtra(Intent.EXTRA_TEXT);
            if (extraText != null) {
                et.setText(extraText);
            }

        }
    }
}
