package com.weather.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String APP_ID = "89d966bb2aedd8e142d387dba8b1ee1f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double lat = 40.712774, lon = -74.006091;
        String units = "imperial";
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=Glasgow,uk&appid=f2acb1f2fb2b0c8b100e15a24daf0f17");

        TextView textView = (TextView) findViewById(R.id.textView);
        new GetWeatherTask(textView).execute(url);
    }
}
