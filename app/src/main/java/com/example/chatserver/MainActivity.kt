package com.example.chatserver

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.DataInputStream
import java.io.DataOutputStream
import java.lang.Exception
import java.net.InetAddress
import java.net.Socket
/*
Started creating this project 26.02, with no progress that day, except making the layout
and trying out the Socket to no avail. - Joachim Grotenfelt
27.02 created the connection to the chat server.
*/
class MainActivity : AppCompatActivity() {
    val TAG = "Error"
    private val ip = "192.168.1.102"                        //Hast to be changed everytime server is restarted
    val s = Socket(InetAddress.getByName(ip), 56549)
    val socketInputStream =  s.getInputStream()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val sendButton = findViewById(R.id.SendButton) as Button
       // val message = Message.text.toString()

        //Connection to the Server thread
        Thread (Runnable {
          try{
              s
          }catch (e:Exception){
              Log.e(TAG," crashed to $e")
             // Toast.makeText(this, "The program didn't start properly, try booting it.", Toast.LENGTH_SHORT).show()
          }
        }).start()

/*
        //InputStream Thread
        Thread (Runnable{
            try {
                while(sBoolean == true){
                    sendButton.setOnClickListener{
                        Toast.makeText(this, "AYYY you pressed the button", Toast.LENGTH_SHORT).show()
                    }

                }
            }catch (e:Exception){
                Log.e(TAG, "Message could not be sent: $e")
            }
        })
        */
    }
    }

