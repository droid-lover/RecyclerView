package example.com.recyclerviewdemo.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import example.com.recyclerviewdemo.AppSupport.Temp;
import example.com.recyclerviewdemo.R;

/**
 * Created by jarvis on 10-Mar-16
 * at  5:31 PM .
 */
public class DynamicRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {


    Context context;
    LayoutInflater layoutInflater;

    int valueOfAdult;

    public DynamicRecyclerAdapter(Context context, List<Model> characterList ,int valueOfAdult) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.valueOfAdult = valueOfAdult;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Log.d("onBindViewHolder", "onBindViewHolder : " + position);

    }

    @Override
    public int getItemCount() {

        return Temp.countOfEditText;

    }


}


