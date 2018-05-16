package com.example.folfo93.fragmentskotline

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//libreria para acceder a los elementos del layout.
import kotlinx.android.synthetic.main.fragment_main.*
//libreria Anko que nos facilita el codigo
import org.jetbrains.anko.support.v4.toast

/*Clase que contiene el fragment que incluiremos en la
activity principal.*/
class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //Cargamos el layout del fragment para poder utilizar sus elementos.
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //se añade funcionalidad al boton
        main_button.setOnClickListener {
            /*Mostramos un toast, el cual necesita de la libreria anko
              para completar la funcionalidad de Kotlin
            */
            toast("Mensaje: ${main_editText.text}")
            //se mostrara en el TextView lo que introduzcamos en el EditText.
            main_textview.text = main_editText.text
            /*Se utiliza 'activity' para indicar el 'context'; al ser un fragment el
            'context' es la propia 'activity' que lo contiene*/
            val datos = Intent(activity,Main2Activity::class.java)
            datos.putExtra("key1","valor1")
            startActivity(datos)
        }
    }
}
