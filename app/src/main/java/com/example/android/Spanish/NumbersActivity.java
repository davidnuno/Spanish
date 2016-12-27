package com.example.android.Spanish;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();

        //Add the new words with translations and images, if any.
        words.add(new Word("one", "uno", R.drawable.number_one, R.raw.one));
        words.add(new Word("two", "dos", R.drawable.number_two, R.raw.two));
        words.add(new Word("three", "tres", R.drawable.number_three, R.raw.three));
        words.add(new Word("four", "cuatro", R.drawable.number_four, R.raw.four));
        words.add(new Word("five", "cinco", R.drawable.number_five, R.raw.five));
        words.add(new Word("six", "seis", R.drawable.number_six, R.raw.six));
        words.add(new Word("seven", "siete", R.drawable.number_seven, R.raw.seven));
        words.add(new Word("eight", "ocho", R.drawable.number_eight, R.raw.eight));
        words.add(new Word("nine", "nueve", R.drawable.number_nine, R.raw.nine));
        words.add(new Word("ten", "diez", R.drawable.number_ten, R.raw.ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.one);

                mMediaPlayer.start();
            }
        });
    }
}
