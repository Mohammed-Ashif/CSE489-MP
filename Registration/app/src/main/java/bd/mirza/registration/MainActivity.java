package bd.mirza.registration;

import static android.widget.TextView.*;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.firstName);
        TextView txtLastName = findViewById(R.id.lastName);
        TextView txtEmail = findViewById(R.id.Email);

        EditText editFN = findViewById(R.id.editFN);
        EditText editLN = findViewById(R.id.editLN);
        EditText editEmail = findViewById(R.id.editEmail);

        txtFirstName.setText("First Name: " + editFN.getText().toString());
        txtLastName.setText("Last Name: " + editLN.getText().toString());
        txtEmail.setText("Email: " + editEmail.getText().toString());
    }
}