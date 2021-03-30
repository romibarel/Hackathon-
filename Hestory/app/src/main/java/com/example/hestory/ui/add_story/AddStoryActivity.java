package com.example.hestory.ui.add_story;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.hestory.R;

public class AddStoryActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int RESULT_LOAD_IMAGE=1;
    private ImageView imageToUpload;
    private Button upload_story;
    private EditText name, date, short_desc,full_desc, contact_info, country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);
        upload_story= findViewById(R.id.upload_story);
        imageToUpload=findViewById(R.id.imagetoupload);
        name=findViewById(R.id.hero);
        date=findViewById(R.id.date_of_story);
        short_desc=findViewById(R.id.short_desc);
        full_desc=findViewById(R.id.full_desc);
        country=findViewById(R.id.country);
        contact_info=findViewById(R.id.contact);
        imageToUpload.setOnClickListener(this);
        upload_story.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imagetoupload:
                Intent galleryIntent= new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;
            case R.id.upload_story:
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RESULT_LOAD_IMAGE&&resultCode==RESULT_OK&& data!=null){
            Uri selected_image=data.getData();
            imageToUpload.setImageURI(selected_image);
        }
    }
}