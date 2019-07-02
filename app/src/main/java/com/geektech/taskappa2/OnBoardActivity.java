package com.geektech.taskappa2;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoardActivity extends AppCompatActivity {
    SectionPagerAdapter adapter;
    ViewPager viewPager;
    Button button;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        viewPager =findViewById(R.id.view_pager);
        viewPager =findViewById(R.id.view_pager);
        adapter = new SectionPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        button=findViewById(R.id.button2);
        tabLayout = findViewById(R.id.table_layout);
        tabLayout.setupWithViewPager(viewPager,true);

    }

    public void onCancel() {
        Intent intent = new Intent(OnBoardActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public class  SectionPagerAdapter  extends FragmentPagerAdapter{

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt ("pos",i);
            BoardFragment boardFragment =new BoardFragment();
            boardFragment.setArguments(bundle);
            return  boardFragment;
        }

        @Override
        public int getCount() {
            return 3;
        }


}
    }

