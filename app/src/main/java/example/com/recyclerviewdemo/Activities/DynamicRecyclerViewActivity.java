package example.com.recyclerviewdemo.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.recyclerviewdemo.Adapters.DynamicRecyclerAdapter;
import example.com.recyclerviewdemo.Adapters.Model;
import example.com.recyclerviewdemo.AppSupport.Temp;
import example.com.recyclerviewdemo.R;

public class DynamicRecyclerViewActivity extends AppCompatActivity {

    @Bind(R.id.dynamicActivityToolbar)
    Toolbar dynamicActivityToolbar;

    @Bind(R.id.dynamicRecyclerView)
    RecyclerView dynamicRecyclerView;


    @Bind(R.id.decreaseFab)
    FloatingActionButton decreaseFab;

    @Bind(R.id.increaseFab)
    FloatingActionButton increaseFab;

    @Bind(R.id.countEditText)
    EditText countEdittext;

    int countEditTextValue = 0;


    DynamicRecyclerAdapter dynamicRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_recycler_view);
        ButterKnife.bind(this);
        setSupportActionBar(dynamicActivityToolbar);

        List<Model> characterList = new ArrayList<>();

        for (int i = 0; i < Temp.castName.length; i++) {
            Model model = new Model(Temp.castName[i], Temp.castNameDesc[i], Temp.castImgs[i]);
            characterList.add(model);
        }


        dynamicRecyclerAdapter = new DynamicRecyclerAdapter(DynamicRecyclerViewActivity.this, characterList, Temp.countOfEditText);

        dynamicRecyclerView.setAdapter(dynamicRecyclerAdapter);
        dynamicRecyclerView.setHasFixedSize(true);

        dynamicRecyclerView.setLayoutManager(new LinearLayoutManager(DynamicRecyclerViewActivity.this));
           /*for animation*/
        dynamicRecyclerView.setItemAnimator(new DefaultItemAnimator());


    }

    @OnClick(R.id.increaseFab)
    public void increaseFabClicked() {

        countEditTextValue = Integer.parseInt(countEdittext.getText().toString());
        countEditTextValue = countEditTextValue + 1;
        countEdittext.setText(String.valueOf(countEditTextValue));
        Temp.countOfEditText = countEditTextValue;
        dynamicRecyclerAdapter.notifyDataSetChanged();

    }

    @OnClick(R.id.decreaseFab)
    public void decreaseFabClicked() {
        countEditTextValue = Integer.parseInt(countEdittext.getText().toString());

        if (countEditTextValue > 0) {
            countEditTextValue = countEditTextValue - 1;
            countEdittext.setText(String.valueOf(countEditTextValue));
            Temp.countOfEditText = countEditTextValue;
            dynamicRecyclerAdapter.notifyDataSetChanged();
        }
    }


}
