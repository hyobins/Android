package Week1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.swe_project.R;

public class ImgChangeActivity extends AppCompatActivity {
    Button button;
    ImageView img1, img2;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_change);

        //버튼 클릭 이벤트 처리하기(기본)
        button = (Button) findViewById(R.id.chgButton); //버튼 아이디 xml 에서 가져오기
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                //버튼 눌렀을때 처리할 이벤트
                if(flag==true){
                    img1.setImageResource(R.drawable.img2);
                    img2.setImageResource(R.drawable.img1);
                    flag = false;
                }
                else{

                    img1.setImageResource(R.drawable.img1);
                    img2.setImageResource(R.drawable.img2);
                    flag = true;
                }


            }
        });

    }




}