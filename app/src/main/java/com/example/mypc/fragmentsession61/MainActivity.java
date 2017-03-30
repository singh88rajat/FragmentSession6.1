package com.example.mypc.fragmentsession61;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{
    EditText edtTxtVar;
    String inputValVar;
    TextView txtViewVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        BlankFragment blankFragment = BlankFragment.newInstance("","");
        fragmentTransaction.add(R.id.fragment_container,blankFragment);
        /*fragmentTransaction.addToBackStack(blankFragment.FRAGMENT_NAME);*/
        fragmentTransaction.commit();


    }

    @Override
    public void onFragmentInteraction() {
        edtTxtVar = (EditText) findViewById(R.id.editText);
        inputValVar = edtTxtVar.getText().toString();

        txtViewVar = (TextView) findViewById(R.id.textView);
        txtViewVar.setText(inputValVar);
    }
}
