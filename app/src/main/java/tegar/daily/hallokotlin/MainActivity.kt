package tegar.daily.hallokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_process.setOnClickListener { validation(et_input.text.toString()) }
    }

    fun validation(value : String){
        if (value.length > 1){
            if (value.equals("ok")){
            makeIntent()
            }else{
                tv_output.text = "You Cant Access That"
            }
        }
    }

    fun makeIntent(){
        val intent = Intent(this, WelcomeActivity::class.java)
        intent.putExtra("message", et_input.text.toString())
        startActivity(intent)
    }
}
