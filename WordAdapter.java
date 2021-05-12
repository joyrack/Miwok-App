package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private final int colorResourceId;
        
    public WordAdapter(Activity context, ArrayList<Word> Words, int color){
        super(context,0,Words);
        colorResourceId = color;    
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);  // in this line we are inflating/creating a new view of type "list_item"
        }
        
        if(currentWord.getImageResourceId() != -1) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }
        listItemView.setBackgroundResource(colorResourceId);   // adding appropriate color to our view

        TextView engTextView = listItemView.findViewById(R.id.list_item1);
        engTextView.setText(currentWord.getEngWord());

        TextView miwokTextView = listItemView.findViewById(R.id.list_item2);
        miwokTextView.setText(currentWord.getMiwokWord());

       // return super.getView(position, convertView, parent);
        return listItemView;
    }
}
