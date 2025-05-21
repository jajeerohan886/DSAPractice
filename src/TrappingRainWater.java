public class TrappingRainWater {

    public int calculateTrapperWater(int[] arr) {
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0] = arr[0];
        rmax[rmax.length-1] = arr[arr.length-1];

        for(int i=1;i<arr.length;i++) {
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        for(int i=rmax.length-2;i>=0;i--) {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        int totalWater = 0;
        for(int i=0;i<arr.length;i++) {
            totalWater += Math.min(lmax[i], rmax[i])-arr[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int totalWater = trappingRainWater.calculateTrapperWater(arr);
        System.out.println(totalWater);
    }

}
