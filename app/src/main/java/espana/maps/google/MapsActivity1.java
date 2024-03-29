package espana.maps.google;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Madrid
        LatLng madrid = new LatLng(40.4167047, -3.7035825);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Madrid").snippet("La capital de España").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Museo del Prado
        LatLng prado = new LatLng(40.4137994, -3.6920053);
        mMap.addMarker(new MarkerOptions().position(prado).title("Museo del prado").snippet("Uno de los museos más prestigiosos del mundo").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));

        //Parque del Retiro
        LatLng retiro = new LatLng(40.4149393, -3.6832971);
        mMap.addMarker(new MarkerOptions().position(retiro).title("Parque del Retiro").snippet("Uno de los parques más grandes de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.parque)));

        //Hospital 12 de Octubre
        LatLng hospital = new LatLng(40.37546, -3.6959057);
        mMap.addMarker(new MarkerOptions().position(hospital).title("Hospital 12 de Octubre").snippet("Es un hospital pñublico de la ciudad de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        //Camara
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));
    }
}
