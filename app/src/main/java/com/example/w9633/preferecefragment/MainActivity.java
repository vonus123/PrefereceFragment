package com.example.w9633.preferecefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        getFragmentManager ( ).beginTransaction ( )
                .add ( R.id.framelayout, new SettingsFragment ( ) )
                .commit ( );
    }
}