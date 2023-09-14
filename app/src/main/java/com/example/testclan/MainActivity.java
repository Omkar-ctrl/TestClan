package com.example.testclan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        imageView=findViewById(R.id.refine);
        tabLayout.setupWithViewPager(viewPager);

        VpAdapter vpAdapter= new VpAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"Personal");
        vpAdapter.addFragment(new Fragment2(),"Business");
        vpAdapter.addFragment(new Fragment3(),"Merchant");
        viewPager.setAdapter(vpAdapter);






        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

                Intent intent = new Intent(MainActivity.this,Refine.class);
                startActivity(intent);            }
        });





    }
}