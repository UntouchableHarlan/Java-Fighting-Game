import java.awt.*;
import java.util.ArrayList;
import java.awt.*;
import java.util.*;

/**
 * Created by untouchableharlan on 10/19/16.
 */
public class FightingGame {

    private String characterName;
//    private ArrayList<String> arsenal = new ArrayList<String>();
    private HashMap<String, Integer> arsenal = new HashMap<String, Integer>();
//    private String[] arsenal;
    private int life;

    public FightingGame(String name, HashMap moves, int lifepoints) {
        this.characterName = name;
        this.arsenal = moves;
        this.life = lifepoints;
    }

    public void showMyMoves() {
        int i = 0;
        for (String move : arsenal.keySet()) {
            System.out.println(characterName + " has " + move + " and it cases " + arsenal.get(move) + " damage.");
            System.out.println("Choose " + i + " for " + arsenal.entrySet().toArray()[i].toString().split("=")[0]);
            i++;
        }

//        System.out.println(arsenal);

//        System.out.println(arsenal.entrySet().toArray()[0].toString().split("=")[0]);



    }

    public void idk(FightingGame fighter) {
        System.out.println(characterName + " vs. " + fighter.characterName);
        System.out.println("BEGIN");

        showMyMoves();

        System.out.println("Choose a move to use on you opponent");
        Scanner choose = new Scanner(System.in);
        int numberMove = choose.nextInt();

        switch (numberMove) {
            case 0: System.out.println();
        }
    }

    public void fight(FightingGame fighter) {

        do {
            showMyMoves();
            Scanner choose = new Scanner(System.in);
            System.out.println(characterName + " choose a move!");
            String playerOneMoveNumber = choose.next();

            switch (playerOneMoveNumber) {
                case "0": fighter.life = fighter.life - Integer.parseInt(arsenal.entrySet().toArray()[0].toString().split("=")[1]);
                    System.out.println(characterName + " used " + arsenal.entrySet().toArray()[0].toString().split("=")[0] + " and caused " + arsenal.entrySet().toArray()[0].toString().split("=")[1] + " damage. " + fighter.characterName + " now has " + fighter.life + " life left");
                    break;
                case "1": fighter.life = fighter.life - Integer.parseInt(arsenal.entrySet().toArray()[1].toString().split("=")[1]);
                    System.out.println(characterName + " used " + arsenal.entrySet().toArray()[1].toString().split("=")[0] + " and caused " + arsenal.entrySet().toArray()[1].toString().split("=")[1] + " damage. " + fighter.characterName + " now has " + fighter.life + " life left");
                    break;
                case "2": fighter.life = fighter.life - Integer.parseInt(arsenal.entrySet().toArray()[2].toString().split("=")[1]);
                    System.out.println(characterName + " used " + arsenal.entrySet().toArray()[2].toString().split("=")[0] + " and caused " + arsenal.entrySet().toArray()[2].toString().split("=")[1] + " damage. " + fighter.characterName + " now has " + fighter.life + " life left");
                    break;
                default: System.out.println("Incorrect key entered");
                    break;
            }

            System.out.println(fighter.characterName + " choose a move!");
            String playerTwoMoveNumber = choose.next();

            fighter.showMyMoves();
            switch (playerTwoMoveNumber) {
                case "0": life = life - Integer.parseInt(fighter.arsenal.entrySet().toArray()[0].toString().split("=")[1]);
                    System.out.println(characterName + " used " + fighter.arsenal.entrySet().toArray()[0].toString().split("=")[0] + " and caused " + fighter.arsenal.entrySet().toArray()[0].toString().split("=")[1] + " damage. " + characterName + " now has " + life + " life left");
                    break;
                case "1": fighter.life = fighter.life - Integer.parseInt(fighter.arsenal.entrySet().toArray()[1].toString().split("=")[1]);
                    System.out.println(characterName + " used " + fighter.arsenal.entrySet().toArray()[1].toString().split("=")[0] + " and caused " + fighter.arsenal.entrySet().toArray()[1].toString().split("=")[1] + " damage. " + characterName + " now has " + life + " life left");
                    break;
                case "2": fighter.life = fighter.life - Integer.parseInt(fighter.arsenal.entrySet().toArray()[2].toString().split("=")[1]);
                    System.out.println(characterName + " used " + fighter.arsenal.entrySet().toArray()[2].toString().split("=")[0] + " and caused " + fighter.arsenal.entrySet().toArray()[2].toString().split("=")[1] + " damage. " + characterName + " now has " + life + " life left");
                    break;
                default: System.out.println("Incorrect key entered");
                    break;
            }

        } while (fighter.life <= 0 || life <= 0);

        if (fighter.life <= 0) {
            System.out.println(characterName + " wins!");
        } else {
            System.out.println(fighter.characterName + " wins!");
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> gokuMoveList = new HashMap<String, Integer>();
        gokuMoveList.put("kamehaweha", 200);
        gokuMoveList.put("kaoken", 150);
        gokuMoveList.put("fireball jutsu", 50);
        FightingGame gokuu = new FightingGame("goku", gokuMoveList, 400);

        HashMap<String, Integer> kakashiMoveList = new HashMap<String, Integer>();
        kakashiMoveList.put("lightning blade", 200);
        kakashiMoveList.put("chidori", 150);
        kakashiMoveList.put("kamui", 200);
        FightingGame kakashi = new FightingGame("kakashi", kakashiMoveList, 400);

        gokuu.fight(kakashi);


//        gokuu.useRandomPowerMoveOnFighter(kakashi);
//        kakashi.useRandomPowerMoveOnFighter(gokuu);


    }


}
