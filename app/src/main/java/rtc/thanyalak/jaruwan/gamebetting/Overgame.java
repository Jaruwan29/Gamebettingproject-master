package rtc.thanyalak.jaruwan.gamebetting;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Overgame extends AppCompatActivity {

    //Explicit
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overgame);

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView11);

        //ImageView Controller

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Overgame.this,Question.class));
            }
        });

        //Bind Widget

        imageView = (ImageView) findViewById(R.id.imageView9);

        //ImageView Controller

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(Overgame.this,MainActivity.class));
            }
        });

        }
    }


