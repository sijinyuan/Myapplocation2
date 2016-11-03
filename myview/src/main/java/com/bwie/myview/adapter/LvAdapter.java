package com.bwie.myview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.myview.R;
import com.bwie.myview.bean.lvphoto;

import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class LvAdapter extends BaseAdapter {
    private List<lvphoto> lvp;
    private Context context;

    public LvAdapter(List<lvphoto> lvp, Context context) {
        this.lvp = lvp;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lvp.size();
    }

    @Override
    public Object getItem(int i) {
        return lvp.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.item,null);
        ImageView lvimg=(ImageView)view.findViewById(R.id.lvimg);
        TextView  lvtitle=(TextView)view.findViewById(R.id.lvtv);
        TextView   lvtime=(TextView)view.findViewById(R.id.lvtime);
        lvimg.setImageResource(lvp.get(i).getLvimg());
        lvtitle.setText(lvp.get(i).getLvtitle());
        lvtime.setText(lvp.get(i).getLvtime());
        return view;
    }
}
