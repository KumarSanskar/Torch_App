package sanskar.kumar.kumarsanskar.torchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button torchUsingImage,torchUsingButton,torchUsingToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        torchUsingImage = (Button)findViewById(R.id.button);
        torchUsingButton = (Button)findViewById(R.id.button2);
        torchUsingToggle = (Button)findViewById(R.id.button3);
        torchUsingImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,UsingImage.class);
                startActivity(intent1);
                finish();
            }
        });
        torchUsingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,UsingButton.class);
                startActivity(intent2);
                finish();
            }
        });
        torchUsingToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,UsingToggle.class);
                startActivity(intent3);
                finish();
            }
        });

    }
}