package uniderp.poo.escola.dominio;

public class Motocicleta extends Veiculo{

    

    @Override
    public void imprimir() {
        
        System.out.println("codigo: " + this.codigo);
        System.out.println("estado: " + this.estadoUF);
        System.out.println("cidade: " + this.cidadeUF);
        System.out.println("nome: " + this.nome);
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ano modelo: " + this.anoModelo);
        System.out.println("ano de fabricacao: " + this.anoFabricacao);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Numero de Rodas:" + this.rodas);
        System.out.println("fabricante: " + this.fabricante);
        System.out.println("potencia: " + this.potencia);
        System.out.println("tipo de combustivel: " + this.tipoCombustivel);
        System.out.println("nome do proprietario: " + this.nomePropietario);
        System.out.println("tipo do Veiculo: " + this.tipoVeiculo);
        System.out.println("quantidade de Motores: " + this.qtdeMotores);
        System.out.println("quantidade de Ocupantes: " + this.qtdeOcupantes);
        System.out.println("chassi: " + this.chassi);
        System.out.println("placa: " + this.placa);
        System.out.println("codigo renavam: " + this.codigoRenavam);
        System.out.println("peso liquido: " + this.pesoLiquido);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("eixos:" + this.eixos);
    
    }

    private String codigoRenavam;

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Motocicleta(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, String nomePropietario, String estadoUF,
            String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, eixos, pesoLiquido, pesoTotal,
                assentos, rodas, fabricante, potencia, tipoCombustivel, nomePropietario, estadoUF, cidadeUF,
                tipoVeiculo, qtdeMotores, qtdeOcupantes);
        this.codigoRenavam = codigoRenavam;
    }

    

    
    
}
