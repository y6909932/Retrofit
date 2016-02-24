package retrofit.aixuran.com.retrofit;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "http://litchiapi.jstv.com/api/GetFeeds?column=8&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";

    //http://www.jianshu.com/p/90b1f20b123d
    //http://wuxiaolong.me/2016/01/15/retrofit/
    //https://realm.io/cn/news/droidcon-jake-wharton-simple-http-retrofit-2/
    //http://blog.csdn.net/smzhangyang/article/details/47398635
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWeatherRxjava();
    }


    private void getWeatherRxjava() {
        ApiStores apiStores = ApiStores.retrofit.create(ApiStores.class);
        Observable<WeatherJson> observable = apiStores.getWeatherRxjava("101010100");
        observable.subscribeOn
                (Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(weatherJson -> weatherJson.getWeatherinfo().getCity())
                .subscribe(s -> Log.e("aa", s));
//        observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<WeatherJson>() {
//                    @Override
//                    public void onCompleted() {
//                        Log.e("wxl", "onCompleted");
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e("wxl", "e=" + e.getMessage());
//                    }
//
//                    @Override
//                    public void onNext(WeatherJson weatherJson) {
//                        Log.e("wxl", "getWeatherinfo=" + weatherJson.getWeatherinfo().getCity());
//                    }
//                });

    }
}
