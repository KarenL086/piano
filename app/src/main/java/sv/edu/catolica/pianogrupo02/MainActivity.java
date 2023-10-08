package sv.edu.catolica.pianogrupo02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.tipo){
            final String[] piano={"Piano de animales", "Piano de instrumentos"};
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setItems(piano, (dialog, i) -> {
                if (piano[i].equals("Piano de animales")) {
                    Intent objVentana=new Intent(MainActivity.this, pAnimales.class);
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
            Intent objVentana=new Intent(MainActivity.this, acerca_de.class);
            startActivity(objVentana);
            return true;
        } else if (item.getItemId()==R.id.salir) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
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