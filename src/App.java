import uniderp.poo.escola.dominio.Aviao;
import uniderp.poo.escola.dominio.Caminhao;
import uniderp.poo.escola.dominio.Carro;
import uniderp.poo.escola.dominio.Motocicleta;
import uniderp.poo.escola.dominio.Onibus;

public class App {
    public static void main(String[] args) throws Exception {

    Carro c1 = new Carro(0, "Nivus", "Nivus Sport", "Branco Perolado", "938101f", "BRA2873F", 2019, 2019, 2, 1000.0, 1234.0, 5, 4, "Volskwagen", 125, "Flex", "Victor Teixeira","MS", "Campo Grande", "Terrestre", 1, 4, "903810FT", 4);


    Aviao a1 = new Aviao(2, "Airbus", "A320", "Cinza", "0", "0", 2015, 2014, 2, 55000, 60000, 60, 8, "Airbus", 100000, "QAV", "Rodrigo Freitas", "MS", "Campo grande", null, 4, 60, "89031280TF", 6);
        
      
    Motocicleta m1 = new Motocicleta(2312, "Titan", "CG150", "Preto", "290381092", "BRA1213F", 2004, 2003, 2, 250.0, 270.0, 2, 2, "Honda", 70, "flex", "Roberto Lanche", "MS", "Campo Grande", "Motocicleta", 1, 2, "938120938019f");    
    
        
    Onibus o1 = new Onibus(3213, "Onibus Escolar", "HFY3211", "Verde", "903810h", "BRAJS62", 2017, 2016, 2, 2500.0, 3000.0, 20, 8, "Mercedez-Benz", 400, "Diesel", "Mercedez", "MS", "Campo grande", "Onibus", 2, 0, null, 6);    
      

    Caminhao h1 = new Caminhao(83092, "Truck", "Cavalo Trucado", "Marrom Terra", "987319GY", "BRAS34F", 1984, 1983, 3, 1500.0, 1700.0, 3, 6, "Mercedez-Benz", 150.0, "Diesel", "Sampaio Souza", "MS", "Campo Grande", "Terrestre", 1, 3, null, 2); 
        
    c1.imprimir();    
      
    a1.imprimir();

    m1.imprimir();

    o1.imprimir();

    h1.imprimir();

    }

}
