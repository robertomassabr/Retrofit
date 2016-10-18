package com.robertomassa.retrofit.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mikepenz.materialdrawer.AccountHeader;
import com.robertomassa.retrofit.R;
import com.robertomassa.retrofit.interfaces.Constantes;
import com.robertomassa.retrofit.fragment.FuncionarioFragment;

public class MainActivity extends AppCompatActivity implements Constantes {

    private Toolbar toolbar;

    //Permite trabalhar com fragmentos dentro de uma activity
    private FragmentManager fragmentManager;

    //Permite criar o menu lateral de conta semelhante a do google play
    private AccountHeader accountHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        toolbar = (Toolbar) findViewById(R.id.toolBarTop);

        toolbar.setTitle(getString(R.string.app_name));

        setSupportActionBar(toolbar);

        //Define qual fragmento (conteúdo) vai aparecer ao inciar o app
        fragmentManager.beginTransaction()
                .replace(R.id.container,new FuncionarioFragment())
                .commit();

   }
}
