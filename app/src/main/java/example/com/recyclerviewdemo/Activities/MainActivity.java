package example.com.recyclerviewdemo.Activities;

/* this project is the property of jarvis*/

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
/* this project is the property of jarvis*/
import butterknife.Bind;
import butterknife.ButterKnife;
import example.com.recyclerviewdemo.Adapters.Model;
import example.com.recyclerviewdemo.Adapters.RecyclerAdapter;
import example.com.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    @Bind(R.id.mainCoordinatorLayout)
    CoordinatorLayout mainCoordinatorLayout;

    RecyclerAdapter myRecyclerAdapter;

    String[] castName = {"Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy"};

    String[] castNameDesc = {"the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy"};

    int[] castImgs = {R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is the example of RecyclerViewDemo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        List<Model> characterList = new ArrayList<>();

        for (int i = 0; i < castName.length; i++) {
            Model model = new Model(castName[i], castNameDesc[i], castImgs[i]);
            characterList.add(model);
        }


        myRecyclerAdapter = new RecyclerAdapter(MainActivity.this, characterList);

        myRecyclerView.setAdapter(myRecyclerAdapter);
        myRecyclerView.setHasFixedSize(true);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
           /*for animation*/
        myRecyclerView.setItemAnimator(new DefaultItemAnimator());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar.make(mainCoordinatorLayout, "Hi! my maker is Sachin", Snackbar.LENGTH_INDEFINITE).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
