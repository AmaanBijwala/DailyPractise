class compareVersion {
    public static void main(String[] args){
        String version1="1.2";
        String version2="1.10";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        String[] a=version1.split("\\.");
        String[] b=version2.split("\\.");
        int m=a.length;
        int n=b.length;
        System.out.println("m"+m);
        System.out.println("n"+n);
        for(int i=0;i<Math.max(m,n);i++){

            if(i>=m && Integer.parseInt(b[i])!=0){
                return -1;
            }
            if(i>=n && Integer.parseInt(a[i])!=0){
                return 1;
            }
            if(i<m && i<n){
                if(Integer.parseInt(a[i])<Integer.parseInt(b[i])){
                    return -1;
                }else if(Integer.parseInt(a[i])>Integer.parseInt(b[i])){
                    return 1;
                }}
        }
        return 0;
    }
}