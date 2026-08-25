class SpecialPositionsInABinaryMatrix {


        public int numSpecial(int[][] mat) {
            int r = mat.length;
            int c= mat[0].length;
            int [] rowSum=new int[r];
            int [] colSum=new int[c];
            int count=0;
            //System.out.println("Hii");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    rowSum[i]+=mat[i][j];
                }
                System.out.println("row"+i+"-->"+rowSum[i]+"  \n  ");
            }
            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    colSum[i]+=mat[j][i];
                }
                System.out.println("col"+i+"-->"+colSum[i]+"  \n  ");
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(mat[i][j]==1 && rowSum[i]==1 && colSum[j]==1)
                        count++;
                }
            }
            return count;
        }
    }