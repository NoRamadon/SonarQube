package dmi.example.unittestwithsonarqube

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val calculatorUtil = CalculatorUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(" ${calculatorUtil.sum(4,5)}")
    }
}
