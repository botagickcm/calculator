package kz.joba.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnc,btnkosyveaku;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnc=findViewById(R.id.btnc);
        btnkosyveaku=findViewById(R.id.btnkosyveaku);

        txtview=findViewById(R.id.textview);

        View.OnClickListener buttonNumbersClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingysan=txtview.getText().toString();
                String basylganSan="";
                String result="";
                int id = view.getId();
                if (id==R.id.btn1) {
                    basylganSan="1";
                }else if (id==R.id.btn0) {
                    basylganSan = "0";
                }else if (id==R.id.btn2){
                    basylganSan="2";
                }else if (id==R.id.btn3){
                    basylganSan="3";
                }else if (id==R.id.btn4){
                    basylganSan="4";
                }else if (id==R.id.btn5){
                    basylganSan="5";
                }else if (id==R.id.btn6){
                    basylganSan="6";
                }else if (id==R.id.btn7){
                    basylganSan="7";
                }else if (id==R.id.btn8){
                    basylganSan= "8";
                }else if (id==R.id.btn9) {
                    basylganSan = "9";
                }


                if(!aldingysan.equals("0")) result =aldingysan+basylganSan;
                else result=basylganSan;
                txtview.setText(result);
            }
        };

        btn0.setOnClickListener(buttonNumbersClick);
        btn1.setOnClickListener(buttonNumbersClick);
        btn2.setOnClickListener(buttonNumbersClick);
        btn3.setOnClickListener(buttonNumbersClick);
        btn4.setOnClickListener(buttonNumbersClick);
        btn5.setOnClickListener(buttonNumbersClick);
        btn6.setOnClickListener(buttonNumbersClick);
        btn7.setOnClickListener(buttonNumbersClick);
        btn8.setOnClickListener(buttonNumbersClick);
        btn9.setOnClickListener(buttonNumbersClick);




        View.OnClickListener btncandplusminus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();

                if (id==R.id.btnc){
                        txtview.setText("0");
                }else if (id==R.id.btnkosyveaku){
                    String santxt=txtview.getText().toString();
                    int san=Integer.parseInt(santxt);

                    if (san>0) txtview.setText("-"+santxt);
                    else {
                        san=san*(-1);
                        txtview.setText(""+san);}

                }


            }
        };

        btnc.setOnClickListener(btncandplusminus);
        btnkosyveaku.setOnClickListener(btncandplusminus);







    }
}