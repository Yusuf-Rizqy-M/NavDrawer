package fragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerexample.guruproductivAdapter;
import com.example.navdrawerexample.Model;
import com.example.navdrawerexample.R;

import java.util.ArrayList;

public class namaguruproduvtive extends Fragment implements guruproductivAdapter.RecyclerViewClickListener {
    ArrayList<Model> modelbangundatar = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_gurupproductive, container, false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvsiswa);

        modelbangundatar.add(new Model("Aji Suryawan", R.drawable.ajisuryawan));
        modelbangundatar.add(new Model("Muhammad Fahmi Irsyad", R.drawable.fahmi));
        modelbangundatar.add(new Model("Dwi Janto", R.drawable.dwijanto));
        modelbangundatar.add(new Model("Agus Hamdun", R.drawable.agushamdun));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        guruproductivAdapter adapter = new guruproductivAdapter(getContext(), modelbangundatar, this);
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}