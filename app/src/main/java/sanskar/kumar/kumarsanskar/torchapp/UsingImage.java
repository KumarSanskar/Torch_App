package sanskar.kumar.kumarsanskar.torchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UsingImage extends AppCompatActivity {
    ImageButton powerOn;
    CameraManager cameraManager;
    private boolean camera = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_image);
        powerOn = (ImageButton)findViewById(R.id.imageButton);
        cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);
        powerOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}