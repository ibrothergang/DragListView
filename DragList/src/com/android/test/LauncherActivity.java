package com.android.test;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.test.draglistview.DragListActivity;

public class LauncherActivity extends ListActivity {

	public static final String[] options = { "DragListActivity"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = null;

		switch (position) {
			default:
			case 0:
				intent = new Intent(this, DragListActivity.class);
				break;
		}

		startActivity(intent);
	}

}