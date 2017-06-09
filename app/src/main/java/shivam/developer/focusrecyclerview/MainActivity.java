package shivam.developer.focusrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import shivam.developer.featuredrecyclerview.FeaturedRecyclerView;

public class MainActivity extends AppCompatActivity {

    List<String> dummyData = new ArrayList();
    FeaturedRecyclerView featuredRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDummyDataList();
        featuredRecyclerView = (FeaturedRecyclerView) findViewById(R.id.featured_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        featuredRecyclerView.setLayoutManager(layoutManager);
        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(dummyData);
        featuredRecyclerView.setAdapter(adapter);
    }

    private void createDummyDataList() {
        for (int i = 1; i <= 500; i++) {
            dummyData.add("Item " + i);
        }
    }
}
