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
            Categoria adjetivosAdverbiosVerbos = new Categoria("Adjetivos, Advervios y Verbos", R.drawable.ciudad_categoria);
            realm.copyToRealm(adjetivosAdverbiosVerbos);
            Categoria calendario = new Categoria("Calendario", R.drawable.ciudad_categoria);
            realm.copyToRealm(calendario);
            Categoria casa = new Categoria("Casa", R.drawable.ciudad_categoria);
            realm.copyToRealm(casa);
            Categoria colegio = new Categoria("Colegio", R.drawable.ciudad_categoria);
            realm.copyToRealm(colegio);
            Categoria comidasYBebidas = new Categoria("Calendario", R.drawable.ciudad_categoria);
            realm.copyToRealm(comidasYBebidas);
            Categoria cuerpo = new Categoria("Cuerpo", R.drawable.ciudad_categoria);
            realm.copyToRealm(cuerpo);
            Categoria familia = new Categoria("Familia", R.drawable.ciudad_categoria);
            realm.copyToRealm(familia);
            Categoria naturaleza = new Categoria("Naturaleza", R.drawable.ciudad_categoria);
            realm.copyToRealm(naturaleza);
            Categoria ropa = new Categoria("Ropa", R.drawable.ciudad_categoria);
            realm.copyToRealm(ropa);
            Categoria saludosPreguntas = new Categoria("Saludos y Preguntas", R.drawable.ciudad_categoria);
            realm.copyToRealm(saludosPreguntas);
            Signo ciudad1 = new Signo("Acera", R.drawable.ciudad_acera, ciudad.getId());
            realm.copyToRealm(ciudad1);
            Signo ciudad2 = new Signo("Ambulancia", R.drawable.ciudad_ambulancia, ciudad.getId());
            realm.copyToRealm(ciudad2);
            Signo ciudad3 = new Signo("Autobus", R.drawable.ciudad_autobus, ciudad.getId());
            realm.copyToRealm(ciudad3);
            Signo ciudad4 = new Signo("Biblioteca", R.drawable.ciudad_biblioteca, ciudad.getId());
            realm.copyToRealm(ciudad4);
            Signo ciudad5 = new Signo("Banco Dinero", R.drawable.ciudad_banco_dinero, ciudad.getId());
            realm.copyToRealm(ciudad5);
            Signo ciudad6 = new Signo("Banco Sentar", R.drawable.ciudad_banco_sentar, ciudad.getId());
            realm.copyToRealm(ciudad6);
            Signo ciudad7 = new Signo("Bicicleta", R.drawable.ciudad_bicicleta, ciudad.getId());
            realm.copyToRealm(ciudad7);
            Signo ciudad8 = new Signo("Bombero", R.drawable.ciudad_bombero, ciudad.getId());
            realm.copyToRealm(ciudad8);
            Signo ciudad9 = new Signo("Buzon", R.drawable.ciudad_buzon, ciudad.getId());
            realm.copyToRealm(ciudad9);
            Signo ciudad10 = new Signo("Calle", R.drawable.ciudad_calle, ciudad.getId());
            realm.copyToRealm(ciudad10);
            Signo ciudad11 = new Signo("Camion", R.drawable.ciudad_camion, ciudad.getId());
            realm.copyToRealm(ciudad11);
            Signo ciudad12 = new Signo("Cine", R.drawable.ciudad_cine, ciudad.getId());
            realm.copyToRealm(ciudad12);
            Signo ciudad13 = new Signo("Acera", R.drawable.ciudad_ciudad, ciudad.getId());
            realm.copyToRealm(ciudad13);
            Signo ciudad14 = new Signo("Ciudad Barca", R.drawable.ciudad_ciudad_barca, ciudad.getId());
            realm.copyToRealm(ciudad14);
            Signo ciudad15 = new Signo("Coche", R.drawable.ciudad_coche, ciudad.getId());
            realm.copyToRealm(ciudad15);
            Signo ciudad16 = new Signo("Colegio", R.drawable.ciudad_colegio, ciudad.getId());
            realm.copyToRealm(ciudad16);
            Signo ciudad17 = new Signo("Columpio", R.drawable.ciudad_columpio, ciudad.getId());
            realm.copyToRealm(ciudad17);
            Signo ciudad18 = new Signo("Farola", R.drawable.ciudad_farola, ciudad.getId());
            realm.copyToRealm(ciudad18);
            Signo ciudad19 = new Signo("Fuente", R.drawable.ciudad_fuente, ciudad.getId());
            realm.copyToRealm(ciudad19);
            Signo ciudad20 = new Signo("Hospital", R.drawable.ciudad_hospital, ciudad.getId());
            realm.copyToRealm(ciudad20);
            Signo ciudad21 = new Signo("Libreria", R.drawable.ciudad_libreria, ciudad.getId());
            realm.copyToRealm(ciudad21);
            Signo ciudad22 = new Signo("Luz", R.drawable.ciudad_luz, ciudad.getId());
            realm.copyToRealm(ciudad22);
            Signo ciudad23 = new Signo("Medico", R.drawable.ciudad_medico, ciudad.getId());
            realm.copyToRealm(ciudad23);
            Signo ciudad24 = new Signo("Moto", R.drawable.ciudad_moto, ciudad.getId());
            realm.copyToRealm(ciudad24);
            Signo ciudad25 = new Signo("Moto", R.drawable.ciudad_museo, ciudad.getId());
            realm.copyToRealm(ciudad25);
            Signo ciudad26 = new Signo("Paso de Cebra", R.drawable.ciudad_paso_de_cebra, ciudad.getId());
            realm.copyToRealm(ciudad26);
            Signo ciudad27 = new Signo("Pasteleria", R.drawable.ciudad_pasteleria, ciudad.getId());
            realm.copyToRealm(ciudad27);
            Signo ciudad28 = new Signo("Pastelero", R.drawable.ciudad_pastelero, ciudad.getId());
            realm.copyToRealm(ciudad28);
            Signo ciudad29 = new Signo("Pescador", R.drawable.ciudad_pescador, ciudad.getId());
            realm.copyToRealm(ciudad29);
            Signo ciudad30 = new Signo("Plaza", R.drawable.ciudad_plaza, ciudad.getId());
            realm.copyToRealm(ciudad30);
            Signo ciudad31 = new Signo("Policia", R.drawable.ciudad_policia, ciudad.getId());
            realm.copyToRealm(ciudad31);
            Signo ciudad32 = new Signo("Profesiones", R.drawable.ciudad_profesiones, ciudad.getId());
            realm.copyToRealm(ciudad32);
            Signo ciudad33 = new Signo("Profesor", R.drawable.ciudad_profesor, ciudad.getId());
            realm.copyToRealm(ciudad33);
            Signo ciudad34 = new Signo("Puente", R.drawable.ciudad_puente, ciudad.getId());
            realm.copyToRealm(ciudad34);
            Signo ciudad35 = new Signo("Quiosco", R.drawable.ciudad_quiosco, ciudad.getId());
            realm.copyToRealm(ciudad35);
            Signo ciudad36 = new Signo("Semaforo", R.drawable.ciudad_semaforo, ciudad.getId());
            realm.copyToRealm(ciudad36);
            Signo ciudad37 = new Signo("Supermercado", R.drawable.ciudad_supermercado, ciudad.getId());
            realm.copyToRealm(ciudad37);
            Signo ciudad38 = new Signo("Teatro", R.drawable.ciudad_teatro, ciudad.getId());
            realm.copyToRealm(ciudad38);
            Signo ciudad39 = new Signo("Tienda", R.drawable.ciudad_tienda, ciudad.getId());
            realm.copyToRealm(ciudad39);
            Signo ciudad40 = new Signo("Tobogan", R.drawable.ciudad_tobogan, ciudad.getId());
            realm.copyToRealm(ciudad40);
            Signo ciudad41 = new Signo("Transporte", R.drawable.ciudad_transporte, ciudad.getId());
            realm.copyToRealm(ciudad41);
            Signo ciudad42 = new Signo("Vehiculo", R.drawable.ciudad_vehiculo, ciudad.getId());
            realm.copyToRealm(ciudad42);
            Signo ciudad43 = new Signo("Zapateria", R.drawable.ciudad_zapateria, ciudad.getId());
            realm.copyToRealm(ciudad43);
            Signo ciudad44 = new Signo("Ciudad", R.drawable.ciudad_ciudad, ciudad.getId());
            realm.copyToRealm(ciudad44);
            realm.commitTransaction();
            return new AtomicInteger(0);
        }
    }
}
