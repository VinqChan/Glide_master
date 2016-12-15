package app.com.glide_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imgGlideIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGlideIV = (ImageView) findViewById(R.id.imageview1);

        Glide.with(this)
                .load("http://nuuneoi.com/uploads/source/playstore/cover.jpg")
                .centerCrop()
                .into(imgGlideIV);
    }
}
