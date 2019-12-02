package com.example.omninos.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phoenix_user.R;

public class VerificationActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mActivity_Title;
    ImageView mBack;
    Button mVerification;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        mActivity_Title = findViewById(R.id.tv_activity_name);
        mVerification = findViewById(R.id.varification_submit_btn);
        mVerification.setOnClickListener(this);
        mBack = findViewById(R.id.iv_back);
        mBack.setOnClickListener(this);
        mActivity_Title.setText("Verification");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.varification_submit_btn:{
                ShowCongratulationDialog();
                break;
            }
            case R.id.iv_back:{
                onBackPressed();
                break;
            }
        }

    }

    private void ShowCongratulationDialog() {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.congratulation);

        Button mDone = dialog.findViewById(R.id.cong_done_btn);
        dialog.setCanceledOnTouchOutside(false);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerificationActivity.this,HomeActivity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
