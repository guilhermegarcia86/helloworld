package br.com.company.artigoII;

public class ExemploBreakContinue {
    public static void main(String[] args) {

//        for (int i = 0; i <= 10; i++){
//            System.out.println("i = " + i);
//            if(i == 5){
//                System.out.println("Vai sair do for no valor 5");
//                break;
//            }
//            System.out.println("Proxima iteracao");
//        }

//        int i = 0;
//        while (i <= 10){
//            System.out.println("i = " + i);
//            if(i == 7){
//                System.out.println("Vai sair do while no valor 7");
//                break;
//            }
//            i++;
//        }

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Vai pular no valor 5");
                continue;
            }
            System.out.println("i = " + i);
            System.out.println("Proxima iteracao");
        }

        System.out.println("Finalizou");
    }
}
