package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int itemPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String textField = getIntent().getStringExtra("editText");
        itemPosition = getIntent().getIntExtra("position", 0);
        EditText text = (EditText) findViewById(R.id.etEditTodo);
        text.setText(textField);
        text.setSelection(text.getText().length());
    }

    public void onEditItemSave(View view) {
        EditText text = (EditText) findViewById(R.id.etEditTodo);
        String editedText = text.getText().toString();
        Intent data = new Intent();
        data.putExtra("editedText", editedText);
        data.putExtra("editedText", editedText);
        data.putExtra("position", itemPosition);
        setResult(RESULT_OK, data);
        finish();
    }
}
