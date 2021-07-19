package sanskar.kumar.kumarsanskar.torchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.Button;

public class UsingButton extends AppCompatActivity {
    Button torchOn,torchOff;
    CameraManager cameraManager;
    private boolean camera = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_button);
    }
}