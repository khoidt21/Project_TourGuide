package com.example.prm391x_tourguide_khoidtfx01411;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;
import android.content.Intent;

public class HomeFragment extends Fragment implements View.OnClickListener {


    ImageView btnImgHotel;
    ImageView btnImgATM;
    ImageView btnImgHospital;
    ImageView btnImgBus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_container, container, false);
        btnImgHotel = (ImageView) view.findViewById(R.id.btnImgHotel);
        btnImgATM = (ImageView) view.findViewById(R.id.btnImgATM);
        btnImgHospital = (ImageView) view.findViewById(R.id.btnImgHospital);
        btnImgBus = (ImageView) view.findViewById(R.id.btnImgBus);

        btnImgHotel.setOnClickListener(this);
        btnImgATM.setOnClickListener(this);
        btnImgHospital.setOnClickListener(this);
        btnImgBus.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.btnImgHotel:

                Intent intent = new Intent(this.getContext(), DetailActivity.class);
                intent.putExtra("flag","flagmentHotel");
                startActivity(intent);
                break;

            case R.id.btnImgATM:
                Intent intent1 = new Intent(this.getContext(),DetailActivity.class);
                intent1.putExtra("flag","flagmentATM");
                startActivity(intent1);
                break;
            case R.id.btnImgHospital:
                Intent intent2 = new Intent(this.getContext(),DetailActivity.class);
                intent2.putExtra("flag","flagmentHospital");
                startActivity(intent2);
                break;
            case R.id.btnImgBus:
                Intent intent3 = new Intent(this.getContext(),DetailActivity.class);
                intent3.putExtra("flag","flagmentBus");
                startActivity(intent3);
        }
    }
}

