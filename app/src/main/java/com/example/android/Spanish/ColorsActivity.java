package com.example.android.Spanish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();

        //Add the new words with translations and images, if any.
        words.add(new Word("red", "rojo", R.drawable.color_red, R.raw.one));
        words.add(new Word("dusty yellow", "amarillo polvoriento", R.drawable.color_dusty_yellow, R.raw.one));
        words.add(new Word("mustard yellow", "amarillo mostaza", R.drawable.color_mustard_yellow, R.raw.one));
        words.add(new Word("green", "verde", R.drawable.color_green, R.raw.one));
        words.add(new Word("brown", "cafe", R.drawable.color_brown, R.raw.one));
        words.add(new Word("gray", "gris", R.drawable.color_gray, R.raw.one));
        words.add(new Word("black", "negro", R.drawable.color_black, R.raw.one));
        words.add(new Word("white", "blanco", R.drawable.color_white, R.raw.one));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
