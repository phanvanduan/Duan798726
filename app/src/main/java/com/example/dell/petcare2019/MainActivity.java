package com.example.dell.petcare2019;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import javax.crypto.Mac;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    Button btnRegistration;
    EditText edtUser;
    EditText edtPassword;
    FirebaseAuth mAuth;
    Button btnExit;
    //Đây là của form đkí
    EditText edtTk;
    EditText edtMk;
    //khai báo dùng chung cho login vs registration
    String user;
    String password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth =FirebaseAuth.getInstance();

        AnhXa();
       /* btnSignIn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dangky();
            }
        });*/
       Registration();
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        Exit();

    }
private void Registration(){
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 final Dialog dialog=new Dialog(MainActivity.this);
                dialog.setTitle("Hộp thoại xử lý !");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.registration);
                edtTk   =   (EditText)dialog.findViewById(R.id.editTextTk);
                edtMk   =   (EditText)dialog.findViewById(R.id.editTextMk);
                Button btnDky    =   (Button)dialog.findViewById(R.id.buttonRegistration);
                Button btnHuy    =   (Button)dialog.findViewById(R.id.buttonCancel);
                btnDky.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dongy();
                        dialog.cancel();


                    }
                });
                btnHuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
    }

    private void Dongy(){
        user = edtTk .getText().toString();
         password =edtMk.getText().toString();
         //đổ vào vào user và pass của Login
         edtUser.setText(user);
         edtPassword.setText(password);
         //////////////
        mAuth.createUserWithEmailAndPassword(user, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Dang Ky thanh cong", Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(MainActivity.this, "loi dm !", Toast.LENGTH_SHORT).show();
                        }

                    }
                });


    }
    private void Login(){
         user = edtUser.getText().toString();
        password =edtPassword.getText().toString();
        if(TextUtils.isEmpty(user)||TextUtils.isEmpty(password)){
            Toast.makeText(this, "Fields are empty", Toast.LENGTH_SHORT).show();

        }
        else {
            mAuth.signInWithEmailAndPassword(user, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "good", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(MainActivity.this,MoiNguoi.class);
                                startActivity(intent);

                            }
                            else{
                                Toast.makeText(MainActivity.this, "Sign In problem", Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });
        }


    }
    private void Exit(){
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this,android.R.style.Theme_DeviceDefault_Dialog);
                builder.setTitle("Bạn có chắc muốn thoát khỏi app");
                builder.setMessage("hãy lựa chọn xác nhận bên dưới nghe em ?");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();

            }
        });

    }
    private void AnhXa(){
        btnlogin       =(Button) findViewById(R.id.buttonLogin);
        btnRegistration      =(Button)findViewById(R.id.buttonSignIn);
        edtUser        =(EditText)findViewById(R.id.editTextUser);
        edtPassword    =(EditText)findViewById(R.id.editTextPassword);
        btnExit        =(Button)findViewById(R.id.buttonExit);

    }


}
