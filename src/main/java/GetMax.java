public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int largestInt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largestInt < arr[i]){
                largestInt = arr[i];
            }
        }
        return largestInt;
    }
}

//set first index to placeholder
//check placeholder with next index
//if placeholder lesser than next index, replace placeholder
//else continue the check
//terminate at the end of the array