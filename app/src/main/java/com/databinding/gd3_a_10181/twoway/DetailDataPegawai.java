package com.databinding.gd3_a_10181.twoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.databinding.gd3_a_10181.R;
import com.databinding.gd3_a_10181.databinding.TwoWayBinding;
import com.google.gson.Gson;

public class DetailDataPegawai extends AppCompatActivity {
    Pegawai pgwi;
    TwoWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.two_way);

        String strPegawai=getIntent().getStringExtra("objPgw");
        Gson gson = new Gson();
        pgwi=gson.fromJson(strPegawai, Pegawai.class);

        binding.setPgwi(pgwi);
        binding.setActivity(this);
    }

    public View.OnClickListener btnBackClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent mainActivity=new Intent(DetailDataPegawai.this, InputDataPegawai.class);
            mainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainActivity);
        }
    };
}
