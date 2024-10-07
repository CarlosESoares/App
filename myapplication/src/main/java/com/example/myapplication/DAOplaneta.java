package com.example.myapplication;

import java.util.ArrayList;

public class DAOplaneta {
    ArrayList <Planetas> planetas;

    public DAOplaneta() {
        planetas = new ArrayList<>();
        planetas.add(new Planetas("Mercurio",R.drawable.mercury ));
        planetas.add(new Planetas("Venus",R.drawable.venus));
        planetas.add(new Planetas("Terra",R.drawable.earth));

        }
        public ArrayList getPlanetas(){

        return planetas;
        }
}
