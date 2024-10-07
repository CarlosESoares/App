package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PlanetaAdapter extends ArrayAdapter<Planetas> {

    Context mCOntext;
    Integer mResource;
    List mLystPlanetas;

    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planetas> objects) {

        super(context, resource, objects);

        mCOntext=context;
        mResource=resource;
        mLystPlanetas=  objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = new LayoutInflater.from(mCOntext);
        convertView=layoutInflater.inflate(mResource,parent,false);

        return convertView;
    }
}
