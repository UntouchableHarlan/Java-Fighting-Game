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
        for (String move : arsenal.keySet()) {
            System.out.println(characterName + " has " + move + " and it cases " + arsenal.get(move) + " damage.");
        }
    }

    public void useRandomPowerMoveOnFighter(FightingGame fighter) {
        System.out.println(characterName + " " + arsenal.get(0) + "d " + fighter.characterName);

        fighter.life -= arsenal.get(0);

        System.out.println(fighter.characterName + " is now " + fighter.life);

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

        gokuu.showMyMoves();
        kakashi.showMyMoves();

        gokuu.useRandomPowerMoveOnFighter(kakashi);
        kakashi.useRandomPowerMoveOnFighter(gokuu);


    }


}
