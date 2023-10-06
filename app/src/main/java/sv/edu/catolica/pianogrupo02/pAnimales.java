package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

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

    public void SonarLeon(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.do1);
        sonar(sonido);
    }

    public void SonarSerpiente(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.re);
        sonar(sonido);
    }

    public void SonarMono(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mi);
        sonar(sonido);
    }

    public void SonarAve(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fa);
        sonar(sonido);
    }

    public void SonarElefante(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.la);
        sonar(sonido);
    }

    public void SonarAguila(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.si);
        sonar(sonido);
    }

    public void SonarHiena(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sol);
        sonar(sonido);
    }
}