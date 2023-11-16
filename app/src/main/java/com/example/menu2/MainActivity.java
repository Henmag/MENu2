package com.example.menu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_call:
                showMessage("Call selected");
                return true;
            case R.id.menu_camera:
                showMessage("Camera selected");
                return true;
            case R.id.menu_video:
                showMessage("Video selected");
                return true;
            case R.id.menu_email:
                showMessage("Email selected");
                return true;
            case R.id.menu_add:
                showMessage("Add selected");
                return true;
            case R.id.menu_copy:
                showMessage("Copy selected");
                return true;
            case R.id.menu_paste:
                showMessage("Paste selected");
                return true;
            case R.id.menu_help:
                showMessage("Help selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}