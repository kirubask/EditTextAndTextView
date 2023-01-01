package com.example.edittextandtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        editText = findViewById(R.id.edit_Txt);
        btn = findViewById(R.id.click_Mee);
        textView = findViewById(R.id.text_View);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.click_Mee ){
                    Editable data = editText.getText();
                    String str = data.toString();
                    str.trim();
                    if (str.length() > 0){
                        textView.setText(str);
                        editText.setText("");
                    }
                }
            }
        });
    }
}