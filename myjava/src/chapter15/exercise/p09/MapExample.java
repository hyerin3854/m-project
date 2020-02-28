package chapter15.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int avg = 0;// 점수 합계 저장

//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > maxScore) {
//				maxScore = entry.getValue();
//				name = entry.getKey();
//			}
//		avg = avg + entry.getValue();
//		}
		
		Set <String> keys =map.keySet();
		for(String key:keys) {
			int v= map.get(key);
			if (v>maxScore) {
				maxScore=v;
				name=key;
				}
			avg += v;
			}
		avg = avg / map.size();

		System.out.println("평균점수:" + avg);
		System.out.println("최고점수:" + maxScore);
		System.out.println("최고점수를 받은 아이디:" + name);
	}

}
