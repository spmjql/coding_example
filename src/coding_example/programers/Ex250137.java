package coding_example.programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex250137 {
	
	private int castingTime = 0;
	private int maxHp = 0;
	private int hp= 0;
	
    public int solution(int[] bandage, int health, int[][] attacks) {
        this.maxHp = health;
        this.hp=health;
        Integer damage = 0;
        
        Map<Integer, Integer> attacksMap = new HashMap<>();
        Arrays.stream(attacks).forEach(ara -> attacksMap.put(ara[0], ara[1]));

        int i=1;
        while(i<=attacks[attacks.length-1][0]) {
        	damage = attacksMap.get(i);
        	if(damage!=null) {
        		attack(damage);
        		if(hp <= 0) return -1;
        	} else if(hp!=maxHp) {
        		bandageHp(bandage);
        	}
        	
        	i++;
        }
        return hp;
    }

    private void bandageHp(int[] bandage) {
    	castingTime++;
    	if (castingTime == bandage[0]) {
    		hp += bandage[2];
    		castingTime = 0;
    	}
    	hp += bandage[1];
    	if (hp >= maxHp) hp = maxHp;
    }
    
    private void attack(int damage) {
    	castingTime = 0;
    	
    	hp -= damage;
    }
}
//붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage
//최대 체력을 의미하는 정수 health
//몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks
//만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return

//bandage는 [시전 시간, 초당 회복량, 추가 회복량] 형태의 길이가 3인 정수 배열입니다.
//attacks[i]는 [공격 시간, 피해량] 형태의 길이가 2인 정수 배열입니다.