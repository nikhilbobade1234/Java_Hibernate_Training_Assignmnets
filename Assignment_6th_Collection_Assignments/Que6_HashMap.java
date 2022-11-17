package Assignment_4th_Day_Collection_Assignments;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Population {
	private int id;
	private int population;

	public Population(int id, int population) {
		super();
		this.id = id;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Population [id=" + id + ", population=" + population + "]";
	}

}

public class Que6_HashMap {
	public static void main(String[] args) {
		HashMap<String, Population> slist = new HashMap<>();
		slist.put("Nagpur", new Population(1, 23000));
		slist.put("Amaravati", new Population(2, 63000));

		System.out.println(slist);
		for (Map.Entry<String, Population> e : slist.entrySet())
			System.out.println("CityName = " + e.getKey() + ",  population = " + e.getValue());

	}

}
