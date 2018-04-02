package test.net.atshq.bechelor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CustomTextView tvBrackfast,tvLunch,tvDinner;

    static int b,l,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBrackfast=findViewById(R.id.tvBrackfastAdd);
        tvLunch = findViewById(R.id.tvLunchAdd);
        tvDinner = findViewById(R.id.tvDinerAdd);

        init();

    }

    private void init() {

        b=l=d=0;

        tvBrackfast.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target){
                    case LEFT:
                        b-=1;
                        if(b>=0){
                            tvBrackfast.setText(String.valueOf(b));
                        }else {
                            b=0;
                        }

                        break;
                    case RIGHT:
                        b+=1;
                        tvBrackfast.setText(String.valueOf(b));
                        break;
                     default: break;
                }
            }
        });
        tvLunch.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target){
                    case LEFT:
                        l-=1;
                        if(l>=0){
                            tvLunch.setText(String.valueOf(l));
                        }else {
                            l=0;
                        }

                        break;
                    case RIGHT:
                        l+=1;
                        tvLunch.setText(String.valueOf(l));
                        break;
                    default: break;
                }
            }
        });
        tvDinner.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target){
                    case LEFT:
                        d-=1;
                        if(d>=0){
                            tvDinner.setText(String.valueOf(d));
                        }else {
                            d=0;
                        }

                        break;
                    case RIGHT:
                        d+=1;
                        tvDinner.setText(String.valueOf(d));
                        break;
                    default: break;
                }
            }
        });
    }
}
