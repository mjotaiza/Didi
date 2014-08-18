package com.didithemouse.didicol.etapas;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.didithemouse.didicol.MyAbsoluteLayout.LayoutParams;
import com.didithemouse.didicol.R;

public class ConeyActivity extends EtapaActivity implements
		View.OnTouchListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		title = getString(R.string.coney);
		setContentView(R.layout.coney);
		mySurfaceView = (ConeySurfaceView) this
				.findViewById(R.id.surface_view);
		badgeDrawable = (R.drawable.badge_bagelshop_small);
		etapa = EtapaEnum.CONEY;
		genericInicialization();
	}
	
	@Override
	void setObjects() {
//deben ser los tama�os originales / 1.85                                                        x,y
		posiciones[0] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 174, 500); //jugo
		posiciones[1] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT,  287, 452); //bagel
	//	posiciones[2] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 926, 400); //Cabritas
	
		//PONER EN EL ORDEN ANTERIOR !!
		drawables = new int[] {R.drawable.bagel_jugo,
				   R.drawable.bagel_bagel,
				 //  R.drawable.coney_cabritas
		};
	}
		
	public static boolean visitedFlag = false;
	@Override
	public void setVisited(){visitedFlag = true;}
	public static boolean isVisited(){return visitedFlag;}
	/*
	@Override
	protected void setOverlay() {
		FrameLayout overlay = (FrameLayout) findViewById(R.id.overlay);
		overlay.setForeground(getResources().getDrawable(R.drawable.coney_overlay));
	} */
}
