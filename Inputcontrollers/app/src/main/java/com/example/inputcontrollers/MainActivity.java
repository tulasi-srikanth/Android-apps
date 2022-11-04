package com.example.inputcontrollers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*Radio group is used to group together one or more radio buttons
    * Radio butons is used to have 2 states either checked or unchecked*/
    RadioGroup radiog;
    RadioButton radiob1,radiob2;
    /*Check boxes when presenting users with group of selectable options that are not mutually exclusive*/
    CheckBox checkb1,checkb2,checkb3;
    /*A switch statement is used to display checked or unchecked state of a button providing a slider controller to user
    * is basically an offer on state*/
    Switch aSwitch;
    LinearLayout linearLayout;
    /*A spinner is a dropdown list that allows user to select one value from a set*/
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiog = findViewById(R.id.rg1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);
        checkb1 = findViewById(R.id.check1);
        checkb2 = findViewById(R.id.check2);
        checkb3 = findViewById(R.id.check3);
        aSwitch = findViewById(R.id.switch1);
        linearLayout = findViewById(R.id.linear1);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()) {
                    linearLayout.setBackgroundColor(Color.GREEN);
                }else{
                        linearLayout.setBackgroundColor(Color.BLUE);
                    }

            }
        });
        radiog.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }


    public void submit(View view) {
        Toast.makeText(this, "Puppy blessed you", Toast.LENGTH_SHORT).show();
    }

    public void saveData(View view) {
        if(checkb1.isChecked()&&checkb2.isChecked()&&checkb3.isChecked()){
            Toast.makeText(this, ""+checkb1.getText()+","+checkb2.getText()+","+checkb3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(checkb1.isChecked()&&checkb2.isChecked()){
            Toast.makeText(this, ""+checkb1.getText()+","+checkb2.getText(),Toast.LENGTH_SHORT).show();
        }
        else if(checkb2.isChecked()&&checkb3.isChecked()){
            Toast.makeText(this, ""+checkb2.getText()+","+checkb3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(checkb1.isChecked()&&checkb3.isChecked()){
            Toast.makeText(this, ""+checkb1.getText()+","+checkb3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(checkb1.isChecked()){
            Toast.makeText(this, ""+checkb1.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(checkb2.isChecked()){
            Toast.makeText(this, ""+checkb2.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(checkb3.isChecked()){
            Toast.makeText(this, ""+checkb3.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}