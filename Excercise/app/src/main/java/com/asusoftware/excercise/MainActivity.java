package com.asusoftware.excercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //


    // Siccome anche il bottone e una View dobbiamo passare un argomento
    public void onClickButton(View view) {

        // Interact with user inputs

        // Dobbiamo creare una variabile Edit Text per riferirci al testo che l'utente digiterà
        // R = risorse, id si riferisce all'id della risorsa, e poi il id della risorsa
        // Transformiamo la findView.. in EditText perchè ci ritorna la view, e noi vogliamo il testo
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Info", "Button clicked!"); // stampa sul Logcat il msg quando il pulsante e premuto
        Log.i("Values", nameEditText.getText().toString());

        // Display message to the user
        // Toast fa usscire un popup in basso quando l'utente preme il pulsante in quest caso
        // Context si riferisce a quale activity deve aparire, text e il testo da mostrare, Toast.Length_short si riferisce
        // per quanto tempo rimane visibile(in questo caso per un breve lasso di tempo
        Toast.makeText(this, nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    // savedInstanceState e lo stato della App, ci possiamo agrappare per fare cose durante lo stato della app
    protected void onCreate(Bundle savedInstanceState) { // crea l'Activity con la view
        super.onCreate(savedInstanceState); // richiama il metodo onCreate della classe padre (AppCompactActivity)
        setContentView(R.layout.activity_main); // Collega l'Activity alla view activity_main.xml dove abbiamo l'interfaccia(layout)
    }
}
