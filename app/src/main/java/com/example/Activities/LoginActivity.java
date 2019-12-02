package com.example.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phoenix_user.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mActivity_Title;
    ImageView mBack;
    Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mActivity_Title = findViewById(R.id.tv_activity_name);
        mLogin = findViewById(R.id.login_btn);
        mLogin.setOnClickListener(this);
        mBack = findViewById(R.id.iv_back);
        mBack.setVisibility(View.GONE);
        mActivity_Title.setText("Login");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_btn:{
                Intent login_intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(login_intent);
                break;
            }
        }
    }
}
