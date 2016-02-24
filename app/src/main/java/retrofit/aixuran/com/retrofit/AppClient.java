package retrofit.aixuran.com.retrofit;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by haihong on 2016/1/19.
 */
public class AppClient {
    static Retrofit mRetrofit;

    public static Retrofit retrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl("http://www.weather.com.cn/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public interface ApiStores {
        @GET("adat/sk/{cityId}.html")
        Call<WeatherJson> getWeather(@Path("cityId") String cityId);
    }
}
