/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView country = findViewById(R.id.country);

        // Set a click listener on that View
        country.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the family category
        TextView hip = findViewById(R.id.hip);

        // Set a click listener on that View
        hip.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}HipActivity.class);
                Intent hipIntent = new Intent(MainActivity.this, HipActivity.class);
                // Start the new activity
                startActivity(hipIntent);
            }
        });

        // Find the View that shows the colors category
        TextView blues = findViewById(R.id.blues);

        // Set a click listener on that View
        blues.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BluesActivity}
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);

                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView rock = findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });
    }
}


