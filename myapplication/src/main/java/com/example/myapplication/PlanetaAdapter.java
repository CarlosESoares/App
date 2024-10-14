package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class        PlanetaAdapter extends ArrayAdapter<Planetas> {

    Context mCOntext;
    Integer mResource;
    List<Planetas> mLystPlanetas;


    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planetas> objects) {

        super(context, resource, objects);

        mCOntext=context;
        mResource=resource;
        mLystPlanetas=  objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCOntext);


        v = layoutInflater.inflate(mResource,parent,false);

        TextView tvNomePlaneta = v.findViewById(R.id.textViewNome);
        ImageView imageView =v.findViewById(R.id.imageView);

        Planetas planeta =mLystPlanetas.get(position);
        tvNomePlaneta.setText(planeta.nome);
        imageView.setImageResource(planeta.integer);
                return v;
    }
}
