package com.kasimola.nswschoollist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputStream is = this.getResources().openRawResource(R.raw.schools);
        byte [] buffer;
        JSONObject entries;
        try {
            buffer = new byte[is.available()];
            while (is.read(buffer) != -1) ;
            String jsonText = new String(buffer);
            entries = new JSONObject(jsonText);
            JSONArray jArray = entries.getJSONArray("schools");
            ArrayList<School> schools = School.fromJson(jArray);
            final ListView listview = (ListView) findViewById(R.id.schoolsList);

            final SchoolsAdapter adapter = new SchoolsAdapter(this, schools);
            listview.setAdapter(adapter);

        }
        catch(IOException ex)
        {
            entries = null;
        }
        catch(JSONException jex)
        {
            entries = null;
        }

    }
}
