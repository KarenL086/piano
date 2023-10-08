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

public class pIntrumentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pintrumentos);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.tipo){
            final String[] piano={"Piano clasico", "Piano de animales"};
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setItems(piano, (dialog, i) -> {
                if (piano[i].equals("Piano clasico")) {
                    Intent objVentana=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(objVentana);
                }else if (piano[i].equals("Piano de animales")){
                    Intent objVentana=new Intent(getApplicationContext(), pAnimales.class);
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





