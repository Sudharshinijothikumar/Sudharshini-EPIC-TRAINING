class Main {
    public static void main(String[] args) {
        String v1="2.10.3";
        String v2="2.9.15";
        String[] v11=v1.split("\\.");
        String[] v22=v2.split("\\.");
        int n= Math.max(v11.length,v22.length);
        for(int i=0;i<n;i++){
            int x=(i<v11.length)?Integer.parseInt(v11[i]):0;
            int y=(i<v22.length)?Integer.parseInt(v22[i]):0;
 
            if(x>y){
                System.out.print(1);
                return;
            }
            else if(x<y){
                System.out.print(-1);
                return;
            }
        }
        System.out.print(0);
    }
}
