package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    /* custom constructor
     ** @param context: the current context, used to inflate the layout file
     * @param objects: the list of Word objects to display in a list
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);

        mColorResourceId = colorResourceId;


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is already a view we can reuse, otherwise inflate the view to start
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LinearLayout textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView vocabularyImageView = listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            vocabularyImageView.setImageResource(currentWord.getImageResourceId());
            vocabularyImageView.setVisibility(View.VISIBLE);
        } else {
            vocabularyImageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
