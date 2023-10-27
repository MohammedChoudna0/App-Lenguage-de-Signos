package org.cuatrovientos.signum.app;

import android.app.Application;
import android.graphics.drawable.Drawable;

import org.cuatrovientos.signum.Models.Categoria;
import org.cuatrovientos.signum.Models.Signo;
import org.cuatrovientos.signum.R;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyAplication extends Application {

    public static AtomicInteger signosId = new AtomicInteger();
    public static AtomicInteger categoriasId = new AtomicInteger();

    @Override
    public void onCreate() {
        super.onCreate();

        setUpRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        signosId = getIdByTable(realm, Signo.class);
        categoriasId = getIdByTable(realm, Categoria.class);
        realm.close();
    }

    private void setUpRealmConfig(){
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){

        RealmResults<T> results = realm.where(anyClass).findAll();

        if (results.size()>0){
            return new AtomicInteger(results.max("id").intValue());
        }else{
            realm.beginTransaction();
            Categoria ciudad = new Categoria("Ciudad", R.drawable.ciudad_categoria);
            realm.copyToRealm(ciudad);
            Signo signo1 = new Signo("Acera", R.drawable.ciudad_acera);
            realm.copyToRealm(signo1);
            Signo signo2 = new Signo("Ambulancia", R.drawable.ciudad_ambulancia);
            realm.copyToRealm(signo2);
            Signo signo3 = new Signo("Autobus", R.drawable.ciudad_autobus);
            realm.copyToRealm(signo3);
            Signo signo4 = new Signo("Biblioteca", R.drawable.ciudad_biblioteca);
            realm.copyToRealm(signo4);
            Signo signo5 = new Signo("Banco Dinero", R.drawable.ciudad_banco_dinero);
            realm.copyToRealm(signo5);
            Signo signo6 = new Signo("Banco Sentar", R.drawable.ciudad_banco_sentar);
            realm.copyToRealm(signo6);
            Signo signo7 = new Signo("Bicicleta", R.drawable.ciudad_bicicleta);
            realm.copyToRealm(signo7);
            Signo signo8 = new Signo("Bombero", R.drawable.ciudad_bombero);
            realm.copyToRealm(signo8);
            Signo signo9 = new Signo("Buzon", R.drawable.ciudad_buzon);
            realm.copyToRealm(signo9);
            Signo signo10 = new Signo("Calle", R.drawable.ciudad_calle);
            realm.copyToRealm(signo10);
            Signo signo11 = new Signo("Camion", R.drawable.ciudad_camion);
            realm.copyToRealm(signo11);
            Signo signo12 = new Signo("Cine", R.drawable.ciudad_cine);
            realm.copyToRealm(signo12);
            Signo signo13 = new Signo("Acera", R.drawable.ciudad_ciudad);
            realm.copyToRealm(signo13);
            Signo signo14 = new Signo("Ciudad Barca", R.drawable.ciudad_ciudad_barca);
            realm.copyToRealm(signo14);
            Signo signo15 = new Signo("Coche", R.drawable.ciudad_coche);
            realm.copyToRealm(signo15);
            Signo signo16 = new Signo("Colegio", R.drawable.ciudad_colegio);
            realm.copyToRealm(signo16);
            Signo signo17 = new Signo("Columpio", R.drawable.ciudad_columpio);
            realm.copyToRealm(signo17);
            Signo signo18 = new Signo("Farola", R.drawable.ciudad_farola);
            realm.copyToRealm(signo18);
            Signo signo19 = new Signo("Fuente", R.drawable.ciudad_fuente);
            realm.copyToRealm(signo19);
            Signo signo20 = new Signo("Hospital", R.drawable.ciudad_hospital);
            realm.copyToRealm(signo20);
            Signo signo21 = new Signo("Libreria", R.drawable.ciudad_libreria);
            realm.copyToRealm(signo21);
            Signo signo22 = new Signo("Luz", R.drawable.ciudad_luz);
            realm.copyToRealm(signo22);
            realm.commitTransaction();
            return new AtomicInteger(0);
        }
    }
}
