package jozkar.recycleviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        List<RowData> rowListItem;
        rowListItem = getBasicRowList();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(rowListItem, this);
        recyclerView.setAdapter(adapter);
    }




    private List<RowData> getBasicRowList() {

        List<RowData> currentItem = new ArrayList<RowData>();
        currentItem.add(new RowData(10,getString(R.string.content), R.mipmap.number));
        currentItem.add(new RowData(11,getString(R.string.search), R.mipmap.search));
        currentItem.add(new RowData(12,getString(R.string.action_settings), R.mipmap.settings));
        currentItem.add(new RowData(8,getString(R.string.action_favorite), R.mipmap.star_on));
        currentItem.add(new RowData(7, getString(R.string.info), R.mipmap.info));

        return currentItem;
    }
}
