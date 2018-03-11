class CustomerGuru_Merge {
	public static void merge(int[] arrayA, int[] arrayB, int[] arrayC, int n1, int n2) {
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arrayA[i] < arrayB[j])
				arrayC[k++] = arrayA[i++];
			else
				arrayC[k++] = arrayB[j++];
		}
		while (i < n1)
			arrayC[k++] = arrayA[i++];
		while (j < n2)
			arrayC[k++] = arrayB[j++];
	}

	public static void main(String[] args) {
		int[] arrayA = { 1, 6, 15, 76, 80};
		int[] arrayB = { 9, 50, 56, 90, 100, 102 };
		int n1 = arrayA.length;
		int n2 = arrayB.length;
		int[] arrayC = new int[n1 + n2];
		merge(arrayA, arrayB, arrayC, n1, n2);
		System.out.print("Final Array: ");
		for (int i = 0; i < n1 + n2; i++)
			System.out.print(arrayC[i] + " ");
	}
}