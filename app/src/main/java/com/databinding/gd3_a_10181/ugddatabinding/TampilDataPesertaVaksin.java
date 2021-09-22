package com.databinding.gd3_a_10181.ugddatabinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.databinding.gd3_a_10181.R;
import com.databinding.gd3_a_10181.databinding.ActivityRecyclerViewAdapterBinding;

import java.util.ArrayList;
import java.util.List;

public class TampilDataPesertaVaksin extends AppCompatActivity {
    private ArrayList<DataPeserta> DataPesertaList;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ActivityRecyclerViewAdapterBinding binding;
    int image[]={R.drawable.squidward, R.drawable.plankton, R.drawable.larry, R.drawable.poseidon, R.drawable.crab, R.drawable.patrick, R.drawable.sandy, R.drawable.spongebob};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataPesertaList=new DaftarPesertaVaksin().DataPeserta;
        setContentView(R.layout.activity_tampil_data_peserta_vaksin);
        recyclerView=findViewById(R.id.rv_adapter);
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), DataPesertaList, image);
        layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
