package br.com.company.artigoII;

public class ExemploArray {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
//        array[10] = 10;

        int outroArray[] = new int[2];

        var arraySemTipoExplicito = new int[10];

        int[] arrayInicializado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(arrayInicializado[3]);

        arrayInicializado[0] = 10;
        System.out.println(arrayInicializado[0]);

        for (int indice = 0; indice < arrayInicializado.length; indice++){
            System.out.println(arrayInicializado[indice]);
        }

        for (int indice: arrayInicializado) {
            System.out.println(indice);
        }

        int[][] arrayDimensional = { {1, 2, 3, 4}, {5, 6, 7} };

        System.out.println(arrayDimensional[0][2]);

        for (int i = 0; i < arrayDimensional.length; i++) {
            for(int j = 0; j < arrayDimensional[i].length; j++) {
                System.out.println(arrayDimensional[i][j]);
            }
        }

        int[][] outroArrayDimensional = new int[4][3];


    }
}
