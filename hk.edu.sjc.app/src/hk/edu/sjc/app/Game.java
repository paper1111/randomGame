package hk.edu.sjc.app;

import java.util.Random;

import processing.core.PApplet;
import processing.core.PFont;
 
public class Game extends PApplet {
	
	int randomNum = generateRandomCode();
	boolean[] pressed = new boolean[10];
	
    public static void main(String[] args) {
        String[] a = {"MAIN"};
        PApplet.runSketch(a, new Game());
    }
 
    public void settings(){
        size(610, 610); 
    }
 
    public void setup() {
    	
    }
 
    public void draw() {

    	PFont font;
    	font = createFont("MyriadPro-Regular", 18);
    	textFont(font);
        background(51,153,355);
        for(int i = 0;i <= 10; i++) {
        	stroke(102,255,255,50);
        	strokeWeight(2);
        	fill(102,255,255);
        	int l = i * 60;
        	rect(10 + l,560,40,40,8);
        	fill(0);
        	text(i,10 + l - 5 + 20,585);
        }
        fill(102,255,255);
        font = createFont("MyriadPro-Regular", 40);
    	textFont(font);
    	textAlign(CENTER);
        text("Welcome to the guessing game!\nClick a number to guess!",305,255);
    }
    
    public void mouseClicked() {
    	System.out.println(mouseX + " " + mouseY);
    }
    
    private int generateRandomCode() {
		int code = -1;
		Random r = new Random();
		code = r.nextInt(10);
		return code;
	}
}

