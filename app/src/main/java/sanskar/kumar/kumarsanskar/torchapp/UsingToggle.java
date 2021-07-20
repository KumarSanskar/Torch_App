package sanskar.kumar.kumarsanskar.torchapp;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class UsingToggle extends AppCompatActivity {
    ToggleButton turnOn;
    CameraManager cameraManager;
    private boolean camera = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_toggle);
        turnOn = findViewById(R.id.toggleButton);
        cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);
        /*
        using setOnCheckedChangeListener() we bring into the use of Toggle button
         */
        turnOn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //if the value is 'isChecked' then certain statements are executed to enable flashlight
                if (isChecked) {
                    try {
                        String s1 = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(s1, true);
                        camera = true;
                    } catch (CameraAccessException e) {

                    }

                } else {
                    try {
                        String s2 = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(s2, false);
                        camera = false;
                    } catch (CameraAccessException e) {

                    }
                }
            }
        });

    }
}