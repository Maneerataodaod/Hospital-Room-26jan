package kaewmod.hospitalroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Dishead5Activity extends AppCompatActivity {

    ImageView ImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishead5);

        ImageView = (ImageView) findViewById(R.id.imageView38);
        PhotoViewAttacher photoView = new PhotoViewAttacher(ImageView);
        photoView.update();
    }
}
