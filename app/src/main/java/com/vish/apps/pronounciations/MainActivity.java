package com.vish.apps.pronounciations;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech textToSpeech;
    TextView txtLogo, txtName;
    EditText edtType;
    FloatingActionButton fab;
    ListView listViewRecentWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                } else {
                    Toast.makeText(MainActivity.this, "Error Speech ..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // find views
        txtLogo = findViewById(R.id.main_txt_logo);
        txtName = findViewById(R.id.main_txt_name);
        edtType = findViewById(R.id.main_edt_type);
        fab = findViewById(R.id.fab_speak);
        //listViewRecentWord = findViewById(R.id.list_recent_words);
    }


    public void fabSpeakClicked(View view){
        String typedText = edtType.getText().toString();

        textToSpeech.speak(typedText, TextToSpeech.QUEUE_FLUSH, null);
    }

}
