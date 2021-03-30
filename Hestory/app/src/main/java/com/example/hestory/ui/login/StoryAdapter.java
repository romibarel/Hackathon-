package com.example.hestory.ui.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hestory.R;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.story_view_holder> {
    private List<Story> story_list;
    private Context context;

    public StoryAdapter(List<Story> story_list, Context context) {
        this.story_list = story_list;
        this.context = context;
    }

    @NonNull
    @Override
    public story_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.story, parent, false);
        story_view_holder viewHolder = new story_view_holder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull story_view_holder holder, int position) {
        //change the color of the background after story have been watched
        if(story_list.get(position).isSeen()){
        holder.storyOutLine.setCardBackgroundColor(context.getResources().getColor(R.color.grey));
    }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //viewholder
    public static class story_view_holder extends RecyclerView.ViewHolder
    {
        private CardView storyOutLine;
        public story_view_holder(@NonNull View itemView) {
            super(itemView);

            itemView.findViewById(R.id.Stroutline);
        }
    }
}
