public class Matrix1 {
    public static void main(String[] args) {
        int matr1[][] = new int[3][3];
        int matr2[][] = new int[3][3];
        int itog[][] = new int[3][3];
        matr1=tu(matr1);
        matr2=tu(matr2);
        return69(matr1);
        System.out.println("Вторая матрица : ");
        return69(matr2);
        for(int i=0;i<itog.length;i++){
            for (int u=0;u<itog.length;u++){
                itog[i][u]=matr1[i][u]+matr2[i][u];
            }
        }
        System.out.println("Итог : ");
        return69(itog);
        System.out.println("Умножение");
        for (int i=0;i<itog.length;i++){
            for(int j=0; j<itog.length;j++){
                itog[i][j]=matr1[i][j]*matr2[i][j];
            }
        }
        System.out.println("Итого : ");
        return69(itog);
        System.out.println("Умножение на 5");
        for (int t=0;t<itog.length;t++){
            for(int y=0;y<itog.length;y++){
                itog[t][y]=matr1[t][y]*5;
            }
        }
        System.out.println("Значение : ");
        return69(itog);
        System.out.println("Конец ٩(｡•́‿•̀｡)۶ ");




    }
    static int [][] tu (int yo [][]) {
        for (int i = 0; i < yo.length; i++) {
            for (int j = 0; j < yo[i].length; j++) {
                yo[i][j] = (int) (Math.random() * 10);
            }
        }
        return yo;

    }
    static void return69(int yui [][]){
        for(int i = 0; i< yui.length; i++){
            for(int l=0;l< yui[i].length;l++){
                System.out.print(yui[i][l]+"  ");
            }
            System.out.println();
        }
    }
}