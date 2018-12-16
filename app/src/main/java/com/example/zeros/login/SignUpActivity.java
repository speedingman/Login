package com.example.zeros.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {
    CheckBox allCB;
    CheckBox momeyCB;
    CheckBox agCB;
    Button nextBtn;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        bindViews();
        setupEvents();
        setValuse();
    }

    @Override
    public void setupEvents() {
        allCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    momeyCB.setChecked(true);
                    agCB.setChecked(true);
                }else{
                    momeyCB.setChecked(false);
                    agCB.setChecked(false);
                }
                
                
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(allCB.isChecked()&&momeyCB.isChecked()&&agCB.isChecked()){
                    Intent intent = new Intent(mContext,SignUpActivity2.class);
                    startActivity(intent);
                    Log.d("약관동의","모두동의함");
                }else {
                    Toast.makeText(mContext, "모두 동의하셔야 가입이 됩니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void bindViews() {
        allCB = findViewById(R.id.allCB);
        momeyCB = findViewById(R.id.momeyCB);
        agCB = findViewById(R.id.agCB);

        nextBtn = findViewById(R.id.nextBtn);

    }
}
