package com.robertomassa.retrofit.adapter;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import com.robertomassa.retrofit.R;
import com.robertomassa.retrofit.domain.Funcionario;

public class FuncionarioAdapter extends BaseAdapter {

    private List<Funcionario> funcionarios;

    private Fragment fragment;

    private Context context;


    public FuncionarioAdapter (Context context, List<Funcionario> funcionarios){
        this.context = context;
        this.funcionarios = funcionarios;
    }


    @Override
    public int getCount() {
        return funcionarios.size();
    }

    @Override
    public Object getItem(int position) {
        return funcionarios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return funcionarios.get(position).getIdFunc();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        //Criar uma view a partir do arquivo de layout item.xml
        View view = mInflater.inflate(R.layout.item, null);

        //Obter objeto funcionario a partir da posição
        Funcionario funcionario = funcionarios.get(position);

        //Exibir o nome do funcionario no TextView
        TextView id = (TextView) view.findViewById(R.id.tvId);
        id.setText(funcionario.getId());

        //Exibir o nome do funcionario no TextView
        TextView name = (TextView) view.findViewById(R.id.tvName);
        name.setText(funcionario.getName());

        //Exibir o cargo do funcionario no TextView
        TextView pwd = (TextView) view.findViewById(R.id.tvPwd);
        pwd.setText(funcionario.getPwd());

        return view;
    }
}
