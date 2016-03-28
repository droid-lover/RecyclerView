package example.com.recyclerviewdemo.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.mainActivityToolbar)
    Toolbar mainActivityToolbar;

    @Bind(R.id.staticRecyclerTextView)
    TextView staticRecyclerTextView;

    @Bind(R.id.dynamicRecyclerTextView)
    TextView dynamicRecyclerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mainActivityToolbar);
        getSupportActionBar().hide();

    }

    @OnClick(R.id.staticRecyclerTextView)
    public void staticRecyclerTextViewClicked() {

        Intent intent = new Intent(MainActivity.this, StaticRecyclerViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.dynamicRecyclerTextView)
    public void dynamicRecyclerTextViewClicked() {

        Intent intent = new Intent(MainActivity.this, DynamicRecyclerViewActivity.class);
        startActivity(intent);
    }
}
