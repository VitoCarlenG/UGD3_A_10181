package com.databinding.gd3_a_10181.twoway;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.databinding.gd3_a_10181.MainActivity;
import com.databinding.gd3_a_10181.R;
import com.databinding.gd3_a_10181.databinding.InputdatapegawaiBinding;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InputDataPegawai extends AppCompatActivity {
    Pegawai pgwi;
    InputdatapegawaiBinding binding;

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.inputdatapegawai);

        pgwi = new Pegawai();
        binding.setPgwi(pgwi);
        binding.setActivity(this);

        dateFormatter=new SimpleDateFormat("dd-MM-yyyy", Locale.US);
    }

    public View.OnClickListener btnTanggalMasuk=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Calendar newCalendar=Calendar.getInstance();
            datePickerDialog=new DatePickerDialog(InputDataPegawai.this, new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate=Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);

                    pgwi.setTanggal_masuk(dateFormatter.format(newDate.getTime()));
                }
            },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

            datePickerDialog.show();
        }
    };

    public View.OnClickListener btnBackPegawai = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(InputDataPegawai.this, MainActivity.class);
            mainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnSavePegawai = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent DetailPegawai = new Intent(InputDataPegawai.this, DetailDataPegawai.class);

            Gson gson=new Gson();
            String strPegawai=gson.toJson(pgwi);
            DetailPegawai.putExtra("objPgw", strPegawai);

            startActivity(DetailPegawai);
        }
    };
}
