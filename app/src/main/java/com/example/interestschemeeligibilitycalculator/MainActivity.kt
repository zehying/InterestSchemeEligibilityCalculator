package com.example.interestschemeeligibilitycalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c:Calendar = Calendar.getInstance();
        val Year = c.get(Calendar.YEAR);
        val Month = c.get(Calendar.MONTH);
        val Day = c.get(Calendar.DAY_OF_MONTH);
        var yearOfBirth = 0;

        textView_date.setOnClickListener() {

            val dpd = DatePickerDialog( this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    textView_date.setText("%d-%d-%d".format(dayOfMonth,monthOfYear,year))
                yearOfBirth =year},Year,Month,Day)
                    dpd.show();

                }
        button.setOnClickListener(){
            var age=0;
            var minSaving =0;
            var investment = 0;
            age = Year - yearOfBirth;
            textView_Age .text = age.toString();

            if(age >= 16 && age <= 20){
                minSaving = 5000;
                investment = minSaving*30/100;
            }else if(age>=21 && age <= 25){
                minSaving = 14000;
                investment = minSaving*30/100;
            }else if(age>=26 && age <= 30){
                minSaving = 29000;
                investment = minSaving*30/100;
            }else if(age>=31 && age <= 35){
                minSaving = 50000;
                investment = minSaving*30/100;
            }else if(age>=36 && age <= 40){
                minSaving = 78000;
                investment = minSaving*30/100;
            }else if(age>=41 && age <= 45){
                minSaving = 116000;
                investment = minSaving*30/100;
            }else if(age>=46 && age <= 50){
                minSaving = 165000;
                investment = minSaving*30/100;
            }else if(age>=51 && age <= 55){
                minSaving = 228000;
                investment = minSaving*30/100;
            }

            textView_minSaving.text = minSaving.toString();
            textView_Investment.text = investment.toString();
        }

        button2.setOnClickListener(){
            textView_Investment.setText(null);
            textView_minSaving.setText(null);
            textView_date.text = "Pick a date";
            textView_Age.setText(null);



        }
        }


        }




