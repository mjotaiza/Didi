package com.didithemouse.didicol.etapas;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;

public class ChinatownSurfaceView extends EtapaSurfaceView {

	public ChinatownSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void setupRenderer() {
		this.handler = new Handler();
		mRenderer = new ChinatownRenderer(this.context, 2.996f, 0.983f, this,
				this.handler);
		setRenderer(mRenderer);

		// Always render the view (scroller).
		// TODO: revisar como hacerlo solo when there is a change
		setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
	}
}
