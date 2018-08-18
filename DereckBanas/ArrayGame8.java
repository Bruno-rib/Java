package DereckBanas;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayGame8 {
	
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard () {		
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	
	public static void redrawBoard () {
		int k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		for (char[] row : battleBoard) {
			for (char column : row) {
				System.out.print("|" + column + "|");
			}
			System.out.println();
		}
		
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
	}
	
	//constant
	public final String TOMBSTONE = "Here lies a Dead monster";
	
	//class variables or fields. Only the objects can change the value
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	
	private boolean alive = true;
	
	//public variables. The less public fields the better
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numOfMonsters = 0;
	
	//access the value of attack without the option of modifying
	public int getAttack () {
		return attack;
	}
	//accessor methods
	public int getMovement() {
		return movement;
	}
	
	public int getHealth () {
		return health;
	}
	
	public boolean getAlive () {
		return alive;
	}
	
	//modify the values following a specific parameter detailed inside method
	public void setHealth (int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	//overloaded method for function setHealth to accept two different data types
	public void setHealth (double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public void moveMonster (ArrayGame8[] monster, int arrayItemIndex) {
		
		//is the space open?
		boolean isSpaceOpen = true;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		while (isSpaceOpen) {
			
			int randMoveDirection = (int) (Math.random() * 4);
			int randMoveDistance = (int) (Math.random() * this.getMovement() + 1);
			
			//check if everything is running right
			System.out.println(randMoveDistance + " " + randMoveDirection);
			
			//erase monster old position
			battleBoard[this.yPosition][this.xPosition]= '*';
			
			if (randMoveDirection == 0) {
				if ((this.yPosition - randMoveDistance) < 0) {
					this.yPosition = 0;
				} else {
					this.yPosition = this.yPosition - randMoveDistance;
				}
			} else if (randMoveDirection == 1) {
				if ((this.xPosition + randMoveDistance) > maxXBoardSpace) {
					this.xPosition = maxXBoardSpace;
				} else {
					this.xPosition = xPosition + randMoveDistance;
				}
			} else if (randMoveDirection == 2) {
				if ((this.yPosition + randMoveDistance) > maxYBoardSpace) {
					this.yPosition = maxYBoardSpace;
				} else {
					this.yPosition = yPosition + randMoveDistance;
				}
			} else {
				if ((this.xPosition - randMoveDistance) < 0) {
					this.xPosition = 0;
				} else {
					this.xPosition = this.xPosition - randMoveDistance;
				}
			}
			
			for (int i = 0; i < monster.length; i++) {
				
				//check against all monsters but not against itself
				if (i == arrayItemIndex) {
					continue;
				}
				
				if (onMySpace(monster, i, arrayItemIndex)) {
					
					isSpaceOpen = true;
					break;
					
				} else {
					isSpaceOpen = false;
				}
			}
			
		} // END OF WHILE LOOP
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
	} //END OF MOVE MONSTER
	
	public boolean onMySpace(ArrayGame8[] monster, int indexToChck1, int indexToChck2 ) {
		
		if ((monster[indexToChck1].xPosition) == (monster[indexToChck2].xPosition)
				&& (monster[indexToChck1].yPosition) == (monster[indexToChck2].yPosition)) {
			return true;
		} else {
			return false;
		}
		
	} //END OF onMySpace
	

	public ArrayGame8 (int health, int attack, int movement, String name) {
		
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while (battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
		numOfMonsters++;
		
	}

	public ArrayGame8 () {
		numOfMonsters++;
	}
	
	public static void main (String[] args) {
		
		ArrayGame8.buildBattleBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		//Created 4 objects at once!!!!
		ArrayGame8[] Monsters = new ArrayGame8[4];
		
		Monsters[0] = new ArrayGame8(1000, 20, 1, "Frank");
		Monsters[1] = new ArrayGame8(500, 40, 2, "Drac");
		Monsters[2] = new ArrayGame8(1000, 20, 1, "Paul");
		Monsters[3] = new ArrayGame8(1000, 20, 1, "George");
		
		ArrayGame8.redrawBoard();
		
		for (ArrayGame8 m : Monsters) {
			//index of current monster
			if (m.getAlive()) {
				
				int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				m.moveMonster(Monsters, arrayItemIndex);
				
			}
			
		}
		ArrayGame8.redrawBoard();
	}
	
	
	
	
}
