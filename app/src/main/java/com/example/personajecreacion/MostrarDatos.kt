package com.example.personajecreacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostrarDatos: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mostrar_datos)


        var personaje : Personaje? = null
        val botonSiguiente: Button = findViewById<Button>(R.id.boton_siguiente2)

        val botonAtras: Button = findViewById<Button>(R.id.boton_atras1)
        val nombre_personaje : TextView = findViewById<TextView>(R.id.nombre_personaje)
        val raza_personaje : TextView =findViewById<TextView>(R.id.raza_personaje)
        val clase_personaje : TextView = findViewById<TextView>(R.id.clase_personaje)
        val edad_personaje : TextView = findViewById<TextView>(R.id.Edad_personaje)
        val imageView: ImageView = findViewById(R.id.imageView)

        var raza = intent.getStringExtra("raza")
        var clase = intent.getStringExtra("clase")
        var edad = intent.getStringExtra("edad")
        var nombre = intent.getStringExtra("nombre")

        nombre_personaje.text = "NOMBRE:  $nombre"
        raza_personaje.text = "RAZA:  $raza"
        clase_personaje.text = "CLASE:  $clase"
        edad_personaje.text = "EDAD:  $edad"

        personaje = Personaje(nombre.toString(), edad.toString(), raza.toString(), clase.toString())


        botonAtras.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        botonSiguiente.setOnClickListener {
            val intent = Intent(this, Aventura::class.java)
            intent.putExtra("Personaje",personaje)
            startActivity(intent)
        }

        when(raza) {
            "Humano"->{
                when(clase){
                    "Brujo"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.humano_brujo_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.humano_brujo_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.humano_brujo_joven)
                            }
                        }
                    }
                    "Mago"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.humano_mago_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.humano_mago_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.humano_mago_joven)
                            }
                        }
                    }
                    "Guerrero"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.humano_guerrero_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.humano_guerrero_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.humano_guerrero_joven)
                            }
                        }
                    }
                }
            }
            "Elfo"->{
                when(clase){
                    "Brujo"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.elfo_brujo_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.elfo_brujo_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.elfo_brujo_joven)
                            }
                        }
                    }
                    "Mago"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.elfo_mago_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.elfo_mago_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.elfo_mago_joven)
                            }
                        }
                    }
                    "Guerrero"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.elfo_guerrero_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.elfo_guerrero_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.elfo_guerrero_joven)
                            }
                        }
                    }
                }
            }
            "Enano"->{
                when(clase){
                    "Brujo"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.enano_brujo_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.enano_brujo_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.enano_brujo_joven)
                            }
                        }
                    }
                    "Mago"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.enano_mago_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.enano_mago_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.enano_mago_joven)
                            }
                        }
                    }
                    "Guerrero"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.enano_guerrero_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.enano_guerrero_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.enano_guerrero_joven)
                            }
                        }
                    }
                }
            }
            "Maldito"->{
                when(clase){
                    "Brujo"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.maldito_brujo_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.maldito_brujo_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.maldito_brujo_adolescente)
                            }
                        }
                    }
                    "Mago"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.maldito_mago_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.maldito_mago_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.maldito_mago_adolescente)
                            }
                        }
                    }
                    "Guerrero"->{
                        when(edad){
                            "Anciano"->{
                                imageView.setImageResource(R.drawable.maldito_guerrero_anciano)
                            }
                            "Adulto"->{
                                imageView.setImageResource(R.drawable.maldito_guerrero_adulto)
                            }
                            "Joven"->{
                                imageView.setImageResource(R.drawable.maldito_guerrero_adolescente)
                            }
                        }
                    }
                }
            }

        }

    }
}
