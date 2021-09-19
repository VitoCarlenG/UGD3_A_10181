package com.databinding.gd3_a_10181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.databinding.gd3_a_10181.databinding.ActivityMainBinding;
import com.databinding.gd3_a_10181.oneway.TampilPegawai;
import com.databinding.gd3_a_10181.twoway.InputDataPegawai;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setActivity(this);
    }

    public View.OnClickListener btnOneWay=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent mainActivity=new Intent(MainActivity.this, TampilPegawai.class);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnTwoWay=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent mainActivity=new Intent(MainActivity.this, InputDataPegawai.class);
            startActivity(mainActivity);
        }
    };
}