package com.kasimola.nswschoollist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SchoolsAdapter extends ArrayAdapter<School> {
    public SchoolsAdapter(Context context, ArrayList<School> schools) {
        super(context, 0, schools);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        School school = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_school_item, parent, false);
        }
        // Lookup view for data population
        TextView name = (TextView) convertView.findViewById(R.id.schoolName);
        TextView suburb = (TextView) convertView.findViewById(R.id.suburb);
        // Populate the data into the template view using the data object
        name.setText(school.getSchoolName());
        suburb.setText(school.getStreet());
        // Return the completed view to render on screen
        return convertView;
    }
}
