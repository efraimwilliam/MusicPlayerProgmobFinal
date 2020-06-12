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

public class MainActivity extends AppCompatActivity {
    private EditText username, password, email;
    private TextView info, registeracc;
    private Button login;
    private ProgressBar progressbar;
    public static final String EXTRA_MASSAGE="com.example.tugasprogob4.MASSAGE";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email= (EditText) findViewById(R.id.editUsername);
        password= (EditText) findViewById(R.id.editPassword);
        login= (Button) findViewById(R.id.ButtonLogin);
        info= (TextView) findViewById(R.id.TextViewInfo);
        progressbar = (ProgressBar) findViewById(R.id.progressBar2);
        registeracc = (TextView) findViewById(R.id.register);

        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
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

                //authentic user
                mAuth.signInWithEmailAndPassword(youremail, yourpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                        }else{
                            Toast.makeText(MainActivity.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressbar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
        registeracc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lamanregister(v);
            }
        });
    }

   // private void ceklogin (View v){
        /*Intent i= new Intent (this, MenuActivity.class);
        TextView msg= info;
        String massage= username.getText().toString();
        String massage1= password.getText().toString();

        if (massage.equals("admin") && massage1.equals("admin")){
            i.putExtra(EXTRA_MASSAGE, massage);
            startActivity(i);
        }else{
            msg.setText("Login Failed");
        } */


      /*  if(TextUtils.isEmpty(youremail)){
            email.setError("Email is required");
        }
        if (TextUtils.isEmpty(yourpassword)){
            password.setError("Password is required");
        }
        if(password.length() <6){
            password.setError("Password must more then 6 characters");
        }*/


    //}

    private void lamanregister (View v){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
    }
}
