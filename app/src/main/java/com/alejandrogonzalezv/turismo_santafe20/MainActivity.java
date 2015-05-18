package com.alejandrogonzalezv.turismo_santafe20;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hoteles) {
            hoteles fragment = new hoteles();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
            return true;
        }
        if (id == R.id.bares) {
            bares fragment = new bares();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
