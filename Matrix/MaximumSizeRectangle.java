import java.util.Stack;

public class MaximumSizeRectangle {
         //Maximal Rectangle**********
    public int maximalRectangle(char[][] matrix) { //n * (m + n)
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int histogram[] = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //To create a histogram
                if(matrix[i][j] == '1'){
                    histogram[j]++;
                }
                else{
                    histogram[j] = 0;
                }
            }
            max = Math.max(max, maxAreaInHistogram(histogram));
        }
        return max;
    }
       public static int maxAreaInHistogram(int arr[]) {  //tc n+n+n=3n = O(n)
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right  //O(n)
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next samlller right   //O)n
        s = new Stack<>();
        for(int i =0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area:  width= j-i-1 =nsr[i]-nsl[i]-1   O(n)
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currarea = height * width;
            maxarea = Math.max(currarea, maxarea);
        }
        return maxarea;


    }


    //maximum area in histogram*********
    public int largestRectangleArea(int[] heights) {  //O(n)
        int maxarea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        //next smaller right  //O(n)
        Stack<Integer> s = new Stack<>();
        for(int i =heights.length-1; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next samlller right   //O)n
        s = new Stack<>();
        for(int i =0; i<heights.length; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area:  width= j-i-1 =nsr[i]-nsl[i]-1   O(n)
        for(int i=0; i<heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] -1;
            int currarea = height * width;
            maxarea = Math.max(currarea, maxarea);
        }
         return maxarea;
    
    }

    

    //maximum area of Square**********
    public int maximalSquare(char[][] matrix) { //n * (m + n)
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int histogram[] = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //To create a histogram
                if(matrix[i][j] == '1'){
                    histogram[j]++;
                }
                else{
                    histogram[j] = 0;
                }
            }
            max = Math.max(max, maxSquareAreaInHistogram(histogram));
        }
        return max;
    }
       public static int maxSquareAreaInHistogram(int arr[]) {  //tc n+n+n=3n = O(n)
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right  //O(n)
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next samlller right   //O)n
        s = new Stack<>();
        for(int i =0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area:  width= j-i-1 =nsr[i]-nsl[i]-1   O(n)
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int side = Math.min(height, width);
            int currarea = side * side;
            maxarea = Math.max(currarea, maxarea);
        }
        return maxarea;


    }
}