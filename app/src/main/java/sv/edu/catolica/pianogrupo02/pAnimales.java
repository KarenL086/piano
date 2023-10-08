package sv.edu.catolica.pianogrupo02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class pAnimales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panimales);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.tipo){
            final String[] piano={"Piano clasico", "Piano de instrumentos"};
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setItems(piano, (dialog, i) -> {
                if (piano[i].equals("Piano clasico")) {
                    Intent objVentana=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(objVentana);
                }else if (piano[i].equals("Piano de instrumentos")){
                    Intent objVentana=new Intent(getApplicationContext(), pIntrumentos.class);
                    startActivity(objVentana);
                }
            });
            builder.create();
            builder.show();
            return true;
        } else if (item.getItemId() == R.id.acerca_de) {
            Intent objVentana=new Intent(getApplicationContext(), acerca_de.class);
            startActivity(objVentana);
            return true;
        } else if (item.getItemId()==R.id.salir) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
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