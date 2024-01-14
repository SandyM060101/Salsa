package com.example.uas_semester5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View; // Tambahkan import untuk View
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCalc = findViewById(R.id.img_calc);
        imgCalc.setOnClickListener(new View.OnClickListener() { // Perbaiki penulisan "view" menjadi "View"
            @Override
            public void onClick(View view) {
                // Panggil metode untuk beralih ke KalkulatorActivity
                openCalculatorActivity();
            }
        });

        ImageView imgCam = findViewById(R.id.img_camera);
        imgCam.setOnClickListener(new View.OnClickListener() { // Perbaiki penulisan "view" menjadi "View"
            @Override
            public void onClick(View view) {
                // Panggil metode untuk beralih ke KalkulatorActivity
                openCameraActivity();
            }
        });
    }

    private void openCalculatorActivity() {
        Intent intent = new Intent(this, KalkulatorActivity.class);
        startActivity(intent);
    }

    private void openCameraActivity() {
        Intent intent = new Intent(this, CameraMainActivity.class);
        startActivity(intent);
    }

}
