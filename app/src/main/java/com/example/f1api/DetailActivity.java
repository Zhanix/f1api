package com.example.f1api;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String POSISI = "posisi";
    public static final String POINT = "point";
    public static final String TIM = "tim";
    public static final String DESCTIM = "desctim";
    public static final String LOGO = "logo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.img_item_photo);
        String fotomhs = getIntent().getStringExtra(LOGO);
        Glide.with(this)
                .load(fotomhs)
                .apply(new RequestOptions().override(200, 200))
                .into(imageView);
        TextView txtposisi = findViewById(R.id.tv_item_name);
        String posisi = getIntent().getStringExtra(POSISI);
        txtposisi.setText(posisi);
        TextView txtpoint = findViewById(R.id.tv_item_from);
        String point = getIntent().getStringExtra(POINT);
        txtpoint.setText(point);
        TextView txttim = findViewById(R.id.tv_item_description);
        String tim = getIntent().getStringExtra(TIM);
        txttim.setText(tim);
        TextView txtdesctim = findViewById(R.id.tv_item_stadium);
        String desctim = getIntent().getStringExtra(DESCTIM);
        txtdesctim.setText(desctim);

    }
}