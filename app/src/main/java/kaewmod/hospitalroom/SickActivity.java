package kaewmod.hospitalroom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SickActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView, imageView2, imageView3;
    private String resultString = null;
    private ArrayList<String> stringArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sick);

        stringArrayList = new ArrayList<String>();

        bindWidget();

        imgageController();

    }   // Main Method

    public void clickSaveSick(View view) {
        MyAlert myAlert = new MyAlert();
        myAlert.myDialog(SickActivity.this, "Title", resultString);
    }

    private void imgageController() {
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);

    }

    private void bindWidget() {
        imageView = (ImageView) findViewById(R.id.imageView3);
        imageView2 = (ImageView) findViewById(R.id.imageView7);
        imageView3 = (ImageView) findViewById(R.id.imageView8);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imageView3:
                stringArrayList.add(getResources().getString(R.string.Sick1));
                break;
            case R.id.imageView7:
                stringArrayList.add(getResources().getString(R.string.Sick2));
                break;
            case R.id.imageView8:
                stringArrayList.add(getResources().getString(R.string.Sick3));
                break;
        }

        resultString = stringArrayList.toString();
        Log.d("26janV1", "result ==> " + resultString);

    }   // onClick
}   // Main Class