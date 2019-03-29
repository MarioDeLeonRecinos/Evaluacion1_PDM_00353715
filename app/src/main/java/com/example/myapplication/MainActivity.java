package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.utils.Inventario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout1, linearLayout2,linearLayout3,linearLayout4, linearLayout5,linearLayout6,linearLayout7, linearLayout8,linearLayout9;

    private int anInt1,anInt2,anInt3,anInt4,anInt5,anInt6,anInt7,anInt8,anInt9;

    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;

    private Button btn;

    private EditText user,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anInt9= anInt8= anInt7= anInt6= anInt5= anInt4= anInt3= anInt2= anInt1=0;

        user = findViewById(R.id.user);
        email=findViewById(R.id.user_email);
        btn = findViewById(R.id.share);

        textView1=findViewById(R.id.num1);
        textView2=findViewById(R.id.num2);
        textView3=findViewById(R.id.num3);

        textView4=findViewById(R.id.num4);
        textView5=findViewById(R.id.num5);
        textView6=findViewById(R.id.num6);

        textView7=findViewById(R.id.num7);
        textView8=findViewById(R.id.num8);
        textView9=findViewById(R.id.num9);

        linearLayout1 = findViewById(R.id.Producto1);
        linearLayout2 = findViewById(R.id.Producto2);
        linearLayout3 = findViewById(R.id.Producto3);

        linearLayout4 = findViewById(R.id.Producto4);
        linearLayout5 = findViewById(R.id.Producto5);
        linearLayout6 = findViewById(R.id.Producto6);

        linearLayout7 = findViewById(R.id.Producto7);
        linearLayout8 = findViewById(R.id.Producto8);
        linearLayout9 = findViewById(R.id.Producto9);

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);

        linearLayout4.setOnClickListener(this);
        linearLayout5.setOnClickListener(this);
        linearLayout6.setOnClickListener(this);

        linearLayout7.setOnClickListener(this);
        linearLayout8.setOnClickListener(this);
        linearLayout9.setOnClickListener(this);

        btn.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,Share.class);

            mIntent.putExtra(Inventario.user,user.getText().toString());
            mIntent.putExtra(Inventario.user_email,email.getText().toString());

            mIntent.putExtra(Inventario.pd1,textView1.getText().toString());
            mIntent.putExtra(Inventario.pd2,textView2.getText().toString());
            mIntent.putExtra(Inventario.pd3,textView3.getText().toString());

            mIntent.putExtra(Inventario.pd4,textView4.getText().toString());
            mIntent.putExtra(Inventario.pd5,textView5.getText().toString());
            mIntent.putExtra(Inventario.pd6,textView6.getText().toString());

            mIntent.putExtra(Inventario.pd7,textView7.getText().toString());
            mIntent.putExtra(Inventario.pd8,textView8.getText().toString());
            mIntent.putExtra(Inventario.pd9,textView9.getText().toString());

            startActivity(mIntent);
        });
    }

    @Override
    public void onClick(View v) {
        String num;
        switch (v.getId()){
            case R.id.Producto1:
                anInt1+=1;
                num= Integer.toString(anInt1);
                textView1.setText(num);
                break;
            case R.id.Producto2:
                anInt2+=1;
                num= Integer.toString(anInt2);
                textView2.setText(num);
                break;
            case R.id.Producto3:
                anInt3+=1;
                num= Integer.toString(anInt3);
                textView3.setText(num);
                break;
            case R.id.Producto4:
                anInt4+=1;
                num= Integer.toString(anInt4);
                textView4.setText(num);
                break;
            case R.id.Producto5:
                anInt5+=1;
                num= Integer.toString(anInt5);
                textView5.setText(num);
                break;
            case R.id.Producto6:
                anInt6+=1;
                num= Integer.toString(anInt6);
                textView6.setText(num);
                break;
            case R.id.Producto7:
                anInt7+=1;
                num= Integer.toString(anInt7);
                textView7.setText(num);
                break;
            case R.id.Producto8:
                anInt8+=1;
                num= Integer.toString(anInt8);
                textView8.setText(num);
                break;
            case R.id.Producto9:
                anInt9+=1;
                num= Integer.toString(anInt9);
                textView9.setText(num);
                break;

        }
    }
}
