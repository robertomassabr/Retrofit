package com.robertomassa.retrofit.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.robertomassa.retrofit.R;
import com.robertomassa.retrofit.adapter.FuncionarioAdapter;
import com.robertomassa.retrofit.dao.FuncionarioDAO;
import com.robertomassa.retrofit.domain.Funcionario;
import com.robertomassa.retrofit.interfaces.Constantes;

import java.util.List;

public class FuncionarioFragment extends Fragment implements Constantes {

    private List<Funcionario> funcionarios;

    public FuncionarioFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        funcionarios = new FuncionarioDAO().getLista();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_funcionarios, container, false);

        //Instancia o adpter
        FuncionarioAdapter adapter = new FuncionarioAdapter(getActivity(),funcionarios);

        //Recuperar a Listview
        ListView listaFuncionarios = (ListView) view.findViewById(R.id.listView);

        //Adicionar o adapter na listview
        listaFuncionarios.setAdapter(adapter);

        return view;
    }

}
