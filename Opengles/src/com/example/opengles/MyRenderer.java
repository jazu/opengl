package com.example.opengles;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

public class MyRenderer implements GLSurfaceView.Renderer {
	@Override
	public void onSurfaceCreated(GL10 unused, EGLConfig config) {
		GLES20.glClearColor(1.0f, 0.5f, 0.5f, 1.0f);
	}
	@Override	
	public void onDrawFrame(GL10 unused) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}
	@Override	
	public void onSurfaceChanged(GL10 unused, int width, int height) {
		GLES20.glViewport(0, 0, width, height);
	}
}

class Triangle {
	private FloatBuffer vertexBuffer;
	
	static final int COORDS_PER_VERTEX = 3;
	static float triangleCoords[] = {
		0.0f, -0.5f, 0.0f, //
		0.5f, 0.0f, 0.0f, // oikea piste
		-0.5f, 0.0f, 0.0f // vasen piste
	};
	float color[] = { 1.0f, 0.98f, 0.0f, 1.0f}; // R, G, B, A = läpinäkyvyys. f = float eli desimaali
	
	public Triangle() {
		ByteBuffer bb = ByteBuffer.allocateDirect (triangleCoords.length * 4);
		
		bb.order(ByteOrder.nativeOrder());
		
		vertexBuffer.put(triangleCoords);
		
		vertexBuffer.position(0);
	}
	
}