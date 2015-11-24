package DotCom;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;

	public void setname(String name) {
		this.name = name;
	}

	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public String checkYourself(String userInput) {
		int index = locationCells.indexOf(userInput);
		String result = "miss";

		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("You sunk " + name + " :( ");
			} else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}
