package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class item4 extends AppCompatActivity {
        private Button Finish_quiz;
        int answerofquestion2 = R.id.radio_button3;
        String answerofquestion4 = "Albert Einstein";
        int answerofquestion3 = R.id.radiobutton2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_item4);
            Finish_quiz=findViewById(R.id.button3);
            Finish_quiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mainactivity2Intent=new Intent(item4.this,MainActivity3.class);

                    startActivity(mainactivity2Intent);
                }
            });
        }
        public void test(View v) {
            ArrayList<String> incorrectAnswersList = new ArrayList<String>();

            int Answer = 0;

            if( Question1() ){
                Answer++;
            } else {
                incorrectAnswersList.add("Question number1 is wrong please correct it  /");
            }

            if( Question2() ){
                Answer++;
            } else {
                incorrectAnswersList.add("Question number 2 is wrong please correct it/");
            }

            if( Question3() ){
                Answer++;
            } else {
                incorrectAnswersList.add("Question  number 3 is wrong please correct it /");
            }

            if( Question4() ){
                Answer++;
            } else {
                incorrectAnswersList.add("Question  number 4 is wrong please correct it");
            }
            StringBuilder wrongAnswer = new StringBuilder();
            for (String wrong : incorrectAnswersList)
            {
                wrongAnswer.append(wrong);
            }
            Context f = getApplicationContext();
            CharSequence T = " The score is :"
                    + Answer
                    + " From4\n*The following answers are wrong*\n"
                    + wrongAnswer.toString();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText
                    (f, T, duration);
            toast.show();

        }
        private boolean Question1() {
            CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
            CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
            CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
            CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);

            if (checkBox1.isChecked() && checkBox3.isChecked() && checkBox4.isChecked() && !checkBox2.isChecked()) {
                return true;
            }

            return false;
        }
        private boolean Question2() {
            RadioGroup radiogroub1 = (RadioGroup) findViewById(R.id.RadioGroub);

            if( radiogroub1.getCheckedRadioButtonId() == answerofquestion2 ) {
                return true;
            }

            return false;
        }

        private boolean Question3() {
            RadioGroup radiogroub2 = (RadioGroup) findViewById(R.id.radiongroubtwo);

            if( radiogroub2.getCheckedRadioButtonId() == answerofquestion3 ) {
                return true;
            }

            return false;
        }
        private boolean Question4() {
            EditText editText1 = (EditText)findViewById(R.id.edittext_edittext);
            return editText1.getText().toString().equalsIgnoreCase(answerofquestion4);
        }

    }