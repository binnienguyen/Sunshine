package com.example.sunshinebyme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private ListView listView;
    private WeatherAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        listView = view.findViewById(R.id.listView);
        adapter = new WeatherAdapter(getContext());
        adapter.setData(getDummyWeathers());
        listView.setAdapter(adapter);
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

}
