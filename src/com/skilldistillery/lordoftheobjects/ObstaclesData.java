package com.skilldistillery.lordoftheobjects;

public class ObstaclesData {

	private String name;
	private int damage;
	private int cost;
	
	public ObstaclesData() {
		
	}

	public ObstaclesData(String name, int damage, int cost) {
		this.name = name;
		this.damage = damage;
		this.cost = cost;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getObstacle() {
		return name + " " + damage + " " + cost;
									

	}
}
