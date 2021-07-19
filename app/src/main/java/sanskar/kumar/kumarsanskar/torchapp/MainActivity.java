package sanskar.kumar.kumarsanskar.torchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}