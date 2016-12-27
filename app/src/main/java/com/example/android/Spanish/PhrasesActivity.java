package com.example.android.Spanish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();

        //Add the new words with translations and images, if any.
        words.add(new Word("Where are you going?", "¿A donde vas?", R.raw.one));
        words.add(new Word("What is your name?", "¿Como te llamas?", R.raw.one));
        words.add(new Word("My name is...", "Me llamo...", R.raw.one));
        words.add(new Word("How are you feeling?", "¿Cuantos años tienes?", R.raw.one));
        words.add(new Word("I’m feeling good.", "Me siento bien.", R.raw.one));
        words.add(new Word("Are you coming?", "¿Vas a venir?", R.raw.one));
        words.add(new Word("Yes, I’m coming.", "Si, ahi voy.", R.raw.one));
        words.add(new Word("I’m coming.", "Ya voy", R.raw.one));
        words.add(new Word("Let’s go.", "Vamos.", R.raw.one));
        words.add(new Word("Come here.", "Ven aca.", R.raw.one));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

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

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceID());
                mMediaPlayer.start();
            }
        });
    }
}
