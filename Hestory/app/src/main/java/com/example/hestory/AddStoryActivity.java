package com.example.hestory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hestory.ui.login.Story;
import com.example.hestory.ui.login.StoryAdapter;
import com.example.hestory.ui.login.StoryDecoration;

import java.util.ArrayList;
import java.util.List;

public class AddStoryActivity extends AppCompatActivity {
    private RecyclerView story_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);
        init();
    }
    private void init()
    {
        story_bar=findViewById(R.id.storiesBar);

        List<Story> stories = new ArrayList<>();
        stories.add(new Story(false));
        stories.add(new Story(false));
        stories.add(new Story(true));
        stories.add(new Story(false));
        stories.add(new Story(true));
        stories.add(new Story(false));


        StoryAdapter str_adpt= new StoryAdapter(stories, this);
        story_bar.setAdapter(str_adpt);
        story_bar.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        //space between stories icons
        story_bar.addItemDecoration(new StoryDecoration(10));
    }

}