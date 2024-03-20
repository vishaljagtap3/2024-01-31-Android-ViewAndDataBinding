package `in`.bitcode.viewanddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textservice.TextInfo
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import `in`.bitcode.viewanddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*private lateinit var img : ImageView
    private lateinit var txtInfo : TextView
    private lateinit var edtInfo : EditText
    private lateinit var btnSetInfo : Button
    private lateinit var chkSettings : CheckBox
    */
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding =
            ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnSetInfo.setOnClickListener {
            activityMainBinding.txtInfo.text = activityMainBinding.edtInfo.text.toString()
        }

        activityMainBinding.btnShowEmpDetails.setOnClickListener {
            startActivity(
                Intent(this, EmpDetailsActivity::class.java)
            )
        }

        /*
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.img)
        txtInfo = findViewById(R.id.txtInfo)
        edtInfo = findViewById(R.id.edtInfo)
        btnSetInfo = findViewById(R.id.btnSetInfo)
        chkSettings = findViewById(R.id.chkSettings)*/
    }
}