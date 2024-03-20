package `in`.bitcode.viewanddatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import `in`.bitcode.viewanddatabinding.databinding.EmpDetailsActivityBinding

class EmpDetailsActivity : AppCompatActivity() {

    private lateinit var empDetailsActivityBinding: EmpDetailsActivityBinding
    private val e1 = Emp(100, "John Doe", "john@hosting.com", "231232", true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        empDetailsActivityBinding = EmpDetailsActivityBinding.inflate(layoutInflater)
        setContentView(empDetailsActivityBinding.root)

        empDetailsActivityBinding.emp = e1
    }

}
