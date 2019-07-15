package com.quannaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReviewActivity extends AppCompatActivity {
    private Button SendReview;
    String myString = "Your review has sent successfully";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        SendReview = (Button) findViewById(R.id.Send_review_button);

        SendReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(ReviewActivity.this, thirdActivity.class);
                startActivity(intent11);

                Toast.makeText(getApplicationContext(), myString, Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent1 = new Intent(this, thirdActivity.class);
                this.startActivity(intent1);
                return true;
            case R.id.nav_my_profile:
                Intent intent2 = new Intent(this, MyProfileActivity.class);
                this.startActivity(intent2);
                return true;
            case R.id.nav_my_history:
                Intent intent3 = new Intent(this, MyHistoryActivity.class);
                this.startActivity(intent3);
                return true;
            case R.id.nav_fit:
                Intent intent4 = new Intent(this, BestFitActivity.class);
                this.startActivity(intent4);
                return true;
            case R.id.nav_locatiom:
                Intent intent5 = new Intent(this, LocationActivity.class);
                this.startActivity(intent5);
                return true;
            case R.id.nav_device:
                Intent intent6 = new Intent(this, ConnectToDeviceActivity.class);
                this.startActivity(intent6);
                return true;
            case R.id.nav_logout:
                Intent intent7 = new Intent(this, MainActivity.class);
                this.startActivity(intent7);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }





    }






}
