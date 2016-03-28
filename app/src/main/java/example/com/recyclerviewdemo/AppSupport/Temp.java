package example.com.recyclerviewdemo.AppSupport;

import android.widget.EditText;

import example.com.recyclerviewdemo.R;

/**
 * Created by jarvis on 28-Mar-16
 * at  5:13 PM .
 */
public class Temp {

    public static int countOfEditText = 0;

    public static String[] castName = {"Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy",
            "Harry Potter", "Ron Weasely", "Hermione Granger", "Albus pacific Dumbuldore", "Draco Melfoy"};

    public static  String[] castNameDesc = {"the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy",
            "the boy who lived", "the king", "very good girl", "the principle", "bad boyyyyyyyyyy"};

    public static  int[] castImgs = {R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco,
            R.drawable.harry, R.drawable.ron, R.drawable.hermione, R.mipmap.ic_launcher, R.drawable.draco};


    public static void increaseFabButtonClicked(int valueOfEditText, EditText editText) {
        valueOfEditText = Integer.parseInt(editText.getText().toString());
            editText.setText(String.valueOf(valueOfEditText + 1));
    }


    public static void decreaseFabButtonClicked(int valueOfEditText, EditText editText) {
        valueOfEditText = Integer.parseInt(editText.getText().toString());
        if (valueOfEditText > 1) {
            editText.setText(String.valueOf(valueOfEditText - 1));
        }
    }
}
