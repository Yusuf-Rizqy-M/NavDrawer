 package com.example.navdrawerexample;
 import android.os.Bundle;
 import android.view.MenuItem;

 import androidx.annotation.NonNull;
 import androidx.appcompat.app.ActionBarDrawerToggle;
 import androidx.appcompat.app.AppCompatActivity;
 import androidx.appcompat.widget.Toolbar;
 import androidx.drawerlayout.widget.DrawerLayout;

 import com.google.android.material.navigation.NavigationView;

 import fragment.home;
 import fragment.guru;
 import fragment.namaguruproduvtive;
 import fragment.namasiswa;

 public class MainActivity extends AppCompatActivity {
     private DrawerLayout drawerLayout;
     private ActionBarDrawerToggle toggle;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         Toolbar toolbar = findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);

         showHomePage();

         drawerLayout = findViewById(R.id.drawer_layout);
         toggle = new ActionBarDrawerToggle(
                 this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

         drawerLayout.addDrawerListener(toggle);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setHomeButtonEnabled(true);

         NavigationView navigationView = findViewById(R.id.nav_view);
         navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 int itemId = item.getItemId();

                 if (itemId == R.id.home) {
                     showHomePage();
                 } else if (itemId == R.id.menu_item1 ) {
                     getSupportFragmentManager().beginTransaction()
                             .replace(R.id.content_frame, new namasiswa())
                             .commit();
                     getSupportActionBar().setTitle("Nama Siswa");
                 } else if (itemId == R.id.menu_item2) {
                     getSupportFragmentManager().beginTransaction()
                             .replace(R.id.content_frame, new namaguruproduvtive())
                             .commit();
                     getSupportActionBar().setTitle("Guru Productive");
                 } else {
                     getSupportFragmentManager().beginTransaction()
                             .replace(R.id.content_frame, new guru())
                             .commit();
                     getSupportActionBar().setTitle("Guru");
                 }

                 drawerLayout.closeDrawers();
                 return true;
             }
         });
     }

     @Override
     protected void onPostCreate(Bundle savedInstanceState) {
         super.onPostCreate(savedInstanceState);
         toggle.syncState();
     }

     private void showHomePage() {
         getSupportFragmentManager().beginTransaction()
                 .replace(R.id.content_frame, new home())
                 .commit();

         getSupportActionBar().setTitle("Home");
     }

 }