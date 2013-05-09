package com.android.test.draglistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;

import com.fengjian.test.R;

public class DragListActivity extends Activity {    
    private DragListAdapter adapter = null;
    ArrayList<String> data=new ArrayList<String>();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drag_list_main);
        
        initData();
        
        DragListView dragListView = (DragListView)findViewById(R.id.other_drag_list);
        adapter = new DragListAdapter(this, data);
        dragListView.setAdapter(adapter);
    }
    
    public void initData(){
        //数据结果
    	data = new ArrayList<String>();        
        for(int i=0; i<24; i++){
        	data.add("A选项"+i);
        }
    }
}