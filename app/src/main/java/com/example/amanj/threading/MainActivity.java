package com.example.amanj.threading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
    ProgressBar pr;
    TextView textview;
    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        for (int i=0;i<10;i++)
//        {
//            Log.i(TAG,"onCreate:"+i+Thread.currentThread().getName());
//        }
//
//       Thread m=new Thread(new Myclass());
//        m.start();
//    }
//
//}
//class Myclass implements Runnable{
//
//    @Override
//    public void run() {
//        for(int i=0;i<10;i++)
//        {
//            Log.i("Worker","onCreate:"+i+Thread.currentThread().getName());
//        }

        button=(Button)findViewById(R.id.btn);
        textview=(TextView)findViewById(R.id.textView);
        pr=(ProgressBar)findViewById(R.id.progressBar);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AsyncClass asyncCLass=new AsyncClass(pr,textview);
                asyncCLass.execute();
            }
        });
    }
}

