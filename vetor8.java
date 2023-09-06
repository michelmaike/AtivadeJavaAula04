public class vetor8 {
    public static void main(String[] args){
        int[] ultdia = new int[12];
        int data, i, dia, mes;
        String[] signo = new String[12];
        
        for(i=0; i<12; i++){
            System.out.println("Digite o signo");
            signo[i] = System.console().readLine();
            System.out.println("Digite o último dia: ");
            ultdia[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
        data = Integer.parseInt(System.console().readLine());
        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;
            if(dia > ultdia[mes]){
                mes = (mes + 1) % 12;
            }
            System.out.println("Signo: "+signo[mes]);
            System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = Integer.parseInt(System.console().readLine());
        }
        System.out.println("");
    }
}
