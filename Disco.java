
public class MoldearDisco {
	
	private Double radioInterior;
	private Double radioExterior;
	
	public void Disco(Double radioInterior,Double radioExterior){
		
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
		
	}
	
	public Double calculoPerimetroInterior(){
		
		Double perimetroInterior;
		perimetroInterior=2*3.141592*radioInterior;
		return perimetroInterior;
		
	}
	
	public Double calculoPerimetroExterior(){
		
		Double perimetroExterior;
		perimetroExterior=2*3.141592*radioExterior;
		return perimetroExterior;
		
	}
	
	public Double calculoSuperficieTotalDelDisco(){
		
		Double superficieRadioInterior;
		Double superficieRadioExterior;
		Double superficieDelDisco;
		superficieRadioInterior=3.141592*Math.pow(radioInterior, radioInterior);
		superficieRadioExterior=3.141592*Math.pow(radioExterior, radioExterior);
		superficieDelDisco=superficieRadioInterior+superficieRadioExterior;
		return superficieDelDisco;
		
	}
}
