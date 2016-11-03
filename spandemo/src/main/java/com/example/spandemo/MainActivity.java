package com.example.spandemo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private MaskFilterSpan maskFilterSpan;
    private SpannableString spanText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initView();
    }
    private void initView() {
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        setTv1();
        setTv2();
        setTv3();
        setTv4();
        setTv5();
    }

    private void setTv5() {
        spanText = new SpannableString("娃娃哇哇哇哇哇哇哇");
//参数proportion:比例大小
        spanText.setSpan(new ScaleXSpan(3.8f), 3, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv5.append("\n");
        tv5.append(spanText);
    }

    private void setTv4() {
        SpannableString spanText=new SpannableString("日照香炉生紫烟，遥看瀑布挂前川。飞流直下三千尺，疑是银河落九天。");
        spanText.setSpan(new BackgroundColorSpan(Color.GREEN),0,spanText.length(),
             Spannable.SPAN_INCLUSIVE_EXCLUSIVE   );
        tv4.append("\n");
        tv4.append(spanText);
    }

    private void setTv3() {
        //SpannableString与SpannableStringBuilder区别
        //使用SpannableString，必须一次传入，构造完成
        // 1.BackgroundColorSpan 背景色
        SpannableString word = new SpannableString("佀晋元是最棒的！");
        word.setSpan(new BackgroundColorSpan(Color.GREEN), 0, word.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv4.append("\n");
        tv4.append(word);
        //ClickableSpan 文本可点击，有点击事件
        word = new SpannableString("每天进步一点点- http://orgcent.com");
        word.setSpan(new ForegroundColorSpan(Color.RED), 6, word.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv4.append("\n");
        tv4.append(word);

        //使用SpannableStringBuilder,可以使用append()再添加 别的用法和SpannableString一致
        SpannableStringBuilder multiWord = new SpannableStringBuilder();
        multiWord.append("欢迎光临");
        multiWord.append("Harvic的");
        multiWord.append("博客");

        StyleSpan span = new StyleSpan(Typeface.BOLD_ITALIC);
        multiWord.setSpan(span, 0, multiWord.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(multiWord);
    }

    private void setTv2() {
        SpannableString ss = new SpannableString("图片：.");//.作为占位符 用来显示图片
        //获取Drawable资源
        Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        //创建ImageSpan
        ImageSpan span = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
        //提供了不同类型图片的构造方法
        //用ImageSpan替换文本
        ss.setSpan(span, 3, 4, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);

        tv2.setText(ss);
    }

    private void setTv1() {
        //SpannableString文本类，包含不可变的文本但可以用已有对象替换和分离。
        //可变文本类参考SpannableStringBuilder
        SpannableString ss = new SpannableString("红色打电话斜体删除线绿色下划线.");
        System.out.println("length:"+ss.length());
        //不同的Span类 参考http://www.cnblogs.com/jisheng/archive/2013/01/10/2854088.html

        //用颜色标记文本
        ss.setSpan(new ForegroundColorSpan(Color.RED), 0, 2,
                //setSpan时需要指定的 flag,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括).
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用超链接标记文本
        ss.setSpan(new URLSpan("tel:4155551212"), 2, 5,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用样式标记文本（斜体）
        ss.setSpan(new StyleSpan(Typeface.ITALIC), 5, 7,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用删除线标记文本
        ss.setSpan(new StrikethroughSpan(), 7, 10,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用下划线标记文本
        ss.setSpan(new UnderlineSpan(), 10, 16,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用颜色标记
        ss.setSpan(new ForegroundColorSpan(Color.GREEN), 10, 13,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(ss);
    }
}
