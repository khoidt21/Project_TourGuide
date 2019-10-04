package com.example.prm391x_tourguide_khoidtfx01411;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetaiListViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        String dataDesc = getArguments().getString("dataDesc");
        View view = inflater.inflate(R.layout.detail_listview_fragment, container, false);
        TextView tvdesc = (TextView) view.findViewById(R.id.textDetailDesc);
        tvdesc.setText(dataDesc);
        return view;
    }

}
