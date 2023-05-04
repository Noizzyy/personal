import java.util.Scanner;
public class actthree{

    static void Selection() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("A = Square\n" + "B = LEft half triangle\n" + "C = Inverted left half tringle\n" + "D = Left hollow half\n" + "E = Inverted Left hallow half tringle\n" + "F = Right half tringle\n" + "G = Inverted Right half\n" + "H = Right Hallow half tringle\n" + "I = Inverted right half\n" + "J = Full tringle\n" + "K = Inverted Full tringle\n" + "L = Full hallow Tringle\n" + "M = Inverted full hollow tringle\n" + "N = Half left Diamond\n" + "O = Half Right Diamond");
        
         
        System.out.print("Enter the selected letter of figure: ");
        String selected = sc.nextLine();
        
        System.out.print("Enter the figureSize of figure: ");
        int figureSize = sc.nextInt();

        sc.close();

        if (selected.equalsIgnoreCase("A")) {
            System.out.println(Square(figureSize));
        }
        else if (selected.equalsIgnoreCase("B")) {
            System.out.println(leftHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("C")) {
            System.out.println(invertedLeftHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("D")) {
            System.out.println(leftHollowHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("E")) {
            System.out.println(invertedLeftHollowHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("F")) {
            System.out.println(rightHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("G")) {
            System.out.println(invertedRightHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("H")) {
            System.out.println(rightHollowHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("I")) {
            System.out.println(invertedRightHollowHalfTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("J")) {
            System.out.println(fullTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("K")) {
            System.out.println(invertedFullTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("l")) {
            System.out.println(fullHollowTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("M")) {
            System.out.println(invertedFullHollowTriangle(figureSize));
        }
        else if (selected.equalsIgnoreCase("N")) {
            System.out.println(halfLeftDiamond(figureSize));
        }
        else if (selected.equalsIgnoreCase("O")) {
            System.out.println(halfRightDiamond(figureSize));
        }
    }

        static String figure = "";

        static String Square (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int c = 1; c <= figureSize; ++c){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }
        
        static String leftHalfTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int c = 1; c <= r; ++c){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedLeftHalfTriangle (int figureSize) {
            for(int r = figureSize; r >= 1; r--){
                for(int c = 1; c <= r; ++c){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String leftHollowHalfTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int c = 1; c <= r; ++c){
                    if(c == 1 || r == figureSize || c == r){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedLeftHollowHalfTriangle (int figureSize) {
            for(int r = figureSize; r >= 1; r--){
                for(int c = 1; c <= r; ++c){
                    if(c == 1 || r == figureSize || c == r){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }
        
        static String rightHalfTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedRightHalfTriangle (int figureSize) {
            for(int r = figureSize; r >= 1; r--){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String rightHollowHalfTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    if(o == 1 || r == figureSize || o == r){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedRightHollowHalfTriangle (int figureSize) {
            for(int r = figureSize; r>=1; r--){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    if(o == 1 || r == figureSize || o==r){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }

        static String fullTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o=1; o<=r*2-1; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedFullTriangle (int figureSize) {
            for(int r = figureSize; r >= 1; r--){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o=1; o<=r*2-1; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }

        static String fullHollowTriangle (int figureSize) {
            for(int r = 1; r <= figureSize; r++){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o=1; o<=r*2-1; ++o){
                    if(o == 1 || r == figureSize || o == r*2-1){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }

        static String invertedFullHollowTriangle (int figureSize) {
            for(int r = figureSize; r >= 1; r--){
                for(int s = figureSize; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r*2-1; ++o){
                    if(o == 1 || r == figureSize || o == r*2-1){
                        figure += "* ";
                    } else {
                        figure += "  ";
                    }
                }
                figure += "\n";
            }
            return figure;
        }

        static String halfLeftDiamond (int figureSize) {
            for(int r = 1; r <= figureSize/2; r++){
                for(int o = 1; o <= r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            for(int r = figureSize/2+1; r>=1; r--){
                for(int o=1; o<=r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure; 
        }

        static String halfRightDiamond (int figureSize) {
            for(int r = 1; r <= figureSize/2; r++){
                for(int s = figureSize/2; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            for(int r = figureSize/2+1; r >= 1; r--){
                for(int s = figureSize/2; s >= r; s-=1){
                    figure += "  ";
                }
                for(int o = 1; o <= r; ++o){
                    figure += "* ";
                }
                figure += "\n";
            }
            return figure;
        }
        
    public static void main(String[] args) {
        Selection();
    }
}
            // System.out.println("A = Square\n" + "B = LEft half triangle\n" + "C = Inverted left half tringle\n" + "D = Left hollow half\n" + "E = Inverted Left hallow half tringle\n" + "F = Right half tringle\n" + "G = Inverted Right half\n" + "H = Right Hallow half tringle\n" + "I = Inverted right half\n" + "J = Full tringle\n" + "K = Inverted Full tringle\n" + "L = Full hallow Tringle\n" + "M = Inverted full hollow tringle\n" + "N = Half left Diamond\n");
        
         
    
