package fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerexample.siswaAdapter;
import com.example.navdrawerexample.Model;
import com.example.navdrawerexample.R;

import java.util.ArrayList;

public class namasiswa extends Fragment implements siswaAdapter.RecyclerViewClickListener {
    ArrayList<Model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_namasiswa, container, false);
        RecyclerView rvSiswa = rootview.findViewById(R.id.rvsiswa);

        model.add(new Model("Adli", R.drawable.person));
        model.add(new Model("Miqdam",R.drawable.person));
        model.add(new Model("Firasi", R.drawable.person));
        model.add(new Model("Simatahari", R.drawable.person));
        model.add(new Model("Caesar", R.drawable.person));
        model.add(new Model("Bitriq", R.drawable.person));
        model.add(new Model("Raihan", R.drawable.person));
        model.add(new Model("Yusuf", R.drawable.person));
        model.add(new Model("Wisnu", R.drawable.person));

        rvSiswa.setLayoutManager(new LinearLayoutManager(getActivity()));
        siswaAdapter adapter = new siswaAdapter(getContext(), model, this);
        rvSiswa.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}