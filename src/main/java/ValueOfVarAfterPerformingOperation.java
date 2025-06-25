public class ValueOfVarAfterPerformingOperation {
    public static void main(String[] args) {
        String [] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
        public static int finalValueAfterOperations(String[] operations) {
            int x=0;
            for(String s:operations){
                if(s.charAt(1)=='-'){
                    --x;
                }
                else {
                    ++x;
                }
            }
            return x;
        }


}
