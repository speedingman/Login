package com.example.zeros.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    TextView signUpTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setupEvents();
        setValuse();


    }


    @Override
    public void setupEvents() {
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void bindViews() {

        signUpTxt = findViewById(R.id.signUpTxt);
    }
}
