package com.example.exercise4

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val c = Calendar.getInstance()
    val cyear = c.get(Calendar.YEAR)
    val cmonth = c.get(Calendar.MONTH)
    val cday = c.get(Calendar.DAY_OF_MONTH)
    var age = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate: Button = findViewById(R.id.btnOK)
        btnCalculate.setOnClickListener {onCalculateEPF()}

        btnReset.setOnClickListener(){
            txtDOB.setText("")
            txtAge.setText("")
            txtSaving.setText("")
            txtInvestment.setText("")
        }


    }

//    @RequiresApi(Build.VERSION_CODES.N)
    fun clickDataPicker(view: View) {


        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

            age = cyear - year
            txtDOB.setText("%d-%d-%d".format(dayOfMonth, monthOfYear, year))
            txtAge.text = (age.toString())

        }, cyear, cmonth, cday)
        dpd.show()


    }

    fun onCalculateEPF(){
        val percent: Spinner = findViewById(R.id.spinnerP)
            if(age>=16 && age<=20 && percent.selectedItemPosition == 0) {
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.05).toString())
            }else if(age>=16 && age<=20 && percent.selectedItemPosition ==1){
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.1).toString())
            }else if(age>=16 && age<=20 && percent.selectedItemPosition ==2){
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.15).toString())
            }else if(age>=16 && age<=20 && percent.selectedItemPosition ==3){
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.2).toString())
            }else if(age>=16 && age<=20 && percent.selectedItemPosition ==4){
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.25).toString())
            }else if(age>=16 && age<=20 && percent.selectedItemPosition ==5){
                txtSaving.setText(5000.toString())
                txtInvestment.setText((5000 * 0.3).toString())
            }

            //21-25
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 0){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.05).toString())
            }
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 1){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.1).toString())
            }
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 2){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.15).toString())
            }
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 3){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.2).toString())
            }
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 4){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.25).toString())
            }
            else if(age>=21 && age<=25 && percent.selectedItemPosition == 5){
                txtSaving.setText(14000.toString())
                txtInvestment.setText((14000*0.3).toString())
            }

            //26-30
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 0){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((290000*0.05).toString())
            }
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 1){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((29000*0.1).toString())
            }
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 2){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((29000*0.15).toString())
            }
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 3){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((29000*0.2).toString())
            }
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 4){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((29000*0.25).toString())
            }
            else if(age>=26 && age<=30 && percent.selectedItemPosition == 5){
                txtSaving.setText(29000.toString())
                txtInvestment.setText((29000*0.3).toString())
            }

            //31-35
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 0){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.05).toString())
            }
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 1){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.1).toString())
            }
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 2){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.15).toString())
            }
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 3){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.2).toString())
            }
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 4){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.25).toString())
            }
            else if(age>=31 && age<=35 && percent.selectedItemPosition == 5){
                txtSaving.setText(50000.toString())
                txtInvestment.setText((50000*0.3).toString())
            }

            //36-40
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 0){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.05).toString())
            }
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 1){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.1).toString())
            }
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 2){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.15).toString())
            }
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 3){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.2).toString())
            }
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 4){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.25).toString())
            }
            else if(age>=36 && age<=40 && percent.selectedItemPosition == 5){
                txtSaving.setText(78000.toString())
                txtInvestment.setText((78000*0.3).toString())
            }

            //41-45
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 0){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.05).toString())
            }
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 1){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.1).toString())
            }
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 2){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.15).toString())
            }
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 3){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.2).toString())
            }
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 4){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.25).toString())
            }
            else if(age>=41 && age<=45 && percent.selectedItemPosition == 5){
                txtSaving.setText(116000.toString())
                txtInvestment.setText((116000*0.3).toString())
            }

            //46-50
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 0){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.05).toString())
            }
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 1){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.1).toString())
            }
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 2){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.15).toString())
            }
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 3){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.2).toString())
            }
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 4){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.25).toString())
            }
            else if(age>=46 && age<=50 && percent.selectedItemPosition == 5){
                txtSaving.setText(165000.toString())
                txtInvestment.setText((165000*0.3).toString())
            }

            //51-55
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 0){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.05).toString())
            }
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 1){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.1).toString())
            }
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 2){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.15).toString())
            }
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 3){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.2).toString())
            }
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 4){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.25).toString())
            }
            else if(age>=51 && age<=55 && percent.selectedItemPosition == 5){
                txtSaving.setText(228000.toString())
                txtInvestment.setText((228000*0.3).toString())
            }

    }


}
