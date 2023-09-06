public class procuranomepelonumero {
    public static void main(String[] args){
        int L, num;
        String[] nomes = new String[5];

        for(L=0; L<=4; L++){
            System.out.println("nome "+(L+1)+": ");
            nomes[L] = System.console().readLine();
        }

        System.out.println("Digite o número da pessoa: ");
        num = Integer.parseInt(System.console().readLine());

        while(num < 1 || num > 5){
            System.out.println("Número fora do intervalo");
            System.out.println("Digite o numero da pessoa: ");
            num = Integer.parseInt(System.console().readLine());
        }
        System.out.println(nomes[num-1]);
        System.out.println("");
    }
}
