package com.example.sunshinebyme;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WeatherAdapter extends BaseAdapter {

    private List<Weather> list;
    private Context context;

    public WeatherAdapter(Context context){
        this.context = context;
        list = new ArrayList<>();
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root = LayoutInflater.from(context).inflate(R.layout.item_weather_forecast, null);
        TextView tvDay = root.findViewById(R.id.tvDay);
        TextView tvDate = root.findViewById(R.id.tvDate);
        TextView tvHigh = root.findViewById(R.id.tvHigh);
        TextView tvLess = root.findViewById(R.id.tvLess);
        ImageView imageView = root.findViewById(R.id.ivSunny);

        tvDate.setText(list.get(i).getDate());
        tvDay.setText(list.get(i).getForecast());
        tvHigh.setText(String.valueOf(list.get(i).getHighestTemp()));
        tvLess.setText(String.valueOf(list.get(i).getLowestTemp()));

        imageView.setImageResource(list.get(i).getRes());

        return root;
    }

    void setData(List<Weather> lst){
        list = lst;
        notifyDataSetChanged();
    }
}
