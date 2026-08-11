class Solution {
    void segregate0and1(int[] arr) {

        int officer = 0;
        int cm = 0;
        int n = arr.length;

        while (cm < n) {

            if (arr[cm] == 0) {

                int temp = arr[cm];
                arr[cm] = arr[officer];
                arr[officer] = temp;

                officer++;
            }

            cm++;
        }
    }
}