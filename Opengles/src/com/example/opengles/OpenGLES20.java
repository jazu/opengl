package com.example.opengles;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

public class OpenGLES20 extends Activity {
	
	private GLSurfaceView mGLView; 

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGLView = new MyGLSurfaceView(this);
		setContentView(mGLView);
	}
	@Override
	protected void onPause() {
		super.onPause();
		mGLView.onPause();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mGLView.onResume();
	}
	
}

class MyGLSurfaceView extends GLSurfaceView {
	
	public MyGLSurfaceView(Context context) {
		super(context);
		
		setEGLContextClientVersion(2);
		
		setRenderer(new MyRenderer());
		
		setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
	}
}








