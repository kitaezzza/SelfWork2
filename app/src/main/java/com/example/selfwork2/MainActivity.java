package com.example.selfwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText ans1;
    EditText ans2;
    EditText ans3;
    Button btn_Go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans1 = (EditText)findViewById(R.id.editAnswer1);
        ans2 = (EditText)findViewById(R.id.editAnswer2);
        ans3 = (EditText)findViewById(R.id.editAnswer3);
        btn_Go = (Button)findViewById(R.id.btn_Go);

        btn_Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Подтверждение ответа", Snackbar.LENGTH_LONG);
                GoActivity2();
            }
        });
    }

    private void GoActivity2()
    {
        Intent intent = new Intent (this, Activity2.class);
        intent.putExtra("Name", ans1.getText().toString());
        intent.putExtra("Group", ans2.getText().toString());
        intent.putExtra("Age", ans3.getText().toString());
        startActivity(intent);
    }
}