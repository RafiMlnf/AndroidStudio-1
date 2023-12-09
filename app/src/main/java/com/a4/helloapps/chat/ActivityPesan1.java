package com.a4.helloapps.chat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.a4.helloapps.R;

public class ActivityPesan1 extends AppCompatActivity {

    public static final String LOG_TAG = ActivityPesan1.class.getSimpleName();

    public static final String EXTRA_MESSAGE
            = "com.a4.helloapps.extra.MESSAGE";

    public static final int TEXT_REQUEST = 1;

    private EditText mMessageEditText;

    private TextView mReplyHeadTextView;

    private TextView mReplyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_pesan1 );

        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, ActivityPesan2.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {

            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra( ActivityPesan2.EXTRA_REPLY);

            mReplyTextView.setVisibility(View.VISIBLE);

            mReplyTextView.setText(reply);
            mReplyTextView.setVisibility(View.VISIBLE);

            }
        }
    }
}
