package retrofit;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    //all endpoints




    @POST("add_health_data_post/")
    Call<String> sendData(@Body Data data);



}


