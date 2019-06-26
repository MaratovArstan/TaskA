package com.geektech.taskappa2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private static final String RESULT_KEY = "key";
    EditText editTitle;
    EditText editDescription;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTitle = findViewById(R.id.editTitle);
        editDescription = findViewById(R.id.editDesc);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void onClickCancel(View view) {
        finish();
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
}
