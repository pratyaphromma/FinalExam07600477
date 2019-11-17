package th.ac.su.sc.finalexam07600477;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import th.ac.su.sc.finalexam07600477.DB.RegisUse;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button regisbutton = findViewById(R.id.register_button);
        regisbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fullnameEdittext = findViewById(R.id.full_name_edit_text);
                EditText userEdittext = findViewById(R.id.username_edit_text);
                EditText passwordEdittext = findViewById(R.id.password_edit_text);
                String fullname = fullnameEdittext.getText().toString();
                String user = userEdittext.getText().toString();
                String pass = passwordEdittext.getText().toString();
                if(fullname.isEmpty()|| user.isEmpty()|| pass.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"All fields are required",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RegisterActivity.this,"Register successfully",Toast.LENGTH_SHORT).show();
                    RegisUse regisUse = new RegisUse(0, fullname, user, pass);
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    intent.putExtra("type", 0);
                    startActivity(intent);
                }
            }
        });
    }
}
