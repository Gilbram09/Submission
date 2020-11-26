package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detailuniversitas extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailuniversitas);

        txtName = findViewById(R.id.textjudul);
        universitas universitas = getIntent().getParcelableExtra("universitas");
        txtName.setText(universitas.getName());

        txtDetail = findViewById(R.id.penjelasan);
        txtDetail.setText(universitas.getDetail());

        imgView = findViewById(R.id.Gambar);
        imgView.setImageResource(universitas.getPhoto());
    }
}
