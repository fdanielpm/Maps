package com.fdaniel.interestingplaces;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private int lugar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lugar = 1;
        if( getIntent()!=null && getIntent().getExtras()!=null) {
            String lg = getIntent().getExtras().getString("lugar");
            lugar = Integer.parseInt(lg);
        }
        setContentView(R.layout.activity_maps);
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
        double lat = 0;
        double lng = 0;
        String placeName = "";
        switch (lugar){
            default:
            case 1:
                placeName = getResources().getString(R.string.place_01 );
                lat = Double.parseDouble( getResources().getString(R.string.lat_place_01) );
                lng = Double.parseDouble( getResources().getString(R.string.lng_place_01) );
                break;
            case 2:
                placeName = getResources().getString(R.string.place_02 );
                lat = Double.parseDouble( getResources().getString(R.string.lat_place_02) );
                lng = Double.parseDouble( getResources().getString(R.string.lng_place_02) );
                break;
            case 3:
                placeName = getResources().getString(R.string.place_03 );
                lat = Double.parseDouble( getResources().getString(R.string.lat_place_03) );
                lng = Double.parseDouble( getResources().getString(R.string.lng_place_03) );
                break;
            case 4:
                placeName = getResources().getString(R.string.place_04 );
                lat = Double.parseDouble( getResources().getString(R.string.lat_place_04) );
                lng = Double.parseDouble( getResources().getString(R.string.lng_place_04) );
                break;
        }
        LatLng defaultLatLng = new LatLng( lat, lng );
        mMap.addMarker(new MarkerOptions().position(defaultLatLng).title( placeName ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(defaultLatLng));
    }
}
