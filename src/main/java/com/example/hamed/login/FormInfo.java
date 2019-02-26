package com.example.hamed.login;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.hamed.login.R;
import com.example.hamed.login.home;

public class FormInfo implements View.OnClickListener {

    private Activity activity           ;
    private LinearLayout layoutForminfo ;
    private EditText inputName          ;
    private EditText inputpass          ;
    private EditText inputpass1         ;
    private Button   btnlogin           ;

    public EditText getInputName() {
        return inputName;
    }

    public EditText getInputpass() {
        return inputpass;
    }

    public EditText getInputpass1() {
        return inputpass1;
    }

    public FormInfo(Activity activity, int layoutid){
        this.activity  = activity;
        layoutForminfo = activity.findViewById(layoutid);
        init();

    }

    private void init() {
        if(layoutForminfo == null)
        {
            return;
        }

        inputName  = layoutForminfo.findViewById(R.id.editText_name)    ;
        inputpass  = layoutForminfo.findViewById(R.id.editText_pass)    ;
        inputpass1 = layoutForminfo.findViewById(R.id.editText_pass1)   ;
        btnlogin   = layoutForminfo.findViewById(R.id.btnsign1)         ;

        btnlogin.setOnClickListener(this);
    }

    public Button getBtnlogin() {
        return btnlogin;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== btnlogin.getId())
        {
            String name  = inputName  .getText().toString().trim();
            String pass  = inputpass  .getText().toString().trim();
            String pass1 = inputpass1 .getText().toString().trim();

            if(isvalidinput(name,pass,pass1))
            {
                Intent intent = new Intent(activity,home.class);

                activity.startActivity(intent);




            }

        }

    }

    private boolean isvalidinput(String name, String pass, String pass1) {

        if(name.length()<3)
        {
            Toast.makeText(activity.getApplicationContext(),"name is short",Toast.LENGTH_SHORT).show();
            inputName.requestFocus();
            return false;
        }

        if(pass.length()<4)
        {
            Toast.makeText(activity.getApplicationContext(),"password is short",Toast.LENGTH_SHORT).show();
            inputpass.requestFocus();
            return false;
        }
        if(!pass.equals(pass1))
        {
            Toast.makeText(activity.getApplicationContext(),"passwords not match",Toast.LENGTH_SHORT).show();
            inputpass1.requestFocus();
            return false;
        }




        return true;
    }


}
