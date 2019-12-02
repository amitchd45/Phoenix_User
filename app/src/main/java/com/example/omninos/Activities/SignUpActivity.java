package com.example.omninos.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phoenix_user.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mActivity_Title;
    ImageView mBack;
    Button mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mActivity_Title = findViewById(R.id.tv_activity_name);
        mSignUp = findViewById(R.id.signup_btn);
        mSignUp.setOnClickListener(this);
        mBack = findViewById(R.id.iv_back);
        mBack.setOnClickListener(this);
        mActivity_Title.setText("Sign Up");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signup_btn:{
                Intent signup_intent = new Intent(SignUpActivity.this,VerificationActivity.class);
                startActivity(signup_intent);
                break;
            }
            case R.id.iv_back:{
                onBackPressed();
                break;
            }
        }

    }
}
