package com.example.tugasprogmob4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText name, email, password, number;
    private Button register;
    private TextView login;
    private ProgressBar progressbar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText email= (EditText) findViewById(R.id.youremail);
        final EditText password= (EditText) findViewById(R.id.yourpassword);
        EditText number = (EditText) findViewById(R.id.phonenumber);
        Button register = (Button) findViewById(R.id.buttonregister);
        TextView login =  (TextView) findViewById(R.id.loginhere);
        final ProgressBar progressbar= (ProgressBar) findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();

        //jika user telah login
        if(mAuth.getCurrentUser() !=null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String youremail = email.getText().toString().trim();
                String yourpassword = password.getText().toString().trim();

                if(TextUtils.isEmpty(youremail)){
                    email.setError("Email is required");
                }
                if (TextUtils.isEmpty(yourpassword)){
                    password.setError("Password is required");
                }
                if(password.length() <6){
                    password.setError("Password must more then 6 characters");
                }

                progressbar.setVisibility(View.VISIBLE);

                //register using Firebase
                mAuth.createUserWithEmailAndPassword(youremail, yourpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "User Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }else{
                            Toast.makeText(RegisterActivity.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressbar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

    }
}
