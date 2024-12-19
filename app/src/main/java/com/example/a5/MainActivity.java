package com.example.a5;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Generate 100 sample items
        List<OwnerContent> allContent = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            String ownerId = "owner" + (i % 10 + 1); // Create 10 owners (owner1 to owner10)
            String title = "Title " + i;
            String description = "Description for item " + i + ", owned by " + ownerId + ".";
            allContent.add(new OwnerContent(ownerId, title, description));
        }

        // Define current owner
        String currentOwnerId = "owner1";

        // Filter content for the current owner
        List<OwnerContent> filteredContent = new ArrayList<>();
        for (OwnerContent item : allContent) {
            if (item.getOwnerId().equals(currentOwnerId)) {
                filteredContent.add(item);
            }
        }

        // Set adapter with filtered content
        OwnerContentAdapter adapter = new OwnerContentAdapter(filteredContent);
        recyclerView.setAdapter(adapter);
    }
}
