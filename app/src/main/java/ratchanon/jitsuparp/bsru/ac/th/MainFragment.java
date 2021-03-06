package ratchanon.jitsuparp.bsru.ac.th;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Register Controller
        registerController();

    }   // Main Method

    private void registerController() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant,new RegisterFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
        TextView textView1 = getView().findViewById(R.id.txtPagea);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant,new AFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
        TextView textView2 = getView().findViewById(R.id.txtPageb);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant,new BFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
