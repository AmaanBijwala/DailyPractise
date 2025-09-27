public class LargestTriangleArea {
    public static void main(String[] args) {
        int[][] points={{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }

        public static  double largestTriangleArea(int[][] points) {
            int maxArea=Integer.MIN_VALUE;
            int n=points.length;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                        int area=Math.abs(
                                points[i][0]*(points[j][1]-points[k][1])+
                                        points[j][0]*(points[k][1]-points[i][1])+
                                        points[k][0]*(points[i][1]-points[j][1])
                        );
                        maxArea=Math.max(area,maxArea);
                    }
                }
            }
            return 0.5*(double)(maxArea);
        }

}
