class Solution {
    public int reverse(int x) {
        String str=Integer.toString(x);
        StringBuilder sb=new StringBuilder();
        int i=0;
        if(str.charAt(0)=='-'){
            sb.append('-');
            i=1;
        }
        for(int j=str.length()-1;j>=i;j--){
            sb.append(str.charAt(j));
        }
        long result=Long.parseLong(sb.toString());
        if(result<Integer.MAX_VALUE && result>Integer.MIN_VALUE){
            return (int)result;
        }
        else{
            return 0;
        }

    }
}