package yct;

/**
 * 选择排序算法
 * @author yangmtou
 *对于长度为N的数组，选择排序需要大约N*N/2次比较和N次交换
 */
public class Selection extends ExampleModule {

	@Override
	public void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if(less(a[j], a[min])){
					min = j;
				}
				exch(a, i, min);
			}
		}
	}

}
