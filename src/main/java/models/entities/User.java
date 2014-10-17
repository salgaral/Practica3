package models.entities;

import java.util.HashMap;
import java.util.Map;

public class User {
	private int id;
	private String name;
	private Map<Integer, Round> rounds = new HashMap<Integer, Round>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, Round> getRounds() {
		return rounds;
	}
	public void setRounds(Map<Integer, Round> rounds) {
		this.rounds = rounds;
	}


}
