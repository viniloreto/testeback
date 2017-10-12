
package viniciusloretotesteback;


public class CostumerAccount {
    private int id_costumer;
    private String cpf_cnpj;
    private String nm_costumer;        
    private double vl_total;
    private boolean is_active;

    public int getId_costumer() {
        return id_costumer;
    }

    public void setId_costumer(int id_costumer) {
        this.id_costumer = id_costumer;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNm_costumer() {
        return nm_costumer;
    }

    public void setNm_costumer(String nm_costumer) {
        this.nm_costumer = nm_costumer;
    }

    public double getVl_total() {
        return vl_total;
    }

    public void setVl_total(double vl_total) {
        this.vl_total = vl_total;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
    
    
}
