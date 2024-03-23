package com.example.wordcounter;// Import the necessary Android classes
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wordcounter.R;

public class MainActivity extends AppCompatActivity {

    // Declare the EditText and Button
    private EditText editText;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.main);
        checkButton = findViewById(R.id.main);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isEditTextEmpty()) {

                    Toast.makeText(MainActivity.this, "The text box is empty.", Toast.LENGTH_SHORT).show();
                } else {
                    // EditText is not empty, proceed with your logic
                    Toast.makeText(MainActivity.this, "The text box has text.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to check if the EditText is empty
    private boolean isEditTextEmpty() {
        String text = editText.getText().toString();
        return text.isEmpty(); // Returns true if empty, false otherwise
    }
}
