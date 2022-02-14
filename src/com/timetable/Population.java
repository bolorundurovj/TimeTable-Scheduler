package com.timetable;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * 
 * @author Bolorunduro Valiant-Joshua
 * @version 1.0.0
 */

public class Population {
	
	private ArrayList<Schedule> schedules;
	
	public Population(int size, Data data)
	{
		schedules = new ArrayList<Schedule>(size);
		IntStream.range(0, size).forEach(x -> schedules.add(new Schedule(data).initialize()));
	}
	
	public ArrayList<Schedule> getSchedules()
	{
		return this.schedules;
	}
	
	public Population sortByFitness()
	{
		schedules.sort((schedule1, schedule2) -> {
			int returnValue =0;
			
			if (schedule1.getFitness() > schedule2.getFitness()) returnValue = -1;
			else if (schedule1.getFitness() < schedule2.getFitness()) returnValue = 1;
			return returnValue;
		});
		
		return this;
	}

}
