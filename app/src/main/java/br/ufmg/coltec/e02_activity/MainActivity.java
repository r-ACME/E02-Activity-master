package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.btn_login);
        TextView userInput = findViewById(R.id.UserInput);
        TextView passwordInput = findViewById(R.id.PasswordInput);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LOGIN", "Analizando credenciais");

                //Chamar classe para validar login
                Login login = new Login(userInput.getText().toString(),passwordInput.getText().toString());

                //Caso tenha validado positivamente
                if(login.validade()) {
                    Intent intent = new Intent(MainActivity.this, MainApp.class);

                    Bundle args = new Bundle();

                    args.putString("user", userInput.getText().toString());
                    args.putString("password", passwordInput.getText().toString());
                    intent.putExtras(args);

                    startActivity(intent);
                    Log.d("startIntent", "Criação do app");
                }
                //Caso tenha validado negativamente
                else {
                    Toast.makeText(MainActivity.this, "Login errado, favor verificar suas credenciais", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }


}