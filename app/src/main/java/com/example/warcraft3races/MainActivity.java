package com.example.warcraft3races;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        private Spinner spinnerRace;
        private TextView RaceDescription;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            spinnerRace = findViewById(R.id.spinnerRace);
            RaceDescription = findViewById(R.id.RaceDescription);
        }


        public void showDescription(View view) {
            int position = spinnerRace.getSelectedItemPosition();
            String description = getRaceByPosition(position);
            RaceDescription.setText(description);

        }

        private String getRaceByPosition(int position){
            String[] descriptions = getResources().getStringArray(R.array.Description_of_race);
            return descriptions[position];
        }
}