package com.jonplonk.obfuscated;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Welcome extends ActionBarActivity {

    Button welcome_go;
    Button welcome_how;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcome_go = (Button) findViewById(R.id.go_button);
        welcome_how = (Button) findViewById(R.id.tutorial_button);

        welcome_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pickDifficulty = new Intent(Welcome.this, SelectDifficulty.class);
                startActivity(pickDifficulty);
            }
        });

        welcome_how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTutorial = new Intent(Welcome.this, HowToPlay.class);
                startActivity(goToTutorial);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
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
}
