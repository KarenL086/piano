package sv.edu.catolica.pianogrupo02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class acerca_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.tipo){
            final String[] piano={"Piano clasico", "Piano de animales","Piano de instrumentos"};
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setItems(piano, (dialog, i) -> {
                switch (piano[i]) {
                    case "Piano clasico": {
                        Intent objVentana = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(objVentana);
                        break;
                    }
                    case "Piano de animales": {
                        Intent objVentana = new Intent(getApplicationContext(), pAnimales.class);
                        startActivity(objVentana);
                        break;
                    }
                    case "Piano de instrumentos": {
                        Intent objVentana = new Intent(getApplicationContext(), pIntrumentos.class);
                        startActivity(objVentana);
                        break;
                    }
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
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}