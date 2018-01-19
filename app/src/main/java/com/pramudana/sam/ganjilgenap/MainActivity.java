package com.pramudana.sam.ganjilgenap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnCheck;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText)findViewById(R.id.etNumber);
        btnCheck = (Button)findViewById(R.id.btnCheck);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sNumber = etNumber.getText().toString();
                int iNumber = Integer.parseInt(sNumber);

                if (iNumber % 2 == 0){
                    txtHasil.setText("Genap");
                }else {
                    txtHasil.setText("Ganjil");
                }
            }
        });
    }
}
