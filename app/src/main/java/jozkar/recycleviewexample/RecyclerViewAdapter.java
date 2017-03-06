package jozkar.recycleviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Jozkar on 14.11.2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<RowData> itemList;
    private Context context;

    public RecyclerViewAdapter(List<RowData> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_row, null);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view, context);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.number.setImageResource(itemList.get(position).icon);
        holder.name.setText(itemList.get(position).name);
        holder.position = itemList.get(position).position;
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
