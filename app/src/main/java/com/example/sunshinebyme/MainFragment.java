package com.example.sunshinebyme;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private ListView listView;
    private WeatherAdapter adapter;
    private TextView tvResult;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        listView = view.findViewById(R.id.listView);
        tvResult = view.findViewById(R.id.tvResult);
        adapter = new WeatherAdapter(getContext());
        adapter.setData(getDummyWeathers());
        listView.setAdapter(adapter);

        new WeatherTask().execute();

        return view;
    }

    private List<Weather> getDummyWeathers() {
        List<Weather> weathers = new ArrayList<>();
        weathers.add(new Weather(R.drawable.ic_sunny_24dp, "Tomorrow", "Sunny", 32, 16));
        weathers.add(new Weather(R.drawable.ic_snow_24dp, "Monday", "Snowly", 22, 12));
        weathers.add(new Weather(R.drawable.ic_cloud_24dp, "Tuesday", "Cloudly", 23, 15));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Wednesday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_sunny_24dp, "Thursday", "Sunny", 36, 16));
        weathers.add(new Weather(R.drawable.ic_snow_24dp, "Friday", "Snowly", 22, 12));
        weathers.add(new Weather(R.drawable.ic_cloud_24dp, "Saturday", "Cloudly", 23, 15));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Sunday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_sunny_24dp, "Monday", "Sunny", 32, 16));
        weathers.add(new Weather(R.drawable.ic_snow_24dp, "Tuesday", "Snowly", 22, 12));
        weathers.add(new Weather(R.drawable.ic_cloud_24dp, "Wednesday", "Cloudly", 23, 15));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Thursday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_snow_24dp, "Friday", "Snowly", 22, 12));
        weathers.add(new Weather(R.drawable.ic_cloud_24dp, "Saturday", "Cloudly", 23, 15));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Sunday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_sunny_24dp, "Monday", "Sunny", 32, 16));
        weathers.add(new Weather(R.drawable.ic_snow_24dp, "Tuesday", "Snowly", 22, 12));
        weathers.add(new Weather(R.drawable.ic_cloud_24dp, "Wednesday", "Cloudly", 23, 15));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Thursday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Thursday", "Rainly", 26, 16));
        weathers.add(new Weather(R.drawable.ic_rain_24dp, "Thursday", "Rainly", 26, 16));
        return weathers;
    }

    class WeatherTask extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            String result = "";
            String baseURl = "https://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7&appid=f99f7329e28b995c7bfd1a33f191b59b";
            try {
                URL url = new URL(baseURl);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                InputStream inputStream = urlConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line = "";

                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            tvResult.setText(s);
        }
    }

}
