package com.example.oksak.onsas_myself_java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import retrofit.RestAdapter;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Main2Fragment extends Fragment{
    private TextView textview;
    private Asy_pro Ap;
    public String str;
    RestAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main2, container, false);
        Ap = new Asy_pro();
        adapter = Ap.Asch_rest();
      //  str="Clouds";
        return v;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter.create(WeatherApi.class).get("weather", "1850147", "metric", "0869798082100b3e32ee11aa90070fc4")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Entity>() {
                    @Override
                    public void onCompleted() {
                        Log.d("MainActivity", "onCompleted()");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("MainActivity", "Error : " + e.toString());
                    }

                    @Override
                    public void onNext(Entity weather) {
                        Log.d("MainActivity", "onNext()");
                        if (weather != null) {
                            ((TextView)view.findViewById(R.id.text2)).setText(weather.weather.get(0).description);

                        }
                    }
                });
    }
}