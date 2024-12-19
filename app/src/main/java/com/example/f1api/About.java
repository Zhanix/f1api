package com.example.f1api;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView = findViewById(R.id.imageView);
        String url = "data:image/jpeg;base64,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";
        Glide.with(this)
                .load(url)
                .apply(new RequestOptions().override(290, 286))
                .into(imageView);
    }
}