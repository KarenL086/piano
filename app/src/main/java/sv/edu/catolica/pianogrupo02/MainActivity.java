package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void SonarDo(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.do1);
        sonar(sonido);
    }

    public void SonarRe(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.re);
        sonar(sonido);
    }

    public void SonarMi(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mi);
        sonar(sonido);
    }

    public void SonarFa(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fa);
        sonar(sonido);
    }

    public void SonarLa(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.la);
        sonar(sonido);
    }

    public void SonarSi(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.si);
        sonar(sonido);
    }

    public void SonarSol(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sol);
        sonar(sonido);
    }
}