package com.companyname.col;

import java.util.EnumMap;
import java.util.Map;

enum Coin {
	PENNY, NICKEL, DIME, QUARTER
}

/**
 * The EnumMap class provides a Map implementation whose keys are the members of the same enum.
 * Because an enum map is represented internally as an array, an enum map approaches an array in terms
of performance.
 *
 */
class EnumMapDemo {
	public static void main(String[] args) {
		Map<Coin, Integer> map = new EnumMap<>(Coin.class);
		map.put(Coin.PENNY, 1);
		map.put(Coin.NICKEL, 5);
		map.put(Coin.DIME, 10);
		map.put(Coin.QUARTER, 25);
		System.out.println(map);
		Map<Coin,Integer> mapCopy = new EnumMap<>(map);
		System.out.println(mapCopy);
	}
}
