
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        var l=" ";
        for(int i=0;i<arr.length; i++){
            if(arr[i].length()>l.length()){
                 l= arr[i];
            }
        }
        return l;
    }
}
