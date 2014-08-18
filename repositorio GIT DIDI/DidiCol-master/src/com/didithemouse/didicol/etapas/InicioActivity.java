package com.didithemouse.didicol.etapas;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.didithemouse.didicol.MyAbsoluteLayout.LayoutParams;
import com.didithemouse.didicol.R;

public class InicioActivity extends EtapaActivity implements
View.OnTouchListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		title = getString(R.string.didielraton);
		setContentView(R.layout.inicio);
		mySurfaceView = (InicioSurfaceView) this
				.findViewById(R.id.surface_view);
		badgeDrawable = (R.drawable.badge_didi_small);
		etapa = EtapaEnum.INICIO;
		genericInicialization();
	}


	@Override
	void setObjects() {
		//deben ser los tama�os originales / 1.85                                                        x,y
		posiciones[0] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 954, 596); //hoja
		posiciones[1] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 346, 396); //banca
		//posiciones[2] = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 385, 132); //Polera

		//PONER EN EL ORDEN ANTERIOR !!
		drawables = new int[] {R.drawable.west_village_hoja,
				R.drawable.west_village_banca,
			//	R.drawable.inicio_polera
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
		overlay.setForeground(getResources().getDrawable(R.drawable.inicio_overlay));
	} */
}
