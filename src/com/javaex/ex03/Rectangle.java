package com.javaex.ex03;

import com.javaex.ex02.Point;

public class Rectangle {

	private int width;
	private int height;

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean equals(Object obj) {
		if (this.width == ((Rectangle) obj).width && this.height == ((Rectangle) obj).height) {
			return true;
		} else {
			return false;
		}
	}

}
