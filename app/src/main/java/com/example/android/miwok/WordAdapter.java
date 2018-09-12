package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SON-OF-A3 on 10/8/2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> numbers) {

        super(context, 0, numbers);
    }
    public WordAdapter(Context context, ArrayList<Word> numbers, int colorResourceId) {
        super(context, 0, numbers);
        mColorResourceId = colorResourceId;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }


        // Get the data item for this position
        Word currentWord = getItem(position);

        // Lookup view for data population
        TextView englishWords = (TextView) convertView.findViewById(R.id.englishWords);
        TextView miwokWords = (TextView) convertView.findViewById(R.id.miwokWords);
        ImageView imageResource = (ImageView) convertView.findViewById(R.id.imageResource);



        View textContainer = convertView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);



        // Populate the data into the template view using the data object
        englishWords.setText(currentWord.getDefaultTranslation());
        //get the default translation of the word and set it on the default textView
        miwokWords.setText(currentWord.getMiwokTranslation());
        //get the miwok translation of the word and set it on the miwok textView

        //The following block of codes is used to check if an image is returned and set the visibility if an image is returned and set it to gone if not
        if (currentWord.hasImage()){
            imageResource.setImageResource(currentWord.getImageResourceId());
        }
        else{
            imageResource.setVisibility(View.GONE);
        }

        //get the image representation of the word and set it on the corresponding image view for the text

        return convertView;

    }
}