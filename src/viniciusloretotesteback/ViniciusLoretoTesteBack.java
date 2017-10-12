package viniciusloretotesteback;

import java.util.Scanner;
import viniciusloretotesteback.CostumerAccount;
import viniciusloretotesteback.Bancodedados;

public class ViniciusLoretoTesteBack {

    public static void main(String[] args) {
        int x = 1;
        double media = 0;
        int count = 0;
        double vet[] = null;
        double auxiliar;

        while (x != 2) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o ID do cliente");
            int id_costumer1 = Integer.parseInt(scan.nextLine());
            System.out.println("Digite o CPF/CNPJ do cliente");
            String cpf_cnpj1 = scan.nextLine();
            System.out.println("Digite o Nome do cliente");
            String nm_costumer1 = scan.nextLine();
            System.out.println("Digite o Saldo do cliente");
            double vl_total1 = Double.parseDouble(scan.nextLine());

            CostumerAccount costumeraccount = new CostumerAccount();
            costumeraccount.setId_costumer(id_costumer1);
            costumeraccount.setCpf_cnpj(cpf_cnpj1);
            costumeraccount.setNm_costumer(nm_costumer1);
            costumeraccount.setVl_total(vl_total1);
            Bancodedados.getCostumerAccount().add(costumeraccount);

            System.out.println("Tecle 1 para cadastrar ou cliente e 2 para encerrar o cadastro");
            int aux = Integer.parseInt(scan.nextLine());
            if (aux == 2) {
                x = 2;
            }

        }

        for (int i = 0; i < Bancodedados.getCostumerAccount().size(); i++) {
            CostumerAccount costumeraccount = Bancodedados.getCostumerAccount().get(i);

            if (costumeraccount.getId_costumer() >= 1500 && costumeraccount.getId_costumer() <= 2700) {
                if (costumeraccount.getVl_total() > 560) {

                    media = costumeraccount.getVl_total() + media;
                    vet[count] = costumeraccount.getVl_total();
                    count++;
                }
            }

        }

        media = media / count;
        for(int i = 0; i<vet.length;i++){
           for(int j = 0; j<vet.length;j++){
              if(vet[i]>vet[j]){
                  auxiliar = i;
                  vet[j]=vet[i];
                  vet[i]=auxiliar;
              }
           }
        }

    }

}
