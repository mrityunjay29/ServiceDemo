package mrityunjay.com.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by mrityunjay.mishra on 14-03-2016.
 */
public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("INTENT_SERVICE");
    }

    @Override
    protected void onHandleIntent(Intent intent) { //mrii: needs to be implemented else getting error
         Toast.makeText(this,"MyIntentService: onHandleEvent",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onCreate() {//mri: this was not mandatory
        Toast.makeText(this,"MyIntentService: onCreate",Toast.LENGTH_SHORT).show();
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) { //mri: this was not necessary
        Toast.makeText(this,"MyIntentService: onStartCommand",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() { //mri: this was not necessary
        Toast.makeText(this,"MyIntentService: onDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
