package com.expandable.listview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.expandable.listview.bean.Node;

import java.util.List;

/**
 * Created by Baiguang on 2015/1/21.
 * 实现 ExpandListViewAdapter
 */
public class SimpleExpandListViewAdapter<T> extends ExpandListViewAdapter<T> {
    /**
     * 适配器构造函数
     *
     * @param listView           ListView控件
     * @param context            程序上下文
     * @param data               数据集合
     * @param defaultExpandLevel 默认展开层级数
     * @throws IllegalAccessException
     */
    public SimpleExpandListViewAdapter(ListView listView, Context context, List<T> data,
            int defaultExpandLevel) throws IllegalAccessException {
        super(listView, context, data, defaultExpandLevel);
    }

    /**
     * 创建Listview Item 的view,
     * 要做到为不同层级的item指定不同的view，需要在该方法里判断Node层级
     * @param node
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getConvertView(Node node, int position, View convertView, ViewGroup parent) {
        switch (node.getLevel()){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return null;
    }
}
