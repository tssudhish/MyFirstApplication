package com.example.tssudhish.myfirstapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button pushButton;
    private TextInputEditText txtOutput;

    public boolean bButtonPushed=false;
    public int icount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pushButton = (Button) findViewById(R.id.push_button);
        txtOutput =(TextInputEditText) findViewById(R.id.show_text);

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void populateOutputText(View view) {
        if(!bButtonPushed){
            icount+=1;
            txtOutput.setText("You Pushed this Button for the first time");
            bButtonPushed=true;
        } else {
            icount+=1;
            txtOutput.setText("You Already Pushed for the " + icount + " time!") ;

            //Toast.makeText(MainActivity.this, "Pushed Button for" + icount, Toast.LENGTH_SHORT).show();
        }
    }
}
