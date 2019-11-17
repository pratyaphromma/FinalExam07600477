package th.ac.su.sc.finalexam07600477;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logbutton = findViewById(R.id.login_button);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEdittext = findViewById(R.id.username_edit_text);
                EditText passwordEdittext = findViewById(R.id.password_edit_text);
                String user = userEdittext.getText().toString();
                String pass = passwordEdittext.getText().toString();
                if(user.isEmpty()|| pass.isEmpty()){
                    Toast.makeText(LoginActivity.this,"All fields are required",Toast.LENGTH_SHORT).show();
                }
                else{
                    
                    Toast.makeText(LoginActivity.this,"Welcome ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button rebutton =findViewById(R.id.register_button);
        rebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });
    }
}
