package com.example.prm391x_tourguide_khoidtfx01411;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class DetailActivity extends AppCompatActivity {


    static String FRAGMENT_LIST_POSSION = "fragmentDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String flagment = getIntent().getStringExtra("flag");
        switch (flagment){
            case "flagmentHotel" :
                Fragment fHotel = new HotelFragment();
                replaceFragment(fHotel);
                break;
            case "flagmentATM":
                Fragment fATM = new ATMFragment();
                replaceFragment(fATM);
                break;
            case "flagmentHospital":
                Fragment fHospital = new HospitalFragment();
                replaceFragment(fHospital);
                break;
            case "flagmentBus":
                Fragment fBus = new BusFragment();
                replaceFragment(fBus);
                break;
        }

    }

    public void replaceFragment(Fragment someFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout, someFragment, FRAGMENT_LIST_POSSION);
       // fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        //getSupportFragmentManager().findFragmentByTag(FRAGMENT_LIST_POSSION);

    }
}