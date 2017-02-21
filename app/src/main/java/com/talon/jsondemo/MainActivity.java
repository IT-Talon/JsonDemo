package com.talon.jsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://118.178.224.151/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<TeamListModel> call = service.getData();
        call.enqueue(new Callback<TeamListModel>() {
            @Override
            public void onResponse(Call<TeamListModel> call, Response<TeamListModel> teamListModel) {
                tv.setText(teamListModel.body().getRows().get(0).getParamName());
            }

            @Override
            public void onFailure(Call<TeamListModel> call, Throwable t) {

            }
        });


    }

    public interface GitHubService {
        @GET("teammgmtback/app/params/findTeamParamList")
        Call<TeamListModel> getData();
    }
}
