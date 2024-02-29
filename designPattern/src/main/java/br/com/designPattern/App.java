package br.com.designPattern;

import br.com.designPattern.Singleton.GeradorNumeroSerial;
import br.com.designPattern.Singleton.GeradorNumeroSerialEnum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*   String oQueFabricar="carro";
       
       AbstractVeiculoFactory factory=null;
       
       if(oQueFabricar.equals("van"))
    	   factory=new CarroFactory();
       else
    	   factory=new VanFactory();
       
       Carcaca carcaca = factory.criarCarcaca();
       Chassis chassis = factory.criarChassis();
       Janela janela = factory.criarJanela();
       
       System.out.println(carcaca.getCarcaca());
       System.out.println(chassis.getChassis());
       System.out.println(janela.getJanela()); */
    	
    
    	/*Director director = new Director();

        
       CarroBuilder builder = new CarroBuilder();
       director.construirCarroSport(builder);

       Carro car = builder.getResultado();
       System.out.println("Carro built:\n" + car.getTipo());


       CarroManualBuilder manualBuilder = new CarroManualBuilder();

        
       director.construirCarroSport(manualBuilder);
       Manual carroManual = manualBuilder.getResult();
       System.out.println("\nCarro manual built:\n" + carroManual.toString()); */
    	
    /*   Veiculo hatch = VeiculoFactory.fazer(Categoria.CARRO, TipoVeiculo.HATCH,Cor.VERMELHO);
       Veiculo microOnibus = VeiculoFactory.fazer(Categoria.VAN, TipoVeiculo.MICRO_ONIBUS,Cor.PRETO);
       
       System.out.println(hatch.toString());
       System.out.println(microOnibus.toString());*/
    	
    /*   VeiculoManager veiculoManager = new VeiculoManager();
    	
       Veiculo hatch = veiculoManager.criarHatch();	
       Veiculo furgao = veiculoManager.criarFurgao();
       
       System.out.println(hatch.toString());
       System.out.println(furgao.toString());
       
       VeiculoManagerLazy veiculoManagerLazy = new VeiculoManagerLazy();
       
       Veiculo esportivo = veiculoManagerLazy.criarEsportivo();
       Veiculo microOnibus = veiculoManagerLazy.criarMicroOnibus();
       
       
       System.out.println(esportivo.toString());
       System.out.println(microOnibus.toString());*/
       
       System.out.println("Uso tradicional singleton");
       GeradorNumeroSerial gerador = GeradorNumeroSerial.getInstance();
       
       System.out.println("próximo serial: "+gerador.getProximoSerial());
       System.out.println("próximo serial: "+gerador.getProximoSerial());
       System.out.println("próximo serial: "+gerador.getProximoSerial());
       
       
       System.out.println("Uso enum singleton");
       System.out.println("próximo veiculo: "+ GeradorNumeroSerialEnum.VEICULO.getProximoSerial());
       System.out.println("próximo veiculo: "+ GeradorNumeroSerialEnum.VEICULO.getProximoSerial());
       System.out.println("próximo motor: "+ GeradorNumeroSerialEnum.MOTOR.getProximoSerial());
       System.out.println("próximo veiculo: "+ GeradorNumeroSerialEnum.VEICULO.getProximoSerial());
       System.out.println("próximo motor: "+ GeradorNumeroSerialEnum.MOTOR.getProximoSerial());
    }
}
