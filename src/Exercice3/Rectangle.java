package Exercice3;

public class Rectangle {
	private float length;
	private float widht;
	
	public Rectangle () {
		this.length = 1.0f;
		this.widht = 1.0f;
	}
	
	public Rectangle (float length, float width) {
		this.length = length;
		this.widht = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return widht;
	}
	
	public void setLength (float newLength) {
		this.length = newLength;
	}
	
	public void setWidth (float newWidht) {
		this.widht = newWidht;
	}
	
	public float getArea () {
		return this.length * this.widht;
	}
	
	public float getPerimeter () {
		return (this.length + this.widht) * 2;
	}
	
	public String toString() {
		   return "Rectangle[length=" + this.length + " width=" + this.widht + "]";
		}
	
}
