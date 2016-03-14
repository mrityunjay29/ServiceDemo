package mrityunjay.com.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by mrityunjay.mishra on 14-03-2016.
 */
public class MyService extends Service {
    public static final String MYSERVICE_TAG ="My Service:";

    @Override
    public void onCreate() {
        super.onCreate();
        //Log.i(MYSERVICE_TAG, "on create method");
        Toast.makeText(this,"My Service: In onCreate function",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Log.i(MYSERVICE_TAG,"onStartCommand method");
        Toast.makeText(this,"My Service: In onStartCommand function",Toast.LENGTH_SHORT).show();


        //mri: just to check
       // stopSelf();

        String message = intent.getStringExtra("message");
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //Log.i(MYSERVICE_TAG,"onBind method");
        Toast.makeText(this,"My Service: In onBind function",Toast.LENGTH_SHORT).show();

        return null;
    }

    @Override
    public void onDestroy() {
        Log.i(MYSERVICE_TAG,"onDestroy method");
        Toast.makeText(this,"My Service: In onDestroy function",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
