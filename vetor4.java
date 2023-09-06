public class vetor4 {
    public static void main(String[] args){
        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        Float[] pr1 = new Float[15];
        Float[] pr2 = new Float[15];

        for(L=0; L<=14; L++){

            System.out.println("Digite "+(L+1)+" nome: ");
            nomes[L] = System.console().readLine();
            while(nomes[L].length() > 30){
                System.out.println("Nomes com até 30 caracteres");
                System.out.println("Digite"+(L+1)+" nome: ");
                nomes[L] = System.console().readLine();
            }
            t = (30 - nomes[L].length());

            for(c=1; c<=t; c++){
                nomes[L] = nomes[L] + " ";
            }
            System.out.println("Digite a 1ª nota: ");
            pr1[L] = Float.parseFloat(System.console().readLine());
            System.out.println("Digite a 2ª nota: ");
            pr2[L] = Float.parseFloat(System.console().readLine());
            media[L] = (int) ((pr1[L] + pr2[L])/2 + 0.0001);

            if(media[L] >= 5){
                sit[L] = "AP";
            }else{
                sit[L] = "RP";
            }
        }
        System.out.println("\t\t\t\t\t\t RELAÇÃO FINAL");
        System.out.println("");
        System.out.println("");
        for(L=0; L<=14; L++){
            System.out.println((L+1)+"- "+nomes[L]+"\t"+pr1[L]+"\t"+pr2[L]+"\t"+media[L]+"\t"+sit[L]);
        }
        System.out.println("");
    }
}
