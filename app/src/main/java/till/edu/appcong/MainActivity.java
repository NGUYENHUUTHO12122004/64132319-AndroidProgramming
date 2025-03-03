package till.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import till.edu.helloandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        };
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoA.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        int  tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        editTextKetQua.setText(strTong);
    }
}
