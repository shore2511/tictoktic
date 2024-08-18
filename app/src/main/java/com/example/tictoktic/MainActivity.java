package com.example.tictoktic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btm11,btm12,btm13,btm21,btm22,btm23,btm31,btm32,btm33;
    String b11,b12,b13,b21,b22,b23,b31,b32,b33;
    int flag= 0;
    int count= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        btm11= findViewById(R.id.btm11);
        btm12= findViewById(R.id.btm12);
        btm13= findViewById(R.id.btm13);
        btm21= findViewById(R.id.btm21);
        btm22= findViewById(R.id.btm22);
        btm23= findViewById(R.id.btm23);
        btm31= findViewById(R.id.btm31);
        btm32= findViewById(R.id.btm32);
        btm33= findViewById(R.id.btm33);
    }
    public void Check(View view){
        Button btmCurrent = (Button) view;
        if(btmCurrent.getText().toString().equals("")) {


            count++;
            if (flag == 0) {
                btmCurrent.setText("X");
                flag = 1;
            } else {
                btmCurrent.setText("0");
                flag = 0;

            }
            if (count > 4) {
                b11 = btm11.getText().toString();
                b12 = btm12.getText().toString();
                b13 = btm13.getText().toString();
                b21 = btm21.getText().toString();
                b22 = btm22.getText().toString();
                b23 = btm23.getText().toString();
                b31 = btm31.getText().toString();
                b32 = btm32.getText().toString();
                b33 = btm33.getText().toString();


                //condition

                if (b11.equals(b12) && b12.equals(b13) && !b11.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is :" + b11, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b21.equals(b22) && b22.equals(b23) && !b21.equals("")) {
                    //2
                    Toast.makeText(this, "Winnner is : " + b21, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b31.equals(b32) && b32.equals(b33) && !b31.equals("")) {
                    //3
                    Toast.makeText(this, "Winnner is : " + b31, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b11.equals(b21) && b21.equals(b31) && !b31.equals("")) {
                    //4
                    Toast.makeText(this, "Winnner is : " + b11, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b12.equals(b22) && b22.equals(b32) && !b12.equals("")) {
                    //5
                    Toast.makeText(this, "Winnner is : " + b12, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b13.equals(b23) && b23.equals(b33) && !b13.equals("")) {
                    //6
                    Toast.makeText(this, "Winnner is : " + b13, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b11.equals(b22) && b22.equals(b33) && !b11.equals("")) {
                    //7
                    Toast.makeText(this, "Winnner is : " + b11, Toast.LENGTH_SHORT).show();
                    NewGame();

                } else if (b13.equals(b22) && b22.equals(b31) && !b13.equals("")) {
                    //8
                    Toast.makeText(this, "Winnner is : " + b13, Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (count==9) {
                    Toast.makeText(this, "Match is Drawn", Toast.LENGTH_SHORT).show();
                    NewGame();

                }
            }
        }



    }
    public void NewGame(){
        btm11.setText("");
        btm12.setText("");
        btm13.setText("");
        btm21.setText("");
        btm22.setText("");
        btm23.setText("");
        btm31.setText("");
        btm32.setText("");
        btm33.setText("");
        count=0;
        flag= 0;
    }

}