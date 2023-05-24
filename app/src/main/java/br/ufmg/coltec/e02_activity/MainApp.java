package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainApp extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("onCreate", "Criação da tela pós login");
        setContentView(R.layout.activity_main_app);

        Bundle login = this.getIntent().getExtras();
        String user = login.getString("user");
        String password = login.getString("password");

        TextView main_app = findViewById(R.id.txt_main_app);
        if(user.toString().compareTo("") == 0) {
            main_app.setText("Login feito sem usuário!");
        }
        else {
            main_app.setText("Login feito pelo usuário " + user);
        }

        Button back = findViewById(R.id.btn_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });
    }
}