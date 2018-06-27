package com.example.student_006.customizeadapter1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
ArrayList<Product>itemArray=new ArrayList<>();
  //  public int[] imageList={R.mipmap.apple_icon,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher};
 //   public String[] nameList={"iphone","vivo","nokia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int item=0;item<10;item++)
        {
            itemArray.add(new Product("iphone7",R.mipmap.apple_icon));
        }
        //CustomizeAdapter adapter= new CustomizeAdapter(this,nameList,imageList);
       // lv.setAdapter(adapter);
        lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(new CustomizeAdapter(this,itemArray));
    }
}
