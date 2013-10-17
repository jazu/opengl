package com.example.opengles;

import javax.microedition.khronos.opengles.GL10;

import android.opengl.EGLConfig;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

public class OpenGLES20 extends Activity {
	
	private GLSurfaceView mGLView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGLView = new MyGLSurfaceView(this);
		setContentView(mGLView);
	}
}

class MyGLSurfaceView extends GLSurfaceView {
	public MyGLSurfaceView(Context context) {
		super(context);
		
		setRenderer(new MyRenderer());
		
		setEGLContextClientVersion(2);
		
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}
}

public class MyGL20Renderer implements GLSurfaceView.Renderer {
	public void onSurfaceCreated(GL10 unused, EGLConfig config) {
		GLES20.glClearColor(0,5f, 0.5f, 0.5f);
	}
	
	public void onDrawFrame(GL10 unused) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}
	
	public void onSurfaceChanged(GL10 unused, int width, int height) {
		GLES20.glViewport(0, 0, width, height);
	}
}






