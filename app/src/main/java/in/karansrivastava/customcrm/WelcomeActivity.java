package in.karansrivastava.customcrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    private Button mloginButton;
    private EditText mUsernameEditText, mPasswordEditText;
    private Spinner mRoleSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mloginButton = (Button) findViewById(R.id.btn_login);
        mUsernameEditText = (EditText) findViewById(R.id.et_username);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);

        // handle login btn click
        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkLoginCredentials()) {
                    // do correct intent;
                    Toast.makeText(WelcomeActivity.this,
                            getResources().getText(R.string.welcome_intent_succesfull),
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(WelcomeActivity.this,
                            getResources().getText(R.string.welcome_intent_unsucessfull),
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }

    private boolean checkLoginCredentials() {
        return (this.mUsernameEditText.getText().toString().equals("karan") &&
                this.mPasswordEditText.getText().toString().equals("123") &&
                this.mRoleSpinner.getSelectedItem().toString().equals("Admin"));

    }
}
