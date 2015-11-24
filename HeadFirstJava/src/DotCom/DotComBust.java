package DotCom;

import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<>();
	private int numberOfGuesses = 0;

	public void setUpGame() {

		DotCom one = new DotCom();
		one.setname("First");
		dotComsList.add(one);

		DotCom two = new DotCom();
		one.setname("Second");
		dotComsList.add(two);

		DotCom three = new DotCom();
		three.setname("Third");
		dotComsList.add(three);

		for (DotCom dotCom : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotCom.setLocationCells(newLocation);
		}
	}

	public void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void finishGame() {
		System.out.println("All Dot Coms are dead.");
		if (numberOfGuesses <= 18) {
			System.out.println("It only took you " + numberOfGuesses + " guesses.");
		} else {
			System.out.println("Took you long enough. " + numberOfGuesses + " guesse.");
		}

	}

	private void checkUserGuess(String userGuess) {
		numberOfGuesses++;
		String result = "miss";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		//System.out.println(result);
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
