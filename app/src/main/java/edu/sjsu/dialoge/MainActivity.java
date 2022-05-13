package edu.sjsu.dialoge;

        import androidx.appcompat.app.AppCompatActivity;
        import android.app.AlertDialog;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Example message")
                .setPositiveButton("ok", null)
                .setNegativeButton("no", null)
                .show();

        Button positive = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "not showing", Toast.LENGTH_LONG).show();
            }
        });
    }
}


