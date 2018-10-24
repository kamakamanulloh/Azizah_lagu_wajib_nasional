package com.kamak.laguwajibnasional;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter_Lagu extends RecyclerView.Adapter<Adapter_Lagu.Holder> {
    public Adapter_Lagu(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Model_Lagu> getData_lagu() {
        return data_lagu;
    }

    public void setData_lagu(ArrayList<Model_Lagu> data_lagu) {
        this.data_lagu = new ArrayList<Model_Lagu>();
        notifyDataSetChanged();

    }

    private ArrayList<Model_Lagu> data_lagu;

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.l_video, viewGroup, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        Model_Lagu data_lagu=getData_lagu().get(i);
        Glide.with(context)
                .load(data_lagu.getVideo())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgItemPhoto);
        holder.tvItemName.setText(data_lagu.getJudul());
        holder.tvItemRemarks.setText(data_lagu.getPencipta());



    }

    @Override
    public int getItemCount() {
        return data_lagu.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_item_photo)
        ImageView imgItemPhoto;
        @BindView(R.id.tv_item_name)
        TextView tvItemName;
        @BindView(R.id.tv_item_remarks)
        TextView tvItemRemarks;
        @BindView(R.id.btn_set_favorite)
        Button btnSetFavorite;
        @BindView(R.id.card_view)
        CardView cardView;

        public Holder(@NonNull View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
