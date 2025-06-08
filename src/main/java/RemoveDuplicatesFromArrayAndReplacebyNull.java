public class RemoveDuplicatesFromArrayAndReplacebyNull {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4, 5};
        int j=0;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[j]){

                j++;
                a[j]=a[i];

            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(a[i]+",");
        }
        for(int i=j+1;i<a.length;i++){
            System.out.print("null,");
        }
    }
}
