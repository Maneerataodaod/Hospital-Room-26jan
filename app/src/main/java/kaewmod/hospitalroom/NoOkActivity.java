package kaewmod.hospitalroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NoOkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_ok);
    }

    public void clickLiveWell (View view) {
        MyAlert myAlert = new MyAlert();
        myAlert.myDialog(NoOkActivity.this, "How are you ?", "I'm fine :D");

    }
    public void clickSymptoms (View view) {
        startActivity(new Intent(NoOkActivity.this,SickActivity.class));

    }
}