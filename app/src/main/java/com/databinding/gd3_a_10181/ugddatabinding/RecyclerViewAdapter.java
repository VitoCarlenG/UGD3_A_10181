package com.databinding.gd3_a_10181.ugddatabinding;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.databinding.gd3_a_10181.R;
import com.databinding.gd3_a_10181.databinding.ActivityRecyclerViewAdapterBinding;
import com.databinding.gd3_a_10181.databinding.ActivityTampilDataPesertaVaksinBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<DataPeserta> DataPesertaList;
    private Context context;
    ActivityRecyclerViewAdapterBinding binding;
    int images[];

    public RecyclerViewAdapter(Context context, ArrayList<DataPeserta> DataPesertaList, int image[]) {
        this.DataPesertaList=DataPesertaList;
        this.context=context;
        images=image;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        binding=ActivityRecyclerViewAdapterBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataPeserta dataPeserta=DataPesertaList.get(position);
        holder.binding.setDp(dataPeserta);
        holder.images.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ActivityRecyclerViewAdapterBinding binding;
        ImageView images;

        public ViewHolder(@NonNull ActivityRecyclerViewAdapterBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
            images=itemView.findViewById(R.id.glide);
        }
    }
}
