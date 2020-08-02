package com.example.asynctasktest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.asynctasktest.MainActivity.list;

public class MainActivity extends AppCompatActivity {
    public static List<JsonData> list=new ArrayList<>();
    private Async mAsync;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);

        mAsync=new Async();

    }

    public void getName(View view) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
            mAsync.execute();

        }
    }


    @SuppressLint("NewApi")
public class Async extends AsyncTask<Object, Integer, List<JsonData>
        > {



    @Override
    protected List<JsonData> doInBackground(Object... params) {
        String responseData = null;

        try{
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://github-trending-api.now.sh/repositories").get()
                    .build();
            Response response = client.newCall(request).execute();
            responseData = response.body().string();
            Gson gson = new Gson();
            list = gson.fromJson(responseData, new  TypeToken<ArrayList<JsonData>>(){}.getType());
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;

    }



@Override
    protected void onPostExecute(List<JsonData> list){

        super.onPostExecute(list);
      textView.setText(list.get(0).getName());
    Log.d("msg","log--->"+list.get(0).getName());

    }

}
}