public class enq85 {
    public static void main(String[] args) throws Exception {
        String frase;
        int op, x, tam;
        do{
            System.out.println("MENU");
            System.out.println("1- Imprime o comprimento da frase");
            System.out.println("2- Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3- Imprime a frase espelhada");
            System.out.println("4- Termina o algoritmo");
            System.out.println("Digite a opção desejada: ");
            op = Integer.parseInt(System.console().readLine());
            switch(op){
                case 1:
                    System.out.println("Digite uma frase: ");
                    frase = System.console().readLine();
                    System.out.println("Numero de caracteres da frase:"+frase.length());
                    break;
                case 2:
                    System.out.println("Digite uma frase");
                    frase = System.console().readLine();
                    System.out.println("Os dois primeiros caracteres: "+frase.substring(0,2));
                    System.out.println("Os dois ultimos caracteres: "+frase.substring(frase.length()-2,frase.length()));
                    break;
                case 3:
                    System.out.println("Digite uma frase");
                    frase = System.console().readLine();
                    for(x = frase.length() - 1; x >= 0; x--){
                        System.out.print(frase.charAt(x));
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção nao disponivel");
                    break;

            }
            System.out.println("");

        }while(op != 4);
    }
}
