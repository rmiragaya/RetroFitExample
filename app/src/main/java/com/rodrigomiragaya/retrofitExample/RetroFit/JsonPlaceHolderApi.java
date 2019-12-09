package com.rodrigomiragaya.retrofitExample.RetroFit;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    @GET("posts")
                                //en la web "/posts?userId=1"
    Call<List<Post>> getPosts(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
        //en la web "/posts?userId=1"
    Call<List<Post>> getPosts( @QueryMap Map<String, String> parametros );

    @GET("comments")
                                //en la web "/comments?postId=1"
    Call<List<Comment>> getComments(@Query("postId") int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url);

}
