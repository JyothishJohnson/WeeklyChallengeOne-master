package com.slack.weeklychallengeone.Utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.slack.weeklychallengeone.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Model> mArrayList;

    public MyAdapter(ArrayList<Model> mArrayList) {
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        final boolean[] play = {false};
        holder.tv_name.setText(mArrayList.get(position).getName());
        holder.explained.setText(mArrayList.get(position).getActions());
        holder.lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!play[0]) {
                    holder.lottieAnimationView.setSpeed(1);
                    holder.lottieAnimationView.playAnimation();
                    play[0] =true;
                }
                else{
                    holder.lottieAnimationView.setSpeed(-1);
                    holder.lottieAnimationView.playAnimation();
                    play[0] =false;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,explained;
        private LottieAnimationView lottieAnimationView;
        MyViewHolder(View view) {
            super(view);
            explained = view.findViewById(R.id.explained);
            lottieAnimationView = view.findViewById(R.id.animation_viewList);
            tv_name = view.findViewById(R.id.tv_name);

        }
    }


}
