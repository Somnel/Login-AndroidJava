package com.example.login_androidjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText loginEmail;
    private EditText loginSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEmail = findViewById(R.id.loginEmail);
        loginSenha = findViewById(R.id.loginSenha);
        /*Button btnLogar = findViewById(R.id.btnLogar);
        btnLogar.setOnClickListener(v -> {
            String email = loginEmail.getText().toString();
            String senha = loginSenha.getText().toString();
            String msg = "Preencha todos os espaços corretamente";

            if(email.equals("teste@mail") && senha.equals("1234")) {
                msg = "Login correto";
            } else if(email.isEmpty() || senha.isEmpty()) {
                msg = "Preencha todos os campos";
            }

            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        });*/


    }

    public void logar(View v) {
        String email = loginEmail.getText().toString();
        String senha = loginSenha.getText().toString();
        String msg = "Preencha todos os espaços corretamente";

        if(email.equals("teste@mail") && senha.equals("1234")) {
            msg = "Login correto";
        } else if(email.isEmpty() || senha.isEmpty()) {
            msg = "Preencha todos os campos";
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}