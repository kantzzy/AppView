package br.com.etecia.appview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSomar;
    EditText txtNum1, txtNum2;
    TextView lblResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        btnSomar = (Button) findViewById(R.id.btnSomar);

        lblResposta = (TextView) findViewById(R.id.lblResult);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double resp = 0;

                String n1 = txtNum1.getText().toString();
                String n2 = txtNum2.getText().toString();

                resp = Double.parseDouble(n1)+Double.parseDouble(n2);

                lblResposta.setText(String.valueOf(resp));            }
        });
    }

}
