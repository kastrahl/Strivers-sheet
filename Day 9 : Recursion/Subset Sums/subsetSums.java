https://practice.geeksforgeeks.org/problems/subset-sums2234/1


class Solution{
    
    ArrayList<Integer> convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0 ; i < ret.length ; i++){ 
            ret[i] = integers.get(i).intValue();
        }
        //int[] sumnext = new int[ret.length];
        ArrayList<Integer> sumnext = new ArrayList();
        int sum=0;
        return subsumhelper(ret, 0, ret.length-1, sum, sumnext);
    }
    
    ArrayList<Integer> subsumhelper(int[] ret,int l, int r,int sum, ArrayList<Integer> sumnext){
        if( l > r ){
            sumnext.add(sum) ;
            return sumnext;
        }
        
        // Subset including arr[l]
        subsumhelper(ret, l + 1, r, sum + ret[l], sumnext);
        // Subset excluding arr[l]
        subsumhelper(ret, l + 1, r, sum, sumnext);
        return sumnext;
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
    
        ArrayList<Integer> list=new ArrayList();
        
        return convertIntegers(arr);
    }
}
