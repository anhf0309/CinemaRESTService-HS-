class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int[] firstArr = twoDimArray[0];
        System.out.println(firstArr[0] + " " + firstArr[firstArr.length-1]);
        int[] lastArr = twoDimArray[twoDimArray.length-1];
        System.out.println(lastArr[0] + " " + lastArr[lastArr.length-1]);
    }
}