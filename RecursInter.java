package FibAtvdd;

public class RecursInter{
    public int FibonacciRecurs(int n){
        if(n == 0){
            return 0;
        }else if(n ==1){
            return 1;
        }else{
            return FibonacciRecurs(n -1) + FibonacciRecurs(n - 2);
        }
    }

    //Atividade feita por Sarah

    public int FibonacciInter(int numero){
        if(numero <= 1){
            return numero;
        }
        int anteces = 0;
        int antecesDOIS = 1;

        for(int i = 2; i <= numero; i++){
            int atual = anteces + antecesDOIS;
            anteces = antecesDOIS;
            antecesDOIS = atual;
        }
        return antecesDOIS;
    }
}