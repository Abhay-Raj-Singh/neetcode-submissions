class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();   // convert
        Arrays.sort(arr1);               // sort
        String sorted1 = new String(arr1);

        char[] arr2 = t.toCharArray();   // convert
        Arrays.sort(arr2);               // sort
        String sorted2 = new String(arr2);
        if(sorted1.equals(sorted2)){
            return true;
        }
        return false;

    }
}
