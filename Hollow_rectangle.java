public class Hollow_rectangle{
    public static void Hollow_rectangle(int TotRows, int TotCols){
        //outer loop
        for(int i=1;i<=TotRows;i++){

            //inner loop
            for(int j=1;j<=TotCols;j++){

                //Boundary condition
                if(i==1 || i==TotRows || j==1 || j== TotCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String args[]){

        Hollow_rectangle(10, 7);

    }
}