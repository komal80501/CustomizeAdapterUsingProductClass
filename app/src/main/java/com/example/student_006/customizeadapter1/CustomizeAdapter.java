package com.example.student_006.customizeadapter1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomizeAdapter extends BaseAdapter {
    //String[]result;
    Context context;
    //int [] imageId;
    ArrayList<Product>itemsArr;

   private static LayoutInflater inflater=null;

    public CustomizeAdapter(Context activity, ArrayList<Product> itemsArr1) {
       // result = prgmNameList;
        context=activity;
        //imageId=prgmImages;
        itemsArr=itemsArr1;

    inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return itemsArr.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {

        TextView tv;
        ImageView img;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView;

        rowView= inflater.inflate(R.layout.list_row,null);
        Holder holder=new Holder();
        holder.tv=(TextView) rowView.findViewById(R.id.textView);
        holder.img=(ImageView) rowView.findViewById(R.id.image);

        holder.tv.setText(itemsArr.get(position).name);
        holder.img.setImageResource(itemsArr.get(position).imgId);

//        holder.tv.setText(itemsArr.get(position).name);
//        holder.img.setImageResource(itemsArr.get(position).imgId);


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context  ,"you clicked"+itemsArr.size(),Toast.LENGTH_LONG).show();
            }
        });
    return rowView;
    }
}
