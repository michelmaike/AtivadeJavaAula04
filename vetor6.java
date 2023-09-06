public class vetor6 {
    public static void main(String[] args){
        Float[] precocompra = new Float[100];
        Float[] precovenda = new Float[100];
        Float lucro;
        int totlucromenor10, totlucromenor20, totlucromaior20, A;

        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;

        for(A=0; A<100; A++){
            System.out.println("Preço de compra: ");
            precocompra[A] = Float.parseFloat(System.console().readLine());
            System.out.println("Preço de venda: ");
            precovenda[A] = Float.parseFloat(System.console().readLine());
        }
        for(A=0; A<100; A++){
            lucro = precovenda[A] - precocompra[A];
            if(lucro < 10){
                totlucromenor10++;
            }else if(lucro <= 20){
                totlucromenor20++;
            }else{
                totlucromaior20++;
            }
        }
        System.out.println("Total de mercadorias com lucro < 10 % "+totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: "+totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: "+totlucromaior20);
        System.out.println("");
    }
}
