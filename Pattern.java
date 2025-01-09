public class Pattern {
    static void hollow(int Trows,int Tcols){
        for(int i=1;i<=Trows;i++){
            for(int j=1;j<=Tcols;j++){

                if(i==1 || i==Trows || j==1 || j==Tcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(10,10);
    }
}
