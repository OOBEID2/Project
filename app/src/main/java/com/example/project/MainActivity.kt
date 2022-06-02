package com.example.project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x: String = "Surgery"
        var flag: String
        var flag1: String
        var flagGender: String

        val spinnerDept: Spinner = findViewById(R.id.spChooseDept)
        var Dept = arrayOf("Surgery" /*1200*/, "Orthopaedics"/*250*/, "Neurology", "Plastic Surgery",
            "Orthopaedic", "Cardiology")
        spinnerDept.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Dept)
        spinnerDept.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = Dept.get(p2)
            }


            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Empty
            }
        }


        val spinnerDr: Spinner = findViewById(R.id.spChooseDr)
        var Dr = arrayOf("Dr. Mike Ross", "Dr. Emily Watson", "Dr. Harvey Specter", "Dr. Dona King",
        "Dr. Omar Ahmad", "Dr. Max Goodwin ", "Dr. Iggy Frome", "Dr.Cassian Shin",
        "Dr. Yousef Rashid", "Dr. Khaled Ahmad", "Dr. Rachel Zane", "Dr. Dana Soctt", "Dr. Katrina Bennet"
        , "Dr. Zoe Lawford", "Dr. ", "Michael Gray", "Dr. Sara Kharim", "Dr. Joud Massoud",
        "Dr. Tareq Saif")
        spinnerDr.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Dr)
        spinnerDr.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag1 = Dr.get(p2)
            }


            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Empty
            }
        }




        val spinnerGender: Spinner = findViewById(R.id.spGender)
        var Gender = arrayOf("Male", "Female")
        spinnerGender.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Gender)
        spinnerGender.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flagGender = Dept.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Empty
            }
        }


    }
}