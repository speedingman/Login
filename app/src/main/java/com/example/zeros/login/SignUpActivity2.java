package com.example.zeros.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity2 extends BaseActivity {

    EditText emailTxt;
    EditText pasTxt;
    Button comBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        bindViews();
        setupEvents();
        setValuse();
    }

    @Override
    public void setupEvents() {
        comBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!emailTxt.getText().toString().contains("@")){
                    Toast.makeText(mContext, "이메일 형식으로 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(pasTxt.getText().toString().length() < 8){
                    Toast.makeText(mContext, "8글자 이상ㅇ으로 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(mContext, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show();



                // 기존 모든 화면을 지우기


                Intent intent = new Intent(mContext, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void bindViews() {

        emailTxt = findViewById(R.id.emailTxt);
        pasTxt = findViewById(R.id.pasTxt);
        comBtn = findViewById(R.id.comBtn);


    }
}
