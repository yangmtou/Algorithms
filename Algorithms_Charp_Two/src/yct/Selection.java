package yct;

/**
 * ѡ�������㷨
 * @author yangmtou
 *���ڳ���ΪN�����飬ѡ��������Ҫ��ԼN*N/2�αȽϺ�N�ν���
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
