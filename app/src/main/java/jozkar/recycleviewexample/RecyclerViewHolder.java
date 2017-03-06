package jozkar.recycleviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jozkar on 14.11.2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView name;
    public ImageView number;
    public String id;
    int position;
    Context c;

	public RecyclerViewHolder(View itemView, Context context) {
        super(itemView);

        //implementing onClickListener
        itemView.setOnClickListener(this);
        name = (TextView)itemView.findViewById(R.id.name);
		number = (ImageView)itemView.findViewById(R.id.number);
        c = context;
    }

    @Override
    public void onClick(View view) {
        //Every time you click on the row toast is displayed

        Toast.makeText(c, name.getText(),Toast.LENGTH_LONG).show();


    }
}
