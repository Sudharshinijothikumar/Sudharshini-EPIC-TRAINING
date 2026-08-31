class Main {
    public static void main(String[] args) {
         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         int s1=0,s2=0;
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                 if(i+j<=arr.length-1){
                     s1+=arr[i][j];
                 }
             }
         }
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                 if(i+j>=arr.length-1){
                     s2+=arr[i][j];
                 }
             }
         }
 
        System.out.println(s1 > s2 ? s1 : s2);
 
    }
}

//secondary diagonal split-i+j<n-1; i+j>n-1
//main diagonal i<=j or i>=j

