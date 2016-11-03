package com.bwie.myview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.myview.R;
import com.bwie.myview.bean.Gvphoto;

import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class GvAdapter extends BaseAdapter {
    private List<Gvphoto>  gv1;
    private Context context;

    public GvAdapter(List<Gvphoto> gv1, Context context) {
        this.gv1 = gv1;
        this.context = context;
    }

    @Override
    public int getCount() {
        return gv1.size();
    }

    @Override
    public Object getItem(int i) {
        return gv1.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.gvitem,null);
        ImageView gvimg=(ImageView)view.findViewById(R.id.gvimg);
        TextView  tv=(TextView)view.findViewById(R.id.gvtv);
        gvimg.setImageResource(gv1.get(i).getGvimg());
        tv.setText(gv1.get(i).getGvname());
        return view;
    }
}
