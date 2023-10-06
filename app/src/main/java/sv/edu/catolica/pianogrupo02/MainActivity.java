package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sonar (MediaPlayer sonido, String nota){
        if(sonido.isPlaying()){
            sonido.stop();
        }else{
            try {
                sonido.start();
                Toast.makeText(getApplicationContext(),"La nota es: "+nota, Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonarDo(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.do1);
        String n ="Do";
        sonar(sonido,n);
    }

    public void SonarRe(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.re);
        String n ="Re";
        sonar(sonido,n);
    }

    public void SonarMi(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mi);
        String n ="Mi";
        sonar(sonido,n);
    }

    public void SonarFa(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fa);
        String n ="Fa";
        sonar(sonido,n);
    }

    public void SonarLa(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.la);
        String n ="La";
        sonar(sonido,n);
    }

    public void SonarSi(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.si);
        String n ="Si";
        sonar(sonido,n);
    }

    public void SonarSol(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sol);
        String n ="Sol";
        sonar(sonido,n);
    }
}