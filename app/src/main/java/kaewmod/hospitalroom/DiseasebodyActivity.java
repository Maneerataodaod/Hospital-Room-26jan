package kaewmod.hospitalroom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DiseasebodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseasebody);


    }
    //Font
    @Override
    protected void attachBaseContext(Context base){
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }

    public void clickMenuNurseBody (View view) {
        startActivity(new Intent(DiseasebodyActivity.this, NurseActivity.class));
    }
    public void clickDisbody1 (View view) {
        startActivity(new Intent(DiseasebodyActivity.this,Dishead1Activity.class));

    }
    public void clickDisbody2 (View view) {
        startActivity(new Intent(DiseasebodyActivity.this,Dishead2Activity.class));

    }
    public void clickDisbody3 (View view) {
        startActivity(new Intent(DiseasebodyActivity.this,Dishead3Activity.class));
    }
    public void clickDisbody4 (View view) {
        startActivity(new Intent(DiseasebodyActivity.this,Dishead4Activity.class));

    }
    public void clickDisbody5 (View view) {
        startActivity(new Intent(DiseasebodyActivity.this,Dishead5Activity.class));

    }
}

