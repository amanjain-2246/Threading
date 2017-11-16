package com.example.amanj.threading;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by amanj on 9/13/2017.
 */

public class AsyncClass extends AsyncTask<String,Integer,String> {
    ProgressBar progressBar;
    TextView text;
    public AsyncClass(ProgressBar progressBar,TextView text) {
       this.progressBar=progressBar;
        this.text=text;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        Log.i("SDFsd", "onProgressUpdate: " + values[0]);
        text.setText(values[0]+"%completed");
        progressBar.setProgress(values[0]);


    }

    @Override
    protected String doInBackground(String... params) {
        for(int i=0;i<=100;i++) {

            try
            {
            Thread.sleep(100);
                publishProgress(i);
            }catch (Exception e)
            {
                e.printStackTrace();
            }


        }
        return null;
    }
}
