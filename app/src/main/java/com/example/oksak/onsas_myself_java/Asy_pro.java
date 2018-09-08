package com.example.oksak.onsas_myself_java;

        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;

        import com.google.gson.FieldNamingPolicy;
        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;
        import com.google.gson.internal.bind.DateTypeAdapter;

        import java.util.Date;
        import retrofit.RestAdapter;
        import retrofit.android.AndroidLog;
        import retrofit.converter.GsonConverter;
        import rx.Observer;
        import rx.android.schedulers.AndroidSchedulers;
        import rx.schedulers.Schedulers;


public class Asy_pro extends AppCompatActivity {
    public String str;

    private static final String TAG = Asy_pro.class.getSimpleName();

    public RestAdapter Asch_rest() {
        // JSONのパーサー
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new DateTypeAdapter())
                .create();

        // RestAdapterの生成
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://api.openweathermap.org")
                .setConverter(new GsonConverter(gson))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(new AndroidLog("=NETWORK="))
                .build();
        return adapter;
    }
}