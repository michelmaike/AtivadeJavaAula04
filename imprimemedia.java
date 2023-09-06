public class imprimemedia {
    public static void main(String[] args){

        int L;
        String[] nomes = new String[5];
        float[] pr1 = new float[5];
        float[] pr2 = new float[5];
        float[] media = new float[5];

        for(L=0; L<=4; L++){
            System.out.println("Digite "+(L+1)+" nome ");
            nomes[L] = System.console().readLine();
            System.out.println("Digite a 1ª nota: ");
            pr1[L] = Float.parseFloat(System.console().readLine());
            System.out.println("Digite a 2ª nota: ");
            pr2[L] = Float.parseFloat(System.console().readLine());
            media[L] = (pr1[L] + pr2[L])/2;

        }

        System.out.println("");
        System.out.println("\t\t\t\t\t Relacao Final");
        System.out.println("");

        for(L=0; L<=4; L++){
            System.out.println((L+1)+"- "+nomes[L]);
            System.out.println("N1 \t N2 \t Media");
            System.out.println(pr1[L]+"\t"+pr2[L]+"\t"+media[L]);
        }
        System.out.println("Fim Programa");
    }
}
