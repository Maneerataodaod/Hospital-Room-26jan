package kaewmod.hospitalroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Disleg2Activity extends AppCompatActivity {

    ImageView ImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disleg2);

        ImageView = (ImageView) findViewById(R.id.imageView40);
        PhotoViewAttacher photoView = new PhotoViewAttacher(ImageView);
        photoView.update();
    }
}
