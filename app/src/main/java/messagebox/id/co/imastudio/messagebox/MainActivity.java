package messagebox.id.co.imastudio.messagebox;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    Button btnKlik;
    Button btnKlik2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKlik2 = (Button)findViewById(R.id.btnToast);
        btnKlik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext (), "Ini Toast",
                        Toast.LENGTH_LONG).show();
                new AlertDialog.Builder(getApplicationContext());

            }
        });

        btnKlik = (Button)findViewById(R.id.btnKlikDisini);
        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                 Toast.makeText(getApplicationContext (), "Anda klik button ini",
//                 Toast.LENGTH_LONG).show();
//                new AlertDialog.Builder(getApplicationContext());

                AlertDialog.Builder builder =
                new AlertDialog.Builder(context);
                builder.setTitle("Ini Judul");
                builder.setMessage("Ini Message");

                builder.setNeutralButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();

            }
        });

    }
}
