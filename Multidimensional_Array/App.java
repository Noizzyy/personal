public class App{
    public static void main(String[] args) {
        
        char[][] threebythree = {
        //   0    1    2
           {'A', 'B', 'C'},
           {'D', 'E', 'F'},
           {'G', 'H', 'I'},
           {'J', 'K', 'L'},
           {'M', 'N', 'O'},
        };

        // System.out.println(threebythree[1][1]);
        // System.out.println(threebythree[2][0]);
        // System.out.println(threebythree[0][1]);

        // for(int row = 0; row< 3; row++){

        //     for(int colum = 0; colum < threebythree.length; colum++){
        //     System.out.print(threebythree[row][colum]);
        //     }  
        //     System.out.println(" ");
        // }
        // for(int row = 2; row >= 0; row--){

        //     for(int column = 2; column >= 0; column--){
        //     System.out.print(threebythree[row][column]);
        //     }  
        //     System.out.println(" ");
        // }

        // for (int i = 0; i < threebythree.length; i++) {

        //     for (int row = 0; row < threebythree.length; row++) {
        //         int column = i + row;
        //         if (column % 2 == 0){
        //             System.out.print(threebythree[i][row] + " ");
        //         }else{
        //             System.out.print(" " + " ");
        //         }
        //     }
        //         System.out.println();
        // }
        
        for (int row = 0; row < threebythree.length; row++) {

            for (int column = 0; column < threebythree[row].length; column++) {
                if (row % 2 == 0) {
                   if (column % 2 == 0) {
                    System.out.print(threebythree[row][column]);
                   }
                   else{
                        System.out.print(" ");
                   }
                }
                else{
                    if (column % 2 == 1) {
                        System.out.print(threebythree[row][column]);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
