package com.orhanbatu.javafoodproject;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orhanbatu.javafoodproject.databinding.LayoutRowBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {

    ArrayList<FoodModel> foodModelArrayList;

    public FoodAdapter(ArrayList<FoodModel> foodModelArrayList) {
        this.foodModelArrayList = foodModelArrayList;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutRowBinding layoutRowBinding = LayoutRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new FoodHolder(layoutRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        holder.layoutRowBinding.recyclerViewEmailText.setText(foodModelArrayList.get(position).userEmail);
        holder.layoutRowBinding.recyclerViewFoodText.setText("Food: " + foodModelArrayList.get(position).food);
        holder.layoutRowBinding.recyclerViewCountryText.setText("Country: " + foodModelArrayList.get(position).country);
        Picasso.get().load(foodModelArrayList.get(position).imageUrl).into(holder.layoutRowBinding.recyclerViewImageView);

    }

    @Override
    public int getItemCount() {
        return foodModelArrayList.size();
    }

    public class FoodHolder extends RecyclerView.ViewHolder {

        LayoutRowBinding layoutRowBinding;

        public FoodHolder(LayoutRowBinding layoutRowBinding) {
            super(layoutRowBinding.getRoot());
            this.layoutRowBinding = layoutRowBinding;
        }
    }
}
