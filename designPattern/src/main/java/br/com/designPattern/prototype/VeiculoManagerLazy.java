package br.com.designPattern.prototype;

public class VeiculoManagerLazy {
	
 private Veiculo hatch,sedan,esportivo,furgao,microOnibus;
	
 public Veiculo criarHatch() {
	 if(hatch==null) {
		 hatch=new Hatch("128CV");
		 return hatch;
	 }else {
		 return (Veiculo) hatch.clone();
	 }
 }
 
 public Veiculo criarSedan() {
	 if(sedan==null) {
		 sedan=new Sedan("150CV");
		 return sedan;
	 }else {
		 return (Veiculo) sedan.clone();
	 }
 }
 

 public Veiculo criarEsportivo() {
	 if(esportivo==null) {
		 esportivo=new Esportivo("252CV");
		 return esportivo;
	 }else {
		 return (Veiculo) esportivo.clone();
	 }
 }
 
 public Veiculo criarFurgao() {
	 if(furgao==null) {
		 furgao=new Furgao();
		 return furgao;
	 }else {
		 return (Veiculo) furgao.clone();
	 }
 }
 
 public Veiculo criarMicroOnibus() {
	 if(microOnibus==null) {
		 microOnibus=new MicroOnibus();
		 return microOnibus;
	 }else {
		 return (Veiculo) microOnibus.clone();
	 }
 }

}
