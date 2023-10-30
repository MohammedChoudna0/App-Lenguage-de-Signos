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
            Signo ciudad1 = new Signo("Acera", R.drawable.ciudad_acera);
            realm.copyToRealm(ciudad1);
            Signo ciudad2 = new Signo("Ambulancia", R.drawable.ciudad_ambulancia);
            realm.copyToRealm(ciudad2);
            Signo ciudad3 = new Signo("Autobus", R.drawable.ciudad_autobus);
            realm.copyToRealm(ciudad3);
            Signo ciudad4 = new Signo("Biblioteca", R.drawable.ciudad_biblioteca);
            realm.copyToRealm(ciudad4);
            Signo ciudad5 = new Signo("Banco Dinero", R.drawable.ciudad_banco_dinero);
            realm.copyToRealm(ciudad5);
            Signo ciudad6 = new Signo("Banco Sentar", R.drawable.ciudad_banco_sentar);
            realm.copyToRealm(ciudad6);
            Signo ciudad7 = new Signo("Bicicleta", R.drawable.ciudad_bicicleta);
            realm.copyToRealm(ciudad7);
            Signo ciudad8 = new Signo("Bombero", R.drawable.ciudad_bombero);
            realm.copyToRealm(ciudad8);
            Signo ciudad9 = new Signo("Buzon", R.drawable.ciudad_buzon);
            realm.copyToRealm(ciudad9);
            Signo ciudad10 = new Signo("Calle", R.drawable.ciudad_calle);
            realm.copyToRealm(ciudad10);
            Signo ciudad11 = new Signo("Camion", R.drawable.ciudad_camion);
            realm.copyToRealm(ciudad11);
            Signo ciudad12 = new Signo("Cine", R.drawable.ciudad_cine);
            realm.copyToRealm(ciudad12);
            Signo ciudad13 = new Signo("Acera", R.drawable.ciudad_ciudad);
            realm.copyToRealm(ciudad13);
            Signo ciudad14 = new Signo("Ciudad Barca", R.drawable.ciudad_ciudad_barca);
            realm.copyToRealm(ciudad14);
            Signo ciudad15 = new Signo("Coche", R.drawable.ciudad_coche);
            realm.copyToRealm(ciudad15);
            Signo ciudad16 = new Signo("Colegio", R.drawable.ciudad_colegio);
            realm.copyToRealm(ciudad16);
            Signo ciudad17 = new Signo("Columpio", R.drawable.ciudad_columpio);
            realm.copyToRealm(ciudad17);
            Signo ciudad18 = new Signo("Farola", R.drawable.ciudad_farola);
            realm.copyToRealm(ciudad18);
            Signo ciudad19 = new Signo("Fuente", R.drawable.ciudad_fuente);
            realm.copyToRealm(ciudad19);
            Signo ciudad20 = new Signo("Hospital", R.drawable.ciudad_hospital);
            realm.copyToRealm(ciudad20);
            Signo ciudad21 = new Signo("Libreria", R.drawable.ciudad_libreria);
            realm.copyToRealm(ciudad21);
            Signo ciudad22 = new Signo("Luz", R.drawable.ciudad_luz);
            realm.copyToRealm(ciudad22);
            Signo ciudad23 = new Signo("Medico", R.drawable.ciudad_medico);
            realm.copyToRealm(ciudad23);
            Signo ciudad24 = new Signo("Moto", R.drawable.ciudad_moto);
            realm.copyToRealm(ciudad24);
            Signo ciudad25 = new Signo("Moto", R.drawable.ciudad_museo);
            realm.copyToRealm(ciudad25);
            Signo ciudad26 = new Signo("Paso de Cebra", R.drawable.ciudad_paso_de_cebra);
            realm.copyToRealm(ciudad26);
            Signo ciudad27 = new Signo("Pasteleria", R.drawable.ciudad_pasteleria);
            realm.copyToRealm(ciudad27);
            Signo ciudad28 = new Signo("Pastelero", R.drawable.ciudad_pastelero);
            realm.copyToRealm(ciudad28);
            Signo ciudad29 = new Signo("Pescador", R.drawable.ciudad_pescador);
            realm.copyToRealm(ciudad29);
            Signo ciudad30 = new Signo("Plaza", R.drawable.ciudad_plaza);
            realm.copyToRealm(ciudad30);
            Signo ciudad31 = new Signo("Policia", R.drawable.ciudad_policia);
            realm.copyToRealm(ciudad31);
            Signo ciudad32 = new Signo("Profesiones", R.drawable.ciudad_profesiones);
            realm.copyToRealm(ciudad32);
            Signo ciudad33 = new Signo("Profesor", R.drawable.ciudad_profesor);
            realm.copyToRealm(ciudad33);
            Signo ciudad34 = new Signo("Puente", R.drawable.ciudad_puente);
            realm.copyToRealm(ciudad34);
            Signo ciudad35 = new Signo("Quiosco", R.drawable.ciudad_quiosco);
            realm.copyToRealm(ciudad35);
            Signo ciudad36 = new Signo("Semaforo", R.drawable.ciudad_semaforo);
            realm.copyToRealm(ciudad36);
            Signo ciudad37 = new Signo("Supermercado", R.drawable.ciudad_supermercado);
            realm.copyToRealm(ciudad37);
            Signo ciudad38 = new Signo("Teatro", R.drawable.ciudad_teatro);
            realm.copyToRealm(ciudad38);
            Signo ciudad39 = new Signo("Tienda", R.drawable.ciudad_tienda);
            realm.copyToRealm(ciudad39);
            Signo ciudad40 = new Signo("Tobogan", R.drawable.ciudad_tobogan);
            realm.copyToRealm(ciudad40);
            Signo ciudad41 = new Signo("Transporte", R.drawable.ciudad_transporte);
            realm.copyToRealm(ciudad41);
            Signo ciudad42 = new Signo("Vehiculo", R.drawable.ciudad_vehiculo);
            realm.copyToRealm(ciudad42);
            Signo ciudad43 = new Signo("Zapateria", R.drawable.ciudad_zapateria);
            realm.copyToRealm(ciudad43);
            Signo ciudad44 = new Signo("Ciudad", R.drawable.ciudad_ciudad);
            realm.copyToRealm(ciudad44);
            realm.commitTransaction();
            return new AtomicInteger(0);
        }
    }
}
