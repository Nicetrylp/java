package com.lanou3g.utils;
/**
 * 
 * 工具方法
 *
 */
public class ArrayUtil {
	public static double max(Double[] array) {
		double max = array[0];
		for(int i=1;i<array.length;++i)
		{
			if(max < array[i])
				max = array[i];
		}
		return max;
	}
}
