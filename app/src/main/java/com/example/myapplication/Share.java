package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.utils.Inventario;

import org.json.JSONException;
import org.json.JSONObject;

public class Share extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;

    private Button btn;

    private TextView user,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        user = findViewById(R.id.user2);
        email=findViewById(R.id.user_email2);

        btn=findViewById(R.id.share_more);

        textView1=findViewById(R.id.nm1);
        textView2=findViewById(R.id.nm2);
        textView3=findViewById(R.id.nm3);

        textView4=findViewById(R.id.nm4);
        textView5=findViewById(R.id.nm5);
        textView6=findViewById(R.id.nm6);

        textView7=findViewById(R.id.nm7);
        textView8=findViewById(R.id.nm8);
        textView9=findViewById(R.id.nm9);

        Intent mIntent = this.getIntent();

        if (mIntent!=null){
            user.setText(mIntent.getStringExtra(Inventario.user));
            email.setText(mIntent.getStringExtra(Inventario.user_email));
            textView1.setText(mIntent.getStringExtra(Inventario.pd1));
            textView2.setText(mIntent.getStringExtra(Inventario.pd2));
            textView3.setText(mIntent.getStringExtra(Inventario.pd3));
            textView4.setText(mIntent.getStringExtra(Inventario.pd4));
            textView5.setText(mIntent.getStringExtra(Inventario.pd5));
            textView6.setText(mIntent.getStringExtra(Inventario.pd6));
            textView7.setText(mIntent.getStringExtra(Inventario.pd7));
            textView8.setText(mIntent.getStringExtra(Inventario.pd8));
            textView9.setText(mIntent.getStringExtra(Inventario.pd9));
        }

        btn.setOnClickListener(v -> {
            Intent Send_Intent = new Intent();

            Send_Intent.setAction(Intent.ACTION_SEND);
            Send_Intent.setType("text/plain");
            try {
                JSONObject inventario=new JSONObject();
                inventario.put(Inventario.user,user.getText().toString());
                inventario.put(Inventario.user_email,email.getText().toString());

                inventario.put(Inventario.pd1,textView1.getText().toString());
                inventario.put(Inventario.pd2,textView2.getText().toString());
                inventario.put(Inventario.pd3,textView3.getText().toString());

                inventario.put(Inventario.pd4,textView4.getText().toString());
                inventario.put(Inventario.pd5,textView5.getText().toString());
                inventario.put(Inventario.pd6,textView6.getText().toString());

                inventario.put(Inventario.pd7,textView7.getText().toString());
                inventario.put(Inventario.pd8,textView8.getText().toString());
                inventario.put(Inventario.pd9,textView9.getText().toString());

                Send_Intent.putExtra(Intent.EXTRA_TEXT,user.getText().toString()+""+email.getText().toString());

            }catch (JSONException e){
                e.printStackTrace();
            }




            startActivity(Send_Intent);
        });

    }
}
