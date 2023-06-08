package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	public double x,y; //double pois se trata de uma IA e a velocidade pode alterar
	public int width,height;
	
	public Enemy (int x, int y) {
		this.x = x;
		this.y = y;
		width = 40;
		height = 5;
	}
	public void tick() {
		x+= (Game.ball.x - x - 6) * 0.07;
		
	}
	public void render (Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, width, height);
		
	}
}
