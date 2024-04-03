package fragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerexample.guruAdapter;
import com.example.navdrawerexample.Model;
import com.example.navdrawerexample.R;

import java.util.ArrayList;

public class guru extends Fragment implements guruAdapter.RecyclerViewClickListener {
    ArrayList<Model> modelbangundatar = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_gurupproductive, container, false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvsiswa);
        modelbangundatar.add(new Model("Riekie Amalia", R.drawable.riekie));
        modelbangundatar.add(new Model("Muhtadi Imam", R.drawable.person));
        modelbangundatar.add(new Model("Farid", R.drawable.farid));
        modelbangundatar.add(new Model("Jumanto", R.drawable.jumanto));
        modelbangundatar.add(new Model("Ariyo FP", R.drawable.person));
        modelbangundatar.add(new Model("Widyasih", R.drawable.widyasiih));
        modelbangundatar.add(new Model("Devyta", R.drawable.person));
        modelbangundatar.add(new Model("Firawan", R.drawable.irawan));
        modelbangundatar.add(new Model("Khusniyati", R.drawable.person));
        modelbangundatar.add(new Model("Vita Vinia", R.drawable.vita));
        modelbangundatar.add(new Model("Jamil", R.drawable.person));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        guruAdapter adapter = new guruAdapter(getContext(), modelbangundatar, this);
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}