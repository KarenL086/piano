package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class pIntrumentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pintrumentos);
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

    public void SonarTambor(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.tambor);
        sonar(sonido);
    }

    public void SonarTrompeta(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.trompeta);
        sonar(sonido);
    }

    public void SonarFlauta(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.dulce);
        sonar(sonido);
    }

    public void SonarGuitarra(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.guitarra);
        sonar(sonido);
    }

    public void SonarViolin(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.violin);
        sonar(sonido);
    }

    public void SonarSaxo(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.saxofon);
        sonar(sonido);
    }

    public void SonarArpa(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.harpa);
        sonar(sonido);
    }


}





