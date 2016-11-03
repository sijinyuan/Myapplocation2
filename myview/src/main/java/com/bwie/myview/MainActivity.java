package com.bwie.myview;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;
import com.bwie.myview.adapter.GvAdapter;
import com.bwie.myview.adapter.LvAdapter;
import com.bwie.myview.bean.Gvphoto;
import com.bwie.myview.bean.lvphoto;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private int [] gvimg=new int[]{R.drawable.gv1,
           R.drawable.gv2,R.drawable.gv3,R.drawable.gv4,
           R.drawable.gv5,R.drawable.gv6,R.drawable.gv7,
           R.drawable.gv8,R.drawable.gv9};
    private String[] lvnames=new String[]{"第四届”甘肃黄河文学奖“拟奖名单公示",
            "第四届”甘肃黄河文学奖“拟奖名单公示","第四届”甘肃黄河文学奖“拟奖名单公示",
            "第四届”甘肃黄河文学奖“拟奖名单公示","第四届”甘肃黄河文学奖“拟奖名单公示",
            "第四届”甘肃黄河文学奖“拟奖名单公示","第四届”甘肃黄河文学奖“拟奖名单公示",
            "第四届”甘肃黄河文学奖“拟奖名单公示","第四届”甘肃黄河文学奖“拟奖名单公示"};
    private ListView lv;
    private GridView gv;
    private ArrayList<Gvphoto> gvp;
    private ArrayList<lvphoto> lvp;
    private LvAdapter lvadapter;
    private GvAdapter gvadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();
        gvData();
        lvData();
        lv=(ListView)findViewById(R.id.lv);
        gv=(GridView)findViewById(R.id.gv);
        lvadapter=new LvAdapter(lvp,MainActivity.this);
        lv.setAdapter(lvadapter);
        gvadapter=new GvAdapter(gvp,MainActivity.this);
        gv.setAdapter(gvadapter);

    }

    private void lvData() {
        lvp=new ArrayList<lvphoto>();
        for(int i=0;i<lvnames.length;i++){
            lvphoto lvph=new lvphoto(R.mipmap.ic_launcher,lvnames[i],"2016-08-09");
            lvp.add(lvph);
        }
    }

    private void gvData() {
        gvp=new ArrayList<Gvphoto>();
        for(int i=0;i<gvimg.length;i++){
           Gvphoto gvph=new Gvphoto(gvimg[i],"作家协会");
            gvp.add(gvph);

        }
    }


}
