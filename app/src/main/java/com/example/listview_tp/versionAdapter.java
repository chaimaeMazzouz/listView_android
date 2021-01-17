package com.example.listview_tp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class versionAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private String title[] = { "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "Q", "R"};
    private String sousTitle[] = { "version: 5.0", "version: 6.0", "version: 7.0", "version: 8.0", "version: 9.0", "version: 10.0", "version: 11.0"};
    private int thumb[] = { R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo, R.drawable.pie, R.drawable.q, R.drawable.r };
    public versionAdapter(MainActivity main){
        layoutInflater =(LayoutInflater)main.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        int pos = position;
        if (listItem == null)
          listItem = layoutInflater.inflate(R.layout.list_item_layout, null);
        ImageView imageView = (ImageView)listItem.findViewById(R.id.icon);
        TextView titre =  listItem.findViewById(R.id.titre);
        TextView sousTitre =  listItem.findViewById(R.id.ss_titre);
        imageView.setBackgroundResource(thumb[pos]);
        titre.setText(title[pos]);
        sousTitre.setText(sousTitle[pos]);
        return listItem;
    }
}
