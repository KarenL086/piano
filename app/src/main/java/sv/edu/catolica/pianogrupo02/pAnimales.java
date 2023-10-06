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

    public void SonarElefante(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.elefante);
        sonar(sonido);
    }

    public void SonarAve(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.ave);
        sonar(sonido);
    }

    public void SonarMono(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mono);
        sonar(sonido);
    }

    public void SonarSerpiente(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.cobra);
        sonar(sonido);
    }

    public void SonarLeon(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.leon);
        sonar(sonido);
    }

    public void SonarRana(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.frogs);
        sonar(sonido);
    }

    public void SonarAguila(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.aguila);
        sonar(sonido);
    }
}