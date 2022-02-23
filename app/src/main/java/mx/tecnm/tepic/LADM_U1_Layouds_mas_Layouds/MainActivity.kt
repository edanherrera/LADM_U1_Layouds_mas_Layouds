package mx.tecnm.tepic.LADM_U1_Layouds_mas_Layouds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        about.setOnClickListener { ventanaPerros() }
        datos.setOnClickListener { ventanaDatos() }

    }
    fun ventanaPerros(){
        val aboutVentana = Intent(this,MainActivity2::class.java)
        startActivity(aboutVentana)
    }
    fun ventanaDatos(){
        val datosVentana = Intent(this,MainActivity3::class.java)
        startActivity(datosVentana)
    }
}