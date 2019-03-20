public class Bicho {
    private String nome;
    private int energia;
    private int maxEnergia;
    private int saciedade;
    private int maxSaciedade;
    private int limpeza;
    private int maxLimpeza;
    private int diamante;
    private int idade;
    private boolean vivo;


    public Bicho(String nome, int energia, int saciedade, int limpeza){
        this.nome = nome;
        this.energia = energia;
        this.maxEnergia = energia;
        this.saciedade = saciedade;
        this.maxSaciedade = saciedade;
        this.limpeza= limpeza;
        this.maxLimpeza = limpeza;
        this.diamante = 0;
        this.idade = 0;
        this.vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= maxEnergia){
            this.energia = maxEnergia;
        }else if (energia <= 0 ){
            this.energia = energia;
            vivo = false;
        }else {
            this.energia = energia;
        }
    }

    public int getMaxEnergia() {
        return maxEnergia;
    }

    public void setMaxEnergia(int maxEnergia) {
        this.maxEnergia = maxEnergia;
    }

    public int getSaciedade() {
        return saciedade;
    }

    public void setSaciedade(int saciedade) {
        if (saciedade >= maxSaciedade){
            this.saciedade = maxSaciedade;
        }else if (saciedade <= 0 ){
            this.saciedade = saciedade;
            vivo = false;
        }else {
            this.saciedade = saciedade;
        }
    }

    public int getMaxSaciedade() {
        return maxSaciedade;
    }

    public void setMaxSaciedade(int maxSaciedade) {
        this.maxSaciedade = maxSaciedade;
    }

    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        if (limpeza >= maxLimpeza){
            this.limpeza = maxLimpeza;
        }else if (limpeza <= 0 ){
            this.limpeza = limpeza;
            vivo = false;
        }else {
            this.limpeza = limpeza;
        }
    }

    public int getMaxLimpeza() {
        return maxLimpeza;
    }

    public void setMaxLimpeza(int maxLimpeza) {
        this.maxLimpeza = maxLimpeza;
    }

    public int getDiamante() {
        return diamante;
    }

    public void setDiamante(int diamante) {
        this.diamante = diamante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return this.nome +
                " E: " + this.energia + "/" + this.maxEnergia +
                " S: " + this.saciedade + "/" + this.maxSaciedade +
                " L: " + this.limpeza + "/" + this.maxLimpeza +
                " D: " + this.diamante + " I: " + this.idade;
    }
    public boolean testeVivo(){
        if (this.vivo){
            return true;
        }else {
            System.out.println("Bicho morreu");
            return false;
        }
    }
    public void brincar(){
        if (!this.testeVivo()){
            return;
        }
        this.setEnergia(this.energia -= 2);
        this.setSaciedade(this.saciedade -= 1);
        this.setLimpeza(this.limpeza -= 2);
        this.diamante += 1;
        this.idade += 1;
    }
    public void comer(){
        if (!this.testeVivo()){
            return;
        }
        this.setEnergia(this.energia -= 1);
        this.setSaciedade(this.saciedade += 4);
        this.setLimpeza(this.limpeza -= 2);
        this.idade += 1;

    }
    public void dormir(){
        if (!this.testeVivo()){
            return;
        }
        if (this.maxEnergia - this.energia< 5){
            System.out.println("fail: nao esta com sono");

        }this.idade += this.maxEnergia - this.energia;
        this.setEnergia(this.getMaxEnergia());


    }
    public void banho(){
        if (!this.testeVivo()){
            return;
        }
        this.setEnergia(this.energia -= 3);
        this.setSaciedade(this.saciedade -= 1);
        this.limpeza = this.maxLimpeza;
        this.idade += 2;
    }
}
