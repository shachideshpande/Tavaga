package com.jatinhariani.retro1;

/**
 * Created by jatin on 01/12/15.
 */

        import retrofit.Callback;
        import retrofit.http.GET;
        import retrofit.http.Query;

public interface IApiMethods {

    @GET("/get/curators.json")
    Curator getCurators(
            @Query("api_key") String key
    );
}

