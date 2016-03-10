package example.com.recyclerviewdemo.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import example.com.recyclerviewdemo.R;

/**
 * Created by jarvis on 10-Mar-16
 * at  5:31 PM .
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Model> characterList = new ArrayList<>();


    Context context;
    LayoutInflater layoutInflater;

    public RecyclerAdapter(Context context, List<Model> characterList) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.characterList = characterList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.d("onCreateViewHolder", "onCreateViewHolder");
        View v = layoutInflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        // Log.d("onBindViewHolder", "onBindViewHolder : " + position);
        holder.tv1.setText(characterList.get(position).getName());
        holder.tv2.setText(characterList.get(position).getNameDesc());
        holder.imageView.setImageResource(characterList.get(position).getImages());
        holder.imageView.setTag(holder);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hi user You Clicked : " + characterList.get(position).getName().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return characterList.size();
    }
}
