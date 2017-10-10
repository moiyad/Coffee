package com.example.moiyad.mycoffeedemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

        private TextView mTextMessage;
        private ListView listView;

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                listView.setVisibility(View.GONE);

                switch (item.getItemId()) {
                    case R.id.navigation_profile:

                        return true;
                    case R.id.navigation_menu:
                        listView.setVisibility(View.VISIBLE);
                        return true;
                    case R.id.navigation_order:

                        return true;
                }
                return false;
            }

        };

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu);

            listView =(ListView)findViewById(R.id.list_view);
            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        }


}
