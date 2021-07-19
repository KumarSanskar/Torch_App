package sanskar.kumar.kumarsanskar.torchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UsingButton extends AppCompatActivity {
    Button torchOn,torchOff;
    CameraManager cameraManager;
    private boolean camera = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_button);
        torchOn = (Button)findViewById(R.id.button4);
        torchOff = (Button)findViewById(R.id.button5);
        cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);

        torchOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = cameraManager.getCameraIdList()[0];//this is the id for using flashlight
                    cameraManager.setTorchMode(s1,true);//this turns the flashlight on
                }catch(CameraAccessException e){

                }
            }
        });
        torchOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s2 = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(s2,false);// this turns the flashlight off
                }catch(CameraAccessException e){

                }
            }
        });

    }
}