package mrityunjay.com.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MAIN_TAG = "My Service";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // Log.i(MAIN_TAG, "in mains onCreate function");
        Toast.makeText(this,"Main Activity: In onCreate function",Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //mri:
    public void startMethod(View v)
    {
        //Log.i(MAIN_TAG,"in mains: startService function");
        Toast.makeText(this,"Main Activity: In startMethod function",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),MyIntentService.class);
        i.putExtra("message","this is msg from main activity");
        startService(i);
    }

    public void stopMethod(View v)
    {
       //Log.i(MAIN_TAG,"in mains , stopService function ");
        //Log.i(MAIN_TAG,"not implemented yet");
        Toast.makeText(this,"Main Activity: In stopMethod function",Toast.LENGTH_SHORT).show();
        Intent i = new Intent (this,MyService.class);
        stopService(i);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.i(MAIN_TAG,"in mains onCreateOptionsMenu function");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(MAIN_TAG,"in mains onOptionsItemSelected function");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
