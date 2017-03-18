package com.example.android.payor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Nypro on 17-Mar-17.
 */

public class DummyFragment extends Fragment {
	View layoutView = null;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		layoutView = inflater.inflate(R.layout.dummy_frag_layout, container, false);
		return layoutView;
	}

	public void setText(String text){
		TextView messageText = (TextView) layoutView.findViewById(R.id.message_text);
		messageText.setText(text);
	}
}
