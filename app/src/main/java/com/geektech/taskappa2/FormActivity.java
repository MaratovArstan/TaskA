package com.geektech.taskappa2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    public static final String RESULT_KEY = "key" ;
    EditText editTitle;
    EditText editDescription;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTitle = findViewById(R.id.editTitle);
        editDescription = findViewById(R.id.editDesc);



        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(FormActivity.this);

        String editTitlee= preferences.getString("Tittle_task"," ");
        editTitle.setText(editTitlee);
        String editDescriptionn = preferences.getString("Tittle_descc", " ");
        editDescription.setText(editDescriptionn);
        String editTitle2= preferences.getString("Title_task2"," ");
        editTitle.setText(editTitle2);
        String editDescription2 = preferences.getString("Description_task2", " ");
        editDescription.setText(editDescription2);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void onClickCancel(View view) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(FormActivity.this);
        SharedPreferences.Editor editor= preferences.edit();
        String t1tle = editTitle.getText().toString();
        String desccc = editDescription.getText().toString();
        Task task= new Task(t1tle, desccc);
        editor.putString("Title_task", t1tle);
        editor.putString("Title_descc", desccc);
        editor.apply();
        super.onBackPressed();
    }




    public void onClickSave(View view) {
        Intent intent = new Intent();
        String title = editTitle.getText().toString();
        String description = editDescription.getText().toString();
        Task task = new Task(title,description);
        intent.putExtra(RESULT_KEY,task);
        setResult(RESULT_OK,intent);
        Log.d("blabla",title + " "+ description);
        finish();
    }

    @Override
    public void onBackPressed() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(FormActivity.this);
        SharedPreferences.Editor editor= preferences.edit();
        String title2 = editTitle.getText().toString();
        String desc2 = editDescription.getText().toString();
        Task task= new Task(title2, desc2);
        editor.putString("Title_task2", title2);
        editor.putString("Description_task2", desc2);
        editor.apply();
        super.onBackPressed();
    }
}
