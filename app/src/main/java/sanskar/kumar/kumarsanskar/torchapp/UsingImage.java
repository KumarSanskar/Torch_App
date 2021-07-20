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
                /*checks for if value of camera is false then executes a set of statements to
                perform an operation other wise another set to handle another operation
                 */
                if (camera == false) {
                    try {
                        String s1 = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(s1, true);
                        camera = true;
                        powerOn.setImageResource(R.drawable.poweroff);
                    } catch (CameraAccessException e) {

                    }
                } else {
                    try {
                        String s2 = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(s2, false);
                        camera = false;
                        powerOn.setImageResource(R.drawable.poweron);
                    } catch (CameraAccessException e) {

                    }
                }
            }
        });
    }
}