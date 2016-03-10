package example.com.recyclerviewdemo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import example.com.recyclerviewdemo.R;

/**
 * Created by jarvis on 10-Mar-16
 * at  5:32 PM .
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.list_title)
    TextView tv1;
    @Bind(R.id.list_desc)
    TextView tv2;

    @Bind(R.id.list_img)
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}
