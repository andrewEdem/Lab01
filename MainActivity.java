package edu.calvin.akg8.lab01;

/*
* Lab01
* CS-262
* This activity implements a toast in an app
*
* @author: Andrew Gbeddy
* @version: fall 2016
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // implement the toast
        Toast.makeText(this, "akg8", Toast.LENGTH_LONG).show();
    }
}
