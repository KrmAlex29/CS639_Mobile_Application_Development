package com.example.intentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOError;
import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    Button sendSMS, sendPhoneCall, openBrowser, openMap,shareActivity,newActivity;

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appTitle(View view)
    {
        TextView textView = (TextView) findViewById(R.id.appTitle);
        final Intent intent = new Intent(Intent.ACTION_SEND);
        startActivity(Intent.createChooser(intent,"test"));
    }

    public void textSMS (View view)
    {
        sendSMS = (Button) findViewById(R.id.smsActivity);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto: " + Uri.encode("12123630830")));
        intent.putExtra("smsbody","Hello, Kareem");
        final Intent textIntent = new Intent(Intent.ACTION_SENDTO);
        startActivity(intent);
    }

   public void dialNumber (View view)
    {
        sendPhoneCall = (Button) findViewById(R.id.phoneActivity);
        final Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:2123630830"));
        startActivity(callIntent);
    }

    public void startBroswer(View view)
    {
        openBrowser =(Button) findViewById(R.id.webActivity);
        Intent intent = new Intent(this, newBrowser.class);
        final Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(websiteIntent);
    }

    public void startDestination (View view)
    {
        openMap = (Button) findViewById(R.id.mapActivity);
        String geoUri = String.format("geo:40.7112602, -74.0073645");
        Uri geo = Uri.parse(geoUri);
        Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
        startActivity(geoMap);

    }
    public void shareActivity(View view)
    {
        shareActivity = (Button) findViewById(R.id.shareActivity);
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "SMS");
        intent.putExtra(Intent.EXTRA_TEXT, "Send SMS");
        startActivity(intent);
    }

    public void newActivity (View view)
    {
        newActivity = (Button) findViewById(R.id.newActivity);
        final Intent intent = new Intent(Intent.ACTION_SEND);
        startActivity(intent);


        

    }


}
