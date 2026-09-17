class Solution {

    public int[] sortedSquares(int[] nums) {

        int arrayLength = nums.length;
        int[] sortedSquares = new int[arrayLength];
        int leftIndex = 0;
        int rightIndex = arrayLength - 1;
        for (
            int resultIndex = arrayLength - 1;
            resultIndex >= 0;
            resultIndex--
        ) {

            int leftSquare = nums[leftIndex] * nums[leftIndex];
            int rightSquare = nums[rightIndex] * nums[rightIndex];
            if (leftSquare > rightSquare) {

                sortedSquares[resultIndex] = leftSquare;
                leftIndex++;

            } else {

                sortedSquares[resultIndex] = rightSquare;
                rightIndex--;
            }
        }

        return sortedSquares;
    }
}
