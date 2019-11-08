package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String uAccount = "";
    String uPassWord = "";
    EditText account;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = findViewById(R.id.editAccount);
        password = findViewById(R.id.editPassword);

    }

    public void BtnSignOnclick(View view) {
        uAccount = account.getText().toString();
        uPassWord = password.getText().toString();
        if (!uAccount.equals("") && !uPassWord.equals("")) {
            Toast.makeText(this, "已註冊", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "請輸入帳號及密碼", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnLogOnclick(View view) {
        Button btnlog = findViewById(R.id.BtnLogIn);
        Button btnsign = findViewById(R.id.BtnSignIn);
        String Account = account.getText().toString();
        String Password = password.getText().toString();
        if (btnlog.getText().equals("登入")) {
            if (!Account.equals("") && !Password.equals("")) {
                if (Account.equals(uAccount) && Password.equals(uPassWord)) {
                    Toast.makeText(this, "已登入", Toast.LENGTH_SHORT).show();
                    btnlog.setText("登出");
                    btnsign.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(this, "請檢查帳號及密碼", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "請輸入帳號及密碼", Toast.LENGTH_SHORT).show();
            }
        } else {
            btnlog.setText("登入");
            account.setText("");
            password.setText("");
            btnsign.setVisibility(View.VISIBLE);
        }

    }
}
