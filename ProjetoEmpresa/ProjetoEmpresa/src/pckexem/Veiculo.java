package pckexem;

public class Veiculo {
    private String placa, marca, modelo;
    private int ano;
    private float quilometragem,preco;

    public Veiculo(String placa, String marca, String modelo, int ano, float quilometragem, float preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", quilometragem=" + quilometragem + ", preco=" + preco + '}';
    }
    
    

    
}
