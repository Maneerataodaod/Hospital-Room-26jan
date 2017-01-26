package kaewmod.hospitalroom;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class SickActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView, imageView2, imageView3,
            imageView4, imageView5, imageView6,
            imageView7, imageView8, imageView9;
    private Button button, button2, button3,
            button4, button5, button6,
            button7, button8, button9;
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
        myAlert.myDialog(SickActivity.this, "What are you sick ?", resultString);
    }

    private void imgageController() {
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

    }

    private void bindWidget() {
        imageView = (ImageView) findViewById(R.id.imageView3);
        imageView2 = (ImageView) findViewById(R.id.imageView7);
        imageView3 = (ImageView) findViewById(R.id.imageView8);
        imageView4 = (ImageView) findViewById(R.id.imageView9);
        imageView5 = (ImageView) findViewById(R.id.imageView10);
        imageView6 = (ImageView) findViewById(R.id.imageView11);
        imageView7 = (ImageView) findViewById(R.id.imageView12);
        imageView8 = (ImageView) findViewById(R.id.imageView13);
        imageView9 = (ImageView) findViewById(R.id.imageView14);
        button = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button6);
        button4 = (Button) findViewById(R.id.button7);
        button5 = (Button) findViewById(R.id.button8);
        button6 = (Button) findViewById(R.id.button9);
        button7 = (Button) findViewById(R.id.button12);
        button8 = (Button) findViewById(R.id.button13);
        button9 = (Button) findViewById(R.id.button14);

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
            case R.id.imageView9:
                stringArrayList.add(getResources().getString(R.string.Sick4));
                break;
            case R.id.imageView10:
                stringArrayList.add(getResources().getString(R.string.Sick5));
                break;
            case R.id.imageView11:
                stringArrayList.add(getResources().getString(R.string.Sick6));
                break;
            case R.id.imageView12:
                stringArrayList.add(getResources().getString(R.string.Sick77));
                break;
            case R.id.imageView13:
                stringArrayList.add(getResources().getString(R.string.Sick88));
                break;
            case R.id.imageView14:
                stringArrayList.add(getResources().getString(R.string.Sick99));
                break;
            case R.id.button4:
                stringArrayList.add(getResources().getString(R.string.Sick1));
                break;
            case R.id.button5:
                stringArrayList.add(getResources().getString(R.string.Sick2));
                break;
            case R.id.button6:
                stringArrayList.add(getResources().getString(R.string.Sick3));
                break;
            case R.id.button7:
                stringArrayList.add(getResources().getString(R.string.Sick4));
                break;
            case R.id.button8:
                stringArrayList.add(getResources().getString(R.string.Sick5));
                break;
            case R.id.button9:
                stringArrayList.add(getResources().getString(R.string.Sick6));
                break;
            case R.id.button12:
                stringArrayList.add(getResources().getString(R.string.Sick77));
                break;
            case R.id.button13:
                stringArrayList.add(getResources().getString(R.string.Sick88));
                break;
            case R.id.button14:
                stringArrayList.add(getResources().getString(R.string.Sick99));
                break;
        }

        resultString = stringArrayList.toString();
        Log.d("26janV1", "result ==> " + resultString);

    }   // onClick

}   // Main Class