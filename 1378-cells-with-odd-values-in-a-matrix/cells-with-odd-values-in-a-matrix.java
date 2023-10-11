class Solution {
  public int oddCells(int m, int n, int[][] indices) {
    int[] rowOddCount = new int[m];
    int[] colOddCount = new int[n];

    for (int[] index : indices) {
        rowOddCount[index[0]]++;
        colOddCount[index[1]]++;
    }

    int totalOddCount = 0;
    int totalEvenCount = 0;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int val = rowOddCount[i] + colOddCount[j];
            if (val % 2 == 1) {
                totalOddCount++;
            } else {
                totalEvenCount++;
            }
        }
    }

    return totalOddCount;
}
}