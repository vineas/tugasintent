package com.example.alvienas30.intent;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openKontak = (Button) findViewById(R.id.openKontak);
        Button openBrowser = (Button) findViewById(R.id.openBrowser);

        openBrowser.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse ("https://google.com"));
                startActivity(intent);
            }
        });

        openKontak.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_PICK);
                intent.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, 0);
            }
        });

    }
}