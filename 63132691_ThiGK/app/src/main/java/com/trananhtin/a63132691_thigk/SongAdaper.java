package com.trananhtin.a63132691_thigk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdaper extends BaseAdapter {
    //Nguon du lieu
    private List<Song> lstDataSource;
    private LayoutInflater inflater;
    private Context context;
    //Constructor

    public SongAdaper(List<Song> lstDataSource, Context context) {
        this.lstDataSource = lstDataSource;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }
    //inner class
    class SongItemViewHolder{
        ImageView picView;
        TextView singerView;
        TextView viewerView;
    }
    @Override
    public int getCount() {
        return lstDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return lstDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SongItemViewHolder itemViewHolder;
        if (view==null)
        {
            view=inflater.inflate(R.layout.song_custom_item,null);
            itemViewHolder=new SongItemViewHolder();
            itemViewHolder.picView=view.findViewById(R.id.imageViewPic);
            itemViewHolder.singerView=view.findViewById(R.id.textViewSinger);
            itemViewHolder.viewerView=view.findViewById(R.id.textViewViewer);
            view.setTag(itemViewHolder);
        }
        else{
            itemViewHolder =(SongItemViewHolder)view.getTag();
        }
        Song songItem=lstDataSource.get(i);
        itemViewHolder.singerView.setText(songItem.getSinger());
        itemViewHolder.viewerView.setText("View: "+songItem.getViewer());
        int picId=getImgIDbyResName(songItem.getPic());
        itemViewHolder.picView.setImageResource(picId);
        return view;
    }
    public int getImgIDbyResName(String resName){
        String packageName=context.getPackageName();
        int imgId=context.getResources().getIdentifier(resName,"mipmap",packageName);
        return imgId;
    }
}

