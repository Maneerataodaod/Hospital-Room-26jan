package kaewmod.hospitalroom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class NurseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurse);

    }
    public void clickNurseHead (View view) {
        startActivity(new Intent(NurseActivity.this,DiseaseheaderActivity.class));

    }
    public void clickNurseBody (View view) {
        startActivity(new Intent(NurseActivity.this,DiseasebodyActivity.class));

    }
    public void clickNurseLeg (View view) {
        startActivity(new Intent(NurseActivity.this,DiseaselegActivity.class));

    }
    public void clickNurseHomemenu (View view) {
        startActivity(new Intent(NurseActivity.this,MenuActivity.class));

    }

    //Font
    @Override
    protected void attachBaseContext(Context base){
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
}
