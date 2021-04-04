package com.example.yodut;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Button btnTugas, btnKalendar;
    private FragmentTransaction fragmentTransaction;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private Menu menu;
    private FloatingActionButton floatingActionButton;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        if(getSupportActionBar() != null)
//        {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setHomeButtonEnabled(true);
//            getSupportActionBar().setTitle("Navigation");
//        }
//
//        floatingActionButton = findViewById((R.id.fab));
//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//        drawerLayout = findViewById(R.id.placeholder);
//        ActionBarDrawerToggle toggle;
//        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//
//        navigationView = findViewById(R.id.nav_view);
//
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navKalendar, R.id.navTugas)
//                .setDrawerLayout(drawerLayout)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);



//
//        if(getSupportActionBar() != null)
//        {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setHomeButtonEnabled(true);
//            getSupportActionBar().setTitle("Navigation");
//        }

//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
//                toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
//        {
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//        };
//
//        menu = navigationView.getMenu();
//
//        toggle.syncState();
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//               // Toast.makeText(getApplicationContext(), menu.getItem() "Selected", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });


//        fragmentManager = this.getSupportFragmentManager();
//        fragmentManager.beginTransaction()
//                .add(R.id.flFragment, new HomeFragment())
////                .commit();
        btnTugas = (Button) findViewById(R.id.btnTugas);
        btnTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.placeholder, new FragmentTugas());
                fragmentTransaction.commit();

            }
        });
        btnKalendar = (Button) findViewById(R.id.btnKalendar);
        btnKalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.placeholder, new FragmentKalendar());
                fragmentTransaction.commit();
            }
        });


    }

//    private void updateCounter(NavigationView nav) {
//        Menu menu = nav.getMenu();
//        TextView badgeText = menu.findItem(R.id.navTugas).getActionView().findViewById(R.id.text);
//        badgeText.setText("3 new");
//        badgeText.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary_dark));
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }


}