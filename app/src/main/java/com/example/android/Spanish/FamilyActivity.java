package com.example.android.Spanish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();

        //Add the new words with translations and images, if any.
        words.add(new Word("father", "papá", R.drawable.family_father, R.raw.one));
        words.add(new Word("mother", "mamá", R.drawable.family_mother, R.raw.one));
        words.add(new Word("son", "hijo", R.drawable.family_son, R.raw.one));
        words.add(new Word("daughter", "hija", R.drawable.family_daughter, R.raw.one));
        words.add(new Word("older brother", "hermano", R.drawable.family_older_brother, R.raw.one));
        words.add(new Word("younger brother", "hermanito", R.drawable.family_younger_brother, R.raw.one));
        words.add(new Word("older sister", "hermana", R.drawable.family_older_sister, R.raw.one));
        words.add(new Word("younger sister", "hermanita", R.drawable.family_younger_sister, R.raw.one));
        words.add(new Word("grandmother ", "abuela", R.drawable.family_grandmother, R.raw.one));
        words.add(new Word("grandfather", "abuelo", R.drawable.family_grandfather, R.raw.one));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                Word word = words.get(pos);

                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceID());
                mMediaPlayer.start();
            }
        });
    }
}
