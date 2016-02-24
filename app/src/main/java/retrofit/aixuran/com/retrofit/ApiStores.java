package retrofit.aixuran.com.retrofit;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by haihong on 2016/1/19.
 */
public interface ApiStores {
    @GET("adat/sk/{cityId}.html")
    Observable<WeatherJson> getWeatherRxjava(@Path("cityId") String cityId);

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://www.weather.com.cn/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
}
