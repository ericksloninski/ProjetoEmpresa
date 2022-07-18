package pckexem;

import java.util.ArrayList;

class Empresa {
    public static Empresa empresa = new Empresa();
    //Importante: o atributo estático 'empresa' será um dado compartilhado, 
    //que poderá ser acessado por todas as janelas e módulos 
    //deste programa. Isto permite compartilhar os dados da empresa
    //(veículos, trabalhadores etc. e seus métodos) entre todas as 
    //partes deste app.
    
    // objetos da classe Trabalhador:
    private ArrayList<Trabalhador> trab = new ArrayList(); 
    // objetos da classe Veiculo:
    private ArrayList<Veiculo> veic = new ArrayList();       
    // diretor e secretário do sindicato:
    private Trabalhador diretor = null; 
    private Trabalhador secretSindicato = null; 
    
    public void adicionarVeiculo(Veiculo novo) {
        veic.add(novo);
    }
    
    public void adicionarTrabalhador(Trabalhador novo) {
        trab.add(novo); //adiciona no ArrayList um novo objeto Trabalhador
    }
    
    public float mediaSalariosEmpresa () {        
        float soma = 0.0f;
        for (int i=0; i < trab.size(); i++) {
            soma += (trab.get(i)).getSalario();
        }
        return (soma/trab.size());
    }
    
    public String getDadosTrabalhadores () {
        String str = "";
        for (int i=0; i < trab.size(); i++) {
            str += trab.get(i).toString() + "\n";
        }
        return (str);
    }
    
    public double getMelhorSalario() {
        double bestSal = 0.0;
        for (int i = 0;i < trab.size(); i++){
            if (bestSal < trab.get(i).getSalario()) {
            bestSal = trab.get(i).getSalario();
            }
        }
        return bestSal;
    }
    
    public float getKmAllVeics() {
     float kmTotal = 0.0f;
        for (int i=0; i < veic.size(); i++) {
            kmTotal += veic.get(i).getQuilometragem();
        }
        return kmTotal;
    }  
    
    
    
    public int getQtdeTrabalhadores() {
        return trab.size();
    }
        
    public int getQtdeVeiculos() {
        return veic.size();
    }
    
} // fim da classe Empresa




