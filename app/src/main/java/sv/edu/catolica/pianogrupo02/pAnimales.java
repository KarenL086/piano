package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pAnimales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panimales);
    }
    public void sonar (MediaPlayer sonido){
        if(sonido.isPlaying()){
            sonido.stop();
        }else{
            try {
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonarElefante(View view) {
        MediaPlayer s;
    }

    public void SonarAve(View view) {
        MediaPlayer s;
    }

    public void SonarMono(View view) {
        MediaPlayer s;
    }

    public void SonarSerpiente(View view) {
        MediaPlayer s;
    }
}